package com.example.danielmartinezg1.ligasantander;

import android.os.Bundle;
import android.support.v4.app.Fragment;
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

public class EquipoFavfragment extends Fragment {
    private List<Jugador> ItemClass;
    public DatabaseReference mDatabase;
    public ValueEventListener eventListener;
    private  ListView listajugadores;
    private EquipoFavAdapter adaptador;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_equipo_favfragment, container, false);

        getActivity().setTitle(R.string.Informacionequipo);
        Bundle parametro = this.getArguments();
        String equipo = parametro.getString("equipo");

        listajugadores = (ListView) view.findViewById(R.id.listViewFav);

        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference().child("Equipos").child("equipo_list").child(equipo).child("jugadorList");

        myRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                GenericTypeIndicator<List<Jugador>> t = new GenericTypeIndicator<List<Jugador>>() {};
                ItemClass = dataSnapshot.getValue(t);
                adaptador = new EquipoFavAdapter(getActivity(), ItemClass);
                listajugadores.setAdapter(adaptador);
            }

            @Override
            public void onCancelled(DatabaseError error) {
                // Failed to read value
                Log.w(TAG, "Failed to read value.", error.toException());
            }
        });

        return view;
    }

}