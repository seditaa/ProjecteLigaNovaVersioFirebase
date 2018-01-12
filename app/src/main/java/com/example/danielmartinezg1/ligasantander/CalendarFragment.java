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

public class CalendarFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        // Inflate the layout for this fragment
      View view = inflater.inflate(R.layout.fragment_calendar, container, false);

        getActivity().setTitle(R.string.calendario);
        // Agafem el string array de les jornades de futbol que hem definit mitjançant un recurs i els fiquem en un string array
        Resources res = getResources();
        String[] jornadas = res.getStringArray(R.array.jornadas);
        // Declarem la llista del layout
        ListView lista = (ListView) view.findViewById(R.id.listViewJornadas);
        // Creem ArrayAdapter amb les jornades que es disputen
        ArrayAdapter adaptador = new ArrayAdapter(getActivity(),
                android.R.layout.simple_list_item_1, jornadas);


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
