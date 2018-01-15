package com.example.danielmartinezg1.ligasantander;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AlertDialog;
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


public class FavoritosFragment extends Fragment  {

    private List<Equipo> ItemClass;
    public DatabaseReference mDatabase;
    public ValueEventListener eventListener;
    private  ListView listafavoritos;
    private FavoritosEquiposAdapter adaptador;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_favoritos, container, false);
        getActivity().setTitle(R.string.favoritos);




        listafavoritos = (ListView) view.findViewById(R.id.equiposaescoger);

        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference().child("Equipos").child("equipo_list");

        myRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                GenericTypeIndicator<List<Equipo>> t = new GenericTypeIndicator<List<Equipo>>() {};
                ItemClass = dataSnapshot.getValue(t);
                adaptador = new FavoritosEquiposAdapter(getActivity(), ItemClass);
                listafavoritos.setAdapter(adaptador);
            }

            @Override
            public void onCancelled(DatabaseError error) {
                // Failed to read value
                Log.w(TAG, "Failed to read value.", error.toException());
            }
        });

        listafavoritos.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int pos, long l) {
                FragmentManager fragmentManager;
                FragmentTransaction fragmentTransaction;
                fragmentManager = getActivity().getSupportFragmentManager();
                fragmentTransaction = fragmentManager.beginTransaction();
                EquipoFavfragment equipoFavfragment = new EquipoFavfragment();

                Bundle bundle = new Bundle();
                String nombrefavorito = Integer.toString(pos);
                bundle.putString("equipo",nombrefavorito );
                equipoFavfragment.setArguments(bundle);
                fragmentTransaction = fragmentTransaction.replace(R.id.content_frame, equipoFavfragment);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });

        return view;


        }



}