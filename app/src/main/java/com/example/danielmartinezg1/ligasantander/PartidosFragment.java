package com.example.danielmartinezg1.ligasantander;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


public class PartidosFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_partidos, container, false);
        getActivity().setTitle("Partidos");
        super.onCreate(savedInstanceState);

        ListView lv = (ListView) view.findViewById(R.id.match_list);

        ArrayList<ItemClasificacion> itemsPartido = obtenerItems();

        ItemClasificacionAdapter adapter = new ItemClasificacionAdapter(this, itemsPartido) {
        };

        lv.setAdapter(adapter);


        return view;
    }


    private ArrayList<ItemClasificacion> obtenerItems() {
        ArrayList<ItemClasificacion> items = new ArrayList<ItemClasificacion>();

        items.add(new ItemClasificacion(1, "Patatas", "Tuberculo",
                "12/01/2012"));
        items.add(new ItemClasificacion(2, "Naranja", "Fruta",
                "cksndlskdc"));
        items.add(new ItemClasificacion(3, "Lechuga", "Verdura",
                "fngbdbgdgb"));

        return items;
    }

}



