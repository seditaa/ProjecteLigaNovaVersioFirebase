package com.example.danielmartinezg1.ligasantander;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ListView;


public class FavoritosFragment extends Fragment implements View.OnClickListener {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_favoritos, container, false);

        getActivity().setTitle(R.string.favoritos);
        ListView listafavsañadidos = (ListView)view.findViewById(R.id.equiposañadidosfav);
        //ArrayAdapter adaptador = new ArrayAdapter(getActivity(),
                //android.R.layout.simple_list_item_1, equiposparaescoger);
        //Possiblemente este adaptador no sirva ya que se van a tener que ir añadiendo los items i los tendremos que coger desde el otro fragment
        Button boton = (Button)view.findViewById(R.id.botonañadir);

        boton.setOnClickListener(this);
        return view;


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