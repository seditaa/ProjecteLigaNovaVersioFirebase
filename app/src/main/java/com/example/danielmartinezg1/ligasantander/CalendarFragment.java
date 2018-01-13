package com.example.danielmartinezg1.ligasantander;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.firebase.ui.database.FirebaseListAdapter;
import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.GenericTypeIndicator;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class CalendarFragment extends Fragment {
    public DatabaseReference mDatabase;
    public ValueEventListener eventListener;
    ListView lista;
    private ArrayAdapter<String> adaptador;
    ArrayList<String> jlist = new ArrayList<>();
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        // Inflate the layout for this fragment
      View view = inflater.inflate(R.layout.fragment_calendar, container, false);

        getActivity().setTitle(R.string.calendario);

        mDatabase = FirebaseDatabase.getInstance().getReference("Jornadas");
        mDatabase.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {

                jlist.clear();
                for (DataSnapshot ds : dataSnapshot.getChildren())
                {
                    String name=ds.getValue(JornadasList.class).getNombre_jornada();
                    jlist.add(name);
                }


               /*
                jlist.clear();
                for (DataSnapshot postSnapshot : dataSnapshot.getChildren()) {
                    Jornadas university = postSnapshot.getValue(Jornadas.class);
                    jlist.add(university);*/
            }


            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
        mDatabase.addValueEventListener(eventListener);

        // Declarem la llista del layout
        lista = (ListView) view.findViewById(R.id.listViewJornadas);
        final List<JornadasList> jlist = new ArrayList<>();
        // Creem ArrayAdapter amb les jornades que es disputen
        adaptador = new ArrayAdapter(getActivity(),
                android.R.layout.simple_list_item_1,jlist);





        lista.setAdapter(adaptador);

        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        //aqui va el codigo para cuando cliques t mande a la jornada que quieres ver

            }
        });




        return view;
    }

}
