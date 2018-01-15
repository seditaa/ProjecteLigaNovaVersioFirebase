package com.example.danielmartinezg1.ligasantander;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.GenericTypeIndicator;
import com.google.firebase.database.ValueEventListener;

import java.util.List;

import static android.content.ContentValues.TAG;

public class GoleadoresFragment extends Fragment {
    private List<Jugador> ItemClass;
    public DatabaseReference mDatabase;
    public ValueEventListener eventListener;
    private  ListView lista_pichichi;
    private GoleadoresAdapter adaptador;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_goleadores, container, false);
        getActivity().setTitle("Goleadores y asistentes");

        lista_pichichi = (ListView) view.findViewById(R.id.listview_gol);

        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference().child("Pichichis").child("pichichi_list");

        myRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                GenericTypeIndicator<List<Jugador>> t = new GenericTypeIndicator<List<Jugador>>() {};
                ItemClass = dataSnapshot.getValue(t);
                adaptador = new GoleadoresAdapter(getActivity(), ItemClass);
                lista_pichichi.setAdapter(adaptador);
                adaptador.notifyDataSetChanged();
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
