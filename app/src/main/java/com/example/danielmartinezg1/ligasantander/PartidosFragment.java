package com.example.danielmartinezg1.ligasantander;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;


public class PartidosFragment extends Fragment {

    private List<ItemClasificacion> ItemClass;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_partidos, container, false);
        getActivity().setTitle("Partidos");
        super.onCreate(savedInstanceState);

        ListView lv = (ListView) view.findViewById(R.id.match_list);

        //ArrayList<ItemClasificacion> itemsPartido = obtenerItems();
        ItemClass  = new ArrayList<ItemClasificacion>();
        ItemClass = obtenerItems();
        ItemClasificacionAdapter adapter = new ItemClasificacionAdapter(getActivity(), ItemClass) {
        };

        lv.setAdapter(adapter);


        return view;
    }


    private ArrayList<ItemClasificacion> obtenerItems() {
        Log.i("Dani","he llegado");

        ArrayList<ItemClasificacion> items = new ArrayList<ItemClasificacion>();

        items.add(new ItemClasificacion("barça", "aldn", "10", "5", "Patatas"));

        items.add(new ItemClasificacion("madri", "Naranja", "1",
                "1", "hoy"));

        return items;
    }

}



