package com.example.danielmartinezg1.ligasantander;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.renderscript.Sampler;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import com.firebase.ui.database.FirebaseIndexRecyclerAdapter;
import com.firebase.ui.database.FirebaseListAdapter;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.GenericTypeIndicator;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

import static android.content.ContentValues.TAG;


public class PartidosFragment extends Fragment {

    private List<Partidos> ItemClass;
    public DatabaseReference mDatabase;
    public ValueEventListener eventListener;
    private ListView lv;
    private ItemClasificacionAdapter adapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_partidos, container, false);
        getActivity().setTitle("Partidos");
        super.onCreate(savedInstanceState);

        lv = (ListView) view.findViewById(R.id.match_list);
        Bundle par = this.getArguments();
        String jornada = par.getString("Jornada");

       // ItemClass  = new ArrayList<Partidos>();
        //ItemClass = obtenerItems();
       // ItemClasificacionAdapter adapter = new ItemClasificacionAdapter(getActivity(), ItemClass) {
        //};

       // lv.setAdapter(adapter);

        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference().child("Jornadas").child("jornadas_list").child(jornada).child("partidos_list");

        myRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                GenericTypeIndicator<List<Partidos>> t = new GenericTypeIndicator<List<Partidos>>() {};
                ItemClass = dataSnapshot.getValue(t);
                adapter = new ItemClasificacionAdapter(getActivity(), ItemClass);
                lv.setAdapter(adapter);
                adapter.notifyDataSetChanged();
            }

            @Override
            public void onCancelled(DatabaseError error) {
                // Failed to read value
                Log.w(TAG, "Failed to read value.", error.toException());
            }
        });

        return view;
    }

    /*private ArrayList<Partidos> obtenerItems() {
        Log.i("Dani","he llegado");

        ArrayList<Partidos> items = new ArrayList<Partidos>();

        items.add(new Partidos("bfsbfbf","barça", "aldn", "10", "5", "Patatas"));

        items.add(new Partidos("jslvnkjsvn","madri", "Naranja", "1",
                "1", "hoy"));

        return items;
    }*/
}



