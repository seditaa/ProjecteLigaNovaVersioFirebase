package com.example.danielmartinezg1.ligasantander;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;


public class FavoritosFragment extends Fragment implements View.OnClickListener {

    private ArrayAdapter<String> adaptador;
    private ArrayList<String> teamlist_escogido;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_favoritos, container, false);
        getActivity().setTitle(R.string.favoritos);

        if(teamlist_escogido==null)teamlist_escogido = new ArrayList<String>();

        ListView listafavsañadidos = (ListView)view.findViewById(R.id.equiposañadidosfav);
        adaptador = new ArrayAdapter(getActivity(),
                android.R.layout.simple_list_item_1, teamlist_escogido);
        listafavsañadidos.setAdapter(adaptador);
        Button boton = (Button) view.findViewById(R.id.botonañadir);

        add_item();

        listafavsañadidos.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View item, final int pos, long id) {
                //maybe_remove_item(pos);
                return true;
            }
        });

        boton.setOnClickListener(this);
        return view;


        }

   /* private void maybe_remove_item(final int pos) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
        builder.setTitle(R.string.confirmation);
        String question = getResources().getString(R.string.question);
        builder.setMessage(question + " " + teamlist_escogido.get(pos) + "?");
        builder.setPositiveButton(R.string.delete, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                teamlist_escogido.remove(pos);
                adaptador.notifyDataSetChanged();
            }
        });
        builder.setNegativeButton(android.R.string.cancel, null);
        builder.create().show();
    }*/

    private void add_item() {
        Bundle b = getArguments();
        if(b==null) return;
        String recibir_item = getArguments().getString("item");
        if(recibir_item!=null){
            teamlist_escogido.add(recibir_item);
            adaptador.notifyDataSetChanged();
        }
    }

    @Override
    public void onClick(View v) {
        FragmentManager fragmentManager;
        FragmentTransaction fragmentTransaction;
        fragmentManager = getActivity().getSupportFragmentManager();
        fragmentTransaction = fragmentManager.beginTransaction();
        EscogerequipoFragment equiposfragment = new EscogerequipoFragment();
        fragmentTransaction.replace(R.id.content_frame, equiposfragment);
        fragmentTransaction.commit();


    }

    }




/*
// Write a message to the database
FirebaseDatabase database = FirebaseDatabase.getInstance();
DatabaseReference myRef = database.getReference("message");

myRef.setValue("Hello, World!");
 */