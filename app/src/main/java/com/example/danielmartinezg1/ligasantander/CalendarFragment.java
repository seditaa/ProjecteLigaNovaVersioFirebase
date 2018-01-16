package com.example.danielmartinezg1.ligasantander;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.GenericTypeIndicator;
import com.google.firebase.database.ValueEventListener;

import java.util.List;

import static android.content.ContentValues.TAG;

public class CalendarFragment extends Fragment {
    private List<JornadasList> ItemClass;
    private  ListView listcalendar;
    private CalendarAdapter adaptador;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflem el layout per aquest fragment
      View view = inflater.inflate(R.layout.fragment_calendar, container, false);
        getActivity().setTitle(R.string.calendario);

        listcalendar = (ListView) view.findViewById(R.id.listViewFav);

        //Referenciem el nostre servidor a Firebase, informant on està la informació a la que ha de accedir
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference().child("Jornadas").child("jornadas_list");

        //Detectem els canvis produits a la referència
        myRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                //Creem la llista amb les dades i apliquem l'adaptador personalitzat creat anteriorment
                //(CalendarAdapter)
                GenericTypeIndicator<List<JornadasList>> t = new GenericTypeIndicator<List<JornadasList>>() {};
                ItemClass = dataSnapshot.getValue(t);
                adaptador = new CalendarAdapter(getActivity(), ItemClass);
                listcalendar.setAdapter(adaptador);
                adaptador.notifyDataSetChanged();
            }

            @Override
            public void onCancelled(DatabaseError error) {
                // Error al llegir els valors
                Log.w(TAG, "Failed to read value.", error.toException());
            }
        });


        listcalendar.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view,  int position, long id) {
                //Comunicació entre fragments per mostrar els partits de la jornada dessitjada
                FragmentManager fragmentManager;
                FragmentTransaction fragmentTransaction;
                fragmentManager = getActivity().getSupportFragmentManager();
                fragmentTransaction = fragmentManager.beginTransaction();
                PartidosFragment PartidosFragment = new PartidosFragment();
                //Creació del Bundle i introducció del número de jornada que es vol visualitzar
                Bundle bundle = new Bundle();
                String numJornada = Integer.toString(position);
                bundle.putString("Jornada",numJornada);
                PartidosFragment.setArguments(bundle);
                //Comunicació amb el fragment PartidosFragment per obrir la jornada sel·leccionada
                fragmentTransaction = fragmentTransaction.replace(R.id.content_frame, PartidosFragment);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();

            }
        });




        return view;
    }

}
