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
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

import static android.content.ContentValues.TAG;


public class PartidosFragment extends Fragment {

    private List<Partidos> ItemClass;
    public DatabaseReference mDatabase;
    public ValueEventListener eventListener;
    private ListView lv;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_partidos, container, false);
        getActivity().setTitle("Partidos");
        super.onCreate(savedInstanceState);

        lv = (ListView) view.findViewById(R.id.match_list);

        ItemClass  = new ArrayList<Partidos>();
        ItemClass = obtenerItems();
        ItemClasificacionAdapter adapter = new ItemClasificacionAdapter(getActivity(), ItemClass) {
        };

        lv.setAdapter(adapter);

        return view;
    }

    private ArrayList<Partidos> obtenerItems() {
        Log.i("Dani","he llegado");

        ArrayList<Partidos> items = new ArrayList<Partidos>();

        items.add(new Partidos("bfsbfbf","barça", "aldn", "10", "5", "Patatas"));

        items.add(new Partidos("jslvnkjsvn","madri", "Naranja", "1",
                "1", "hoy"));

        return items;
    }
}



