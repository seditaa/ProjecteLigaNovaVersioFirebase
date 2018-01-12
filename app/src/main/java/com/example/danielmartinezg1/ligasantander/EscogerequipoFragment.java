package com.example.danielmartinezg1.ligasantander;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;

public class EscogerequipoFragment extends Fragment {

    private ArrayAdapter<String> adaptador;
    private ArrayList<String> teamlist;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_escogerequipo, container, false);

        // Agafem el string array de equips de futbol que hem definit mitjançant un recurs i els fiquem en un string array
        Resources res = getResources();
        String[] equiposparaescoger = res.getStringArray(R.array.nombresequipos);
        teamlist = new ArrayList<>(Arrays.asList(equiposparaescoger));

        // Creem ArrayAdapter amb els equips
        adaptador = new ArrayAdapter<String>(getActivity(),
                android.R.layout.simple_list_item_1, teamlist);

        // Declarem la llista del layout
        ListView lista = (ListView) view.findViewById(R.id.ListaEquiposFavoritos);

        // D. Asignamos el adaptador a nuestra lista
        lista.setAdapter(adaptador);
        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //cada vez que cliques en uno volvera al fragment de favoritos i añadira el equipo al que le hayas dado i volvera a favoritos
                FragmentManager fragmentManager;
                FragmentTransaction fragmentTransaction;
                fragmentManager = getActivity().getSupportFragmentManager();
                fragmentTransaction = fragmentManager.beginTransaction();
                FavoritosFragment favoritosfrag = new FavoritosFragment();

                Bundle ItemSeleccionado = new Bundle();
                String enviar_item = teamlist.get(position);
                ItemSeleccionado.putString("item",enviar_item);
                favoritosfrag.setArguments(ItemSeleccionado);
                fragmentTransaction.replace(R.id.content_frame, favoritosfrag);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });


        return view;


    }

}
