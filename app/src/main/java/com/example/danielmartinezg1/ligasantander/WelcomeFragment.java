package com.example.danielmartinezg1.ligasantander;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;
import java.util.List;

public class WelcomeFragment extends Fragment {
public DatabaseReference mDatabase;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_welcome, container, false);
        getActivity().setTitle("Bienvenido");

        actualizaJornadasPartidos();
        actualizaEquipo();

        return view;
    }

    private void actualizaEquipo() {
        mDatabase = FirebaseDatabase.getInstance().getReference("Equipos");

        List<Jugador> jugadorlist = new ArrayList<Jugador>();

        jugadorlist.add(new Jugador("nombre","4","4"));
        jugadorlist.add(new Jugador("nombre","4","4"));
        jugadorlist.add(new Jugador("nombre","4","4"));
        jugadorlist.add(new Jugador("nombre","4","4"));
        jugadorlist.add(new Jugador("nombre","4","4"));
        jugadorlist.add(new Jugador("nombre","4","4"));
        jugadorlist.add(new Jugador("nombre","4","4"));
        jugadorlist.add(new Jugador("nombre","4","4"));
        jugadorlist.add(new Jugador("nombre","4","4"));
        jugadorlist.add(new Jugador("nombre","4","4"));
        jugadorlist.add(new Jugador("nombre","4","4"));
        jugadorlist.add(new Jugador("nombre","4","4"));
        jugadorlist.add(new Jugador("nombre","4","4"));
        jugadorlist.add(new Jugador("nombre","4","4"));
        jugadorlist.add(new Jugador("nombre","4","4"));
        jugadorlist.add(new Jugador("nombre","4","4"));
        jugadorlist.add(new Jugador("nombre","4","4"));
        jugadorlist.add(new Jugador("nombre","4","4"));

        List<Jugador> jugadorlist1 = new ArrayList<Jugador>();

        jugadorlist1.add(new Jugador("nombre","4","4"));
        jugadorlist1.add(new Jugador("nombre","4","4"));
        jugadorlist1.add(new Jugador("nombre","4","4"));
        jugadorlist1.add(new Jugador("nombre","4","4"));
        jugadorlist1.add(new Jugador("nombre","4","4"));
        jugadorlist1.add(new Jugador("nombre","4","4"));
        jugadorlist1.add(new Jugador("nombre","4","4"));
        jugadorlist1.add(new Jugador("nombre","4","4"));
        jugadorlist1.add(new Jugador("nombre","4","4"));
        jugadorlist1.add(new Jugador("nombre","4","4"));
        jugadorlist1.add(new Jugador("nombre","4","4"));
        jugadorlist1.add(new Jugador("nombre","4","4"));
        jugadorlist1.add(new Jugador("nombre","4","4"));
        jugadorlist1.add(new Jugador("nombre","4","4"));
        jugadorlist1.add(new Jugador("nombre","4","4"));
        jugadorlist1.add(new Jugador("nombre","4","4"));
        jugadorlist1.add(new Jugador("nombre","4","4"));
        jugadorlist1.add(new Jugador("nombre","4","4"));

        List<Jugador> jugadorlist2 = new ArrayList<Jugador>();

        jugadorlist2.add(new Jugador("nombre","4","4"));
        jugadorlist2.add(new Jugador("nombre","4","4"));
        jugadorlist2.add(new Jugador("nombre","4","4"));
        jugadorlist2.add(new Jugador("nombre","4","4"));
        jugadorlist2.add(new Jugador("nombre","4","4"));
        jugadorlist2.add(new Jugador("nombre","4","4"));
        jugadorlist2.add(new Jugador("nombre","4","4"));
        jugadorlist2.add(new Jugador("nombre","4","4"));
        jugadorlist2.add(new Jugador("nombre","4","4"));
        jugadorlist2.add(new Jugador("nombre","4","4"));
        jugadorlist2.add(new Jugador("nombre","4","4"));
        jugadorlist2.add(new Jugador("nombre","4","4"));
        jugadorlist2.add(new Jugador("nombre","4","4"));
        jugadorlist2.add(new Jugador("nombre","4","4"));
        jugadorlist2.add(new Jugador("nombre","4","4"));
        jugadorlist2.add(new Jugador("nombre","4","4"));
        jugadorlist2.add(new Jugador("nombre","4","4"));
        jugadorlist2.add(new Jugador("nombre","4","4"));

        List<Jugador> jugadorlist3 = new ArrayList<Jugador>();

        jugadorlist3.add(new Jugador("nombre","4","4"));
        jugadorlist3.add(new Jugador("nombre","4","4"));
        jugadorlist3.add(new Jugador("nombre","4","4"));
        jugadorlist3.add(new Jugador("nombre","4","4"));
        jugadorlist3.add(new Jugador("nombre","4","4"));
        jugadorlist3.add(new Jugador("nombre","4","4"));
        jugadorlist3.add(new Jugador("nombre","4","4"));
        jugadorlist3.add(new Jugador("nombre","4","4"));
        jugadorlist3.add(new Jugador("nombre","4","4"));
        jugadorlist3.add(new Jugador("nombre","4","4"));
        jugadorlist3.add(new Jugador("nombre","4","4"));
        jugadorlist3.add(new Jugador("nombre","4","4"));
        jugadorlist3.add(new Jugador("nombre","4","4"));
        jugadorlist3.add(new Jugador("nombre","4","4"));
        jugadorlist3.add(new Jugador("nombre","4","4"));
        jugadorlist3.add(new Jugador("nombre","4","4"));
        jugadorlist3.add(new Jugador("nombre","4","4"));
        jugadorlist3.add(new Jugador("nombre","4","4"));

        List<Jugador> jugadorlist4 = new ArrayList<Jugador>();

        jugadorlist4.add(new Jugador("nombre","4","4"));
        jugadorlist4.add(new Jugador("nombre","4","4"));
        jugadorlist4.add(new Jugador("nombre","4","4"));
        jugadorlist4.add(new Jugador("nombre","4","4"));
        jugadorlist4.add(new Jugador("nombre","4","4"));
        jugadorlist4.add(new Jugador("nombre","4","4"));
        jugadorlist4.add(new Jugador("nombre","4","4"));
        jugadorlist4.add(new Jugador("nombre","4","4"));
        jugadorlist4.add(new Jugador("nombre","4","4"));
        jugadorlist4.add(new Jugador("nombre","4","4"));
        jugadorlist4.add(new Jugador("nombre","4","4"));
        jugadorlist4.add(new Jugador("nombre","4","4"));
        jugadorlist4.add(new Jugador("nombre","4","4"));
        jugadorlist4.add(new Jugador("nombre","4","4"));
        jugadorlist4.add(new Jugador("nombre","4","4"));
        jugadorlist4.add(new Jugador("nombre","4","4"));
        jugadorlist4.add(new Jugador("nombre","4","4"));
        jugadorlist4.add(new Jugador("nombre","4","4"));

        List<Jugador> jugadorlist5 = new ArrayList<Jugador>();

        jugadorlist5.add(new Jugador("nombre","4","4"));
        jugadorlist5.add(new Jugador("nombre","4","4"));
        jugadorlist5.add(new Jugador("nombre","4","4"));
        jugadorlist5.add(new Jugador("nombre","4","4"));
        jugadorlist5.add(new Jugador("nombre","4","4"));
        jugadorlist5.add(new Jugador("nombre","4","4"));
        jugadorlist5.add(new Jugador("nombre","4","4"));
        jugadorlist5.add(new Jugador("nombre","4","4"));
        jugadorlist5.add(new Jugador("nombre","4","4"));
        jugadorlist5.add(new Jugador("nombre","4","4"));
        jugadorlist5.add(new Jugador("nombre","4","4"));
        jugadorlist5.add(new Jugador("nombre","4","4"));
        jugadorlist5.add(new Jugador("nombre","4","4"));
        jugadorlist5.add(new Jugador("nombre","4","4"));
        jugadorlist5.add(new Jugador("nombre","4","4"));
        jugadorlist5.add(new Jugador("nombre","4","4"));
        jugadorlist5.add(new Jugador("nombre","4","4"));
        jugadorlist5.add(new Jugador("nombre","4","4"));

        List<Jugador> jugadorlist6 = new ArrayList<Jugador>();

        jugadorlist6.add(new Jugador("nombre","4","4"));
        jugadorlist6.add(new Jugador("nombre","4","4"));
        jugadorlist6.add(new Jugador("nombre","4","4"));
        jugadorlist6.add(new Jugador("nombre","4","4"));
        jugadorlist6.add(new Jugador("nombre","4","4"));
        jugadorlist6.add(new Jugador("nombre","4","4"));
        jugadorlist6.add(new Jugador("nombre","4","4"));
        jugadorlist6.add(new Jugador("nombre","4","4"));
        jugadorlist6.add(new Jugador("nombre","4","4"));
        jugadorlist6.add(new Jugador("nombre","4","4"));
        jugadorlist6.add(new Jugador("nombre","4","4"));
        jugadorlist6.add(new Jugador("nombre","4","4"));
        jugadorlist6.add(new Jugador("nombre","4","4"));
        jugadorlist6.add(new Jugador("nombre","4","4"));
        jugadorlist6.add(new Jugador("nombre","4","4"));
        jugadorlist6.add(new Jugador("nombre","4","4"));
        jugadorlist6.add(new Jugador("nombre","4","4"));
        jugadorlist6.add(new Jugador("nombre","4","4"));

        List<Jugador> jugadorlist7 = new ArrayList<Jugador>();

        jugadorlist7.add(new Jugador("nombre","4","4"));
        jugadorlist7.add(new Jugador("nombre","4","4"));
        jugadorlist7.add(new Jugador("nombre","4","4"));
        jugadorlist7.add(new Jugador("nombre","4","4"));
        jugadorlist7.add(new Jugador("nombre","4","4"));
        jugadorlist7.add(new Jugador("nombre","4","4"));
        jugadorlist7.add(new Jugador("nombre","4","4"));
        jugadorlist7.add(new Jugador("nombre","4","4"));
        jugadorlist7.add(new Jugador("nombre","4","4"));
        jugadorlist7.add(new Jugador("nombre","4","4"));
        jugadorlist7.add(new Jugador("nombre","4","4"));
        jugadorlist7.add(new Jugador("nombre","4","4"));
        jugadorlist7.add(new Jugador("nombre","4","4"));
        jugadorlist7.add(new Jugador("nombre","4","4"));
        jugadorlist7.add(new Jugador("nombre","4","4"));
        jugadorlist7.add(new Jugador("nombre","4","4"));
        jugadorlist7.add(new Jugador("nombre","4","4"));
        jugadorlist7.add(new Jugador("nombre","4","4"));

        List<Jugador> jugadorlist8 = new ArrayList<Jugador>();

        jugadorlist8.add(new Jugador("nombre","4","4"));
        jugadorlist8.add(new Jugador("nombre","4","4"));
        jugadorlist8.add(new Jugador("nombre","4","4"));
        jugadorlist8.add(new Jugador("nombre","4","4"));
        jugadorlist8.add(new Jugador("nombre","4","4"));
        jugadorlist8.add(new Jugador("nombre","4","4"));
        jugadorlist8.add(new Jugador("nombre","4","4"));
        jugadorlist8.add(new Jugador("nombre","4","4"));
        jugadorlist8.add(new Jugador("nombre","4","4"));
        jugadorlist8.add(new Jugador("nombre","4","4"));
        jugadorlist8.add(new Jugador("nombre","4","4"));
        jugadorlist8.add(new Jugador("nombre","4","4"));
        jugadorlist8.add(new Jugador("nombre","4","4"));
        jugadorlist8.add(new Jugador("nombre","4","4"));
        jugadorlist8.add(new Jugador("nombre","4","4"));
        jugadorlist8.add(new Jugador("nombre","4","4"));
        jugadorlist8.add(new Jugador("nombre","4","4"));
        jugadorlist8.add(new Jugador("nombre","4","4"));

        List<Jugador> jugadorlist9 = new ArrayList<Jugador>();

        jugadorlist9.add(new Jugador("nombre","4","4"));
        jugadorlist9.add(new Jugador("nombre","4","4"));
        jugadorlist9.add(new Jugador("nombre","4","4"));
        jugadorlist9.add(new Jugador("nombre","4","4"));
        jugadorlist9.add(new Jugador("nombre","4","4"));
        jugadorlist9.add(new Jugador("nombre","4","4"));
        jugadorlist9.add(new Jugador("nombre","4","4"));
        jugadorlist9.add(new Jugador("nombre","4","4"));
        jugadorlist9.add(new Jugador("nombre","4","4"));
        jugadorlist9.add(new Jugador("nombre","4","4"));
        jugadorlist9.add(new Jugador("nombre","4","4"));
        jugadorlist9.add(new Jugador("nombre","4","4"));
        jugadorlist9.add(new Jugador("nombre","4","4"));
        jugadorlist9.add(new Jugador("nombre","4","4"));
        jugadorlist9.add(new Jugador("nombre","4","4"));
        jugadorlist9.add(new Jugador("nombre","4","4"));
        jugadorlist9.add(new Jugador("nombre","4","4"));
        jugadorlist9.add(new Jugador("nombre","4","4"));

        List<Jugador> jugadorlist10 = new ArrayList<Jugador>();

        jugadorlist10.add(new Jugador("nombre","4","4"));
        jugadorlist10.add(new Jugador("nombre","4","4"));
        jugadorlist10.add(new Jugador("nombre","4","4"));
        jugadorlist10.add(new Jugador("nombre","4","4"));
        jugadorlist10.add(new Jugador("nombre","4","4"));
        jugadorlist10.add(new Jugador("nombre","4","4"));
        jugadorlist10.add(new Jugador("nombre","4","4"));
        jugadorlist10.add(new Jugador("nombre","4","4"));
        jugadorlist10.add(new Jugador("nombre","4","4"));
        jugadorlist10.add(new Jugador("nombre","4","4"));
        jugadorlist10.add(new Jugador("nombre","4","4"));
        jugadorlist10.add(new Jugador("nombre","4","4"));
        jugadorlist10.add(new Jugador("nombre","4","4"));
        jugadorlist10.add(new Jugador("nombre","4","4"));
        jugadorlist10.add(new Jugador("nombre","4","4"));
        jugadorlist10.add(new Jugador("nombre","4","4"));
        jugadorlist10.add(new Jugador("nombre","4","4"));
        jugadorlist10.add(new Jugador("nombre","4","4"));

        List<Jugador> jugadorlist11 = new ArrayList<Jugador>();

        jugadorlist11.add(new Jugador("nombre","4","4"));
        jugadorlist11.add(new Jugador("nombre","4","4"));
        jugadorlist11.add(new Jugador("nombre","4","4"));
        jugadorlist11.add(new Jugador("nombre","4","4"));
        jugadorlist11.add(new Jugador("nombre","4","4"));
        jugadorlist11.add(new Jugador("nombre","4","4"));
        jugadorlist11.add(new Jugador("nombre","4","4"));
        jugadorlist11.add(new Jugador("nombre","4","4"));
        jugadorlist11.add(new Jugador("nombre","4","4"));
        jugadorlist11.add(new Jugador("nombre","4","4"));
        jugadorlist11.add(new Jugador("nombre","4","4"));
        jugadorlist11.add(new Jugador("nombre","4","4"));
        jugadorlist11.add(new Jugador("nombre","4","4"));
        jugadorlist11.add(new Jugador("nombre","4","4"));
        jugadorlist11.add(new Jugador("nombre","4","4"));
        jugadorlist11.add(new Jugador("nombre","4","4"));
        jugadorlist11.add(new Jugador("nombre","4","4"));
        jugadorlist11.add(new Jugador("nombre","4","4"));

        List<Jugador> jugadorlist12 = new ArrayList<Jugador>();

        jugadorlist12.add(new Jugador("nombre","4","4"));
        jugadorlist12.add(new Jugador("nombre","4","4"));
        jugadorlist12.add(new Jugador("nombre","4","4"));
        jugadorlist12.add(new Jugador("nombre","4","4"));
        jugadorlist12.add(new Jugador("nombre","4","4"));
        jugadorlist12.add(new Jugador("nombre","4","4"));
        jugadorlist12.add(new Jugador("nombre","4","4"));
        jugadorlist12.add(new Jugador("nombre","4","4"));
        jugadorlist12.add(new Jugador("nombre","4","4"));
        jugadorlist12.add(new Jugador("nombre","4","4"));
        jugadorlist12.add(new Jugador("nombre","4","4"));
        jugadorlist12.add(new Jugador("nombre","4","4"));
        jugadorlist12.add(new Jugador("nombre","4","4"));
        jugadorlist12.add(new Jugador("nombre","4","4"));
        jugadorlist12.add(new Jugador("nombre","4","4"));
        jugadorlist12.add(new Jugador("nombre","4","4"));
        jugadorlist12.add(new Jugador("nombre","4","4"));
        jugadorlist12.add(new Jugador("nombre","4","4"));

        List<Jugador> jugadorlist13 = new ArrayList<Jugador>();

        jugadorlist13.add(new Jugador("nombre","4","4"));
        jugadorlist13.add(new Jugador("nombre","4","4"));
        jugadorlist13.add(new Jugador("nombre","4","4"));
        jugadorlist13.add(new Jugador("nombre","4","4"));
        jugadorlist13.add(new Jugador("nombre","4","4"));
        jugadorlist13.add(new Jugador("nombre","4","4"));
        jugadorlist13.add(new Jugador("nombre","4","4"));
        jugadorlist13.add(new Jugador("nombre","4","4"));
        jugadorlist13.add(new Jugador("nombre","4","4"));
        jugadorlist13.add(new Jugador("nombre","4","4"));
        jugadorlist13.add(new Jugador("nombre","4","4"));
        jugadorlist13.add(new Jugador("nombre","4","4"));
        jugadorlist13.add(new Jugador("nombre","4","4"));
        jugadorlist13.add(new Jugador("nombre","4","4"));
        jugadorlist13.add(new Jugador("nombre","4","4"));
        jugadorlist13.add(new Jugador("nombre","4","4"));
        jugadorlist13.add(new Jugador("nombre","4","4"));
        jugadorlist13.add(new Jugador("nombre","4","4"));

        List<Jugador> jugadorlist14 = new ArrayList<Jugador>();

        jugadorlist14.add(new Jugador("nombre","4","4"));
        jugadorlist14.add(new Jugador("nombre","4","4"));
        jugadorlist14.add(new Jugador("nombre","4","4"));
        jugadorlist14.add(new Jugador("nombre","4","4"));
        jugadorlist14.add(new Jugador("nombre","4","4"));
        jugadorlist14.add(new Jugador("nombre","4","4"));
        jugadorlist14.add(new Jugador("nombre","4","4"));
        jugadorlist14.add(new Jugador("nombre","4","4"));
        jugadorlist14.add(new Jugador("nombre","4","4"));
        jugadorlist14.add(new Jugador("nombre","4","4"));
        jugadorlist14.add(new Jugador("nombre","4","4"));
        jugadorlist14.add(new Jugador("nombre","4","4"));
        jugadorlist14.add(new Jugador("nombre","4","4"));
        jugadorlist14.add(new Jugador("nombre","4","4"));
        jugadorlist14.add(new Jugador("nombre","4","4"));
        jugadorlist14.add(new Jugador("nombre","4","4"));
        jugadorlist14.add(new Jugador("nombre","4","4"));
        jugadorlist14.add(new Jugador("nombre","4","4"));

        List<Jugador> jugadorlist15 = new ArrayList<Jugador>();

        jugadorlist15.add(new Jugador("nombre","4","4"));
        jugadorlist15.add(new Jugador("nombre","4","4"));
        jugadorlist15.add(new Jugador("nombre","4","4"));
        jugadorlist15.add(new Jugador("nombre","4","4"));
        jugadorlist15.add(new Jugador("nombre","4","4"));
        jugadorlist15.add(new Jugador("nombre","4","4"));
        jugadorlist15.add(new Jugador("nombre","4","4"));
        jugadorlist15.add(new Jugador("nombre","4","4"));
        jugadorlist15.add(new Jugador("nombre","4","4"));
        jugadorlist15.add(new Jugador("nombre","4","4"));
        jugadorlist15.add(new Jugador("nombre","4","4"));
        jugadorlist15.add(new Jugador("nombre","4","4"));
        jugadorlist15.add(new Jugador("nombre","4","4"));
        jugadorlist15.add(new Jugador("nombre","4","4"));
        jugadorlist15.add(new Jugador("nombre","4","4"));
        jugadorlist15.add(new Jugador("nombre","4","4"));
        jugadorlist15.add(new Jugador("nombre","4","4"));
        jugadorlist15.add(new Jugador("nombre","4","4"));

        List<Jugador> jugadorlist16 = new ArrayList<Jugador>();

        jugadorlist16.add(new Jugador("nombre","4","4"));
        jugadorlist16.add(new Jugador("nombre","4","4"));
        jugadorlist16.add(new Jugador("nombre","4","4"));
        jugadorlist16.add(new Jugador("nombre","4","4"));
        jugadorlist16.add(new Jugador("nombre","4","4"));
        jugadorlist16.add(new Jugador("nombre","4","4"));
        jugadorlist16.add(new Jugador("nombre","4","4"));
        jugadorlist16.add(new Jugador("nombre","4","4"));
        jugadorlist16.add(new Jugador("nombre","4","4"));
        jugadorlist16.add(new Jugador("nombre","4","4"));
        jugadorlist16.add(new Jugador("nombre","4","4"));
        jugadorlist16.add(new Jugador("nombre","4","4"));
        jugadorlist16.add(new Jugador("nombre","4","4"));
        jugadorlist16.add(new Jugador("nombre","4","4"));
        jugadorlist16.add(new Jugador("nombre","4","4"));
        jugadorlist16.add(new Jugador("nombre","4","4"));
        jugadorlist16.add(new Jugador("nombre","4","4"));
        jugadorlist16.add(new Jugador("nombre","4","4"));

        List<Jugador> jugadorlist17 = new ArrayList<Jugador>();

        jugadorlist17.add(new Jugador("nombre","4","4"));
        jugadorlist17.add(new Jugador("nombre","4","4"));
        jugadorlist17.add(new Jugador("nombre","4","4"));
        jugadorlist17.add(new Jugador("nombre","4","4"));
        jugadorlist17.add(new Jugador("nombre","4","4"));
        jugadorlist17.add(new Jugador("nombre","4","4"));
        jugadorlist17.add(new Jugador("nombre","4","4"));
        jugadorlist17.add(new Jugador("nombre","4","4"));
        jugadorlist17.add(new Jugador("nombre","4","4"));
        jugadorlist17.add(new Jugador("nombre","4","4"));
        jugadorlist17.add(new Jugador("nombre","4","4"));
        jugadorlist17.add(new Jugador("nombre","4","4"));
        jugadorlist17.add(new Jugador("nombre","4","4"));
        jugadorlist17.add(new Jugador("nombre","4","4"));
        jugadorlist17.add(new Jugador("nombre","4","4"));
        jugadorlist17.add(new Jugador("nombre","4","4"));
        jugadorlist17.add(new Jugador("nombre","4","4"));
        jugadorlist17.add(new Jugador("nombre","4","4"));

        List<Jugador> jugadorlist18 = new ArrayList<Jugador>();

        jugadorlist18.add(new Jugador("nombre","4","4"));
        jugadorlist18.add(new Jugador("nombre","4","4"));
        jugadorlist18.add(new Jugador("nombre","4","4"));
        jugadorlist18.add(new Jugador("nombre","4","4"));
        jugadorlist18.add(new Jugador("nombre","4","4"));
        jugadorlist18.add(new Jugador("nombre","4","4"));
        jugadorlist18.add(new Jugador("nombre","4","4"));
        jugadorlist18.add(new Jugador("nombre","4","4"));
        jugadorlist18.add(new Jugador("nombre","4","4"));
        jugadorlist18.add(new Jugador("nombre","4","4"));
        jugadorlist18.add(new Jugador("nombre","4","4"));
        jugadorlist18.add(new Jugador("nombre","4","4"));
        jugadorlist18.add(new Jugador("nombre","4","4"));
        jugadorlist18.add(new Jugador("nombre","4","4"));
        jugadorlist18.add(new Jugador("nombre","4","4"));
        jugadorlist18.add(new Jugador("nombre","4","4"));
        jugadorlist18.add(new Jugador("nombre","4","4"));
        jugadorlist18.add(new Jugador("nombre","4","4"));

        List<Jugador> jugadorlist19 = new ArrayList<Jugador>();

        jugadorlist19.add(new Jugador("nombre","4","4"));
        jugadorlist19.add(new Jugador("nombre","4","4"));
        jugadorlist19.add(new Jugador("nombre","4","4"));
        jugadorlist19.add(new Jugador("nombre","4","4"));
        jugadorlist19.add(new Jugador("nombre","4","4"));
        jugadorlist19.add(new Jugador("nombre","4","4"));
        jugadorlist19.add(new Jugador("nombre","4","4"));
        jugadorlist19.add(new Jugador("nombre","4","4"));
        jugadorlist19.add(new Jugador("nombre","4","4"));
        jugadorlist19.add(new Jugador("nombre","4","4"));
        jugadorlist19.add(new Jugador("nombre","4","4"));
        jugadorlist19.add(new Jugador("nombre","4","4"));
        jugadorlist19.add(new Jugador("nombre","4","4"));
        jugadorlist19.add(new Jugador("nombre","4","4"));
        jugadorlist19.add(new Jugador("nombre","4","4"));
        jugadorlist19.add(new Jugador("nombre","4","4"));
        jugadorlist19.add(new Jugador("nombre","4","4"));
        jugadorlist19.add(new Jugador("nombre","4","4"));

        mDatabase.child("Equipo1").setValue(new Equipo("nom","7","0","6","2","8",jugadorlist));
        mDatabase.child("Equipo2").setValue(new Equipo("nom","7","0","6","2","8",jugadorlist1));
        mDatabase.child("Equipo3").setValue(new Equipo("nom","7","0","6","2","8",jugadorlist2));
        mDatabase.child("Equipo4").setValue(new Equipo("nom","7","0","6","2","8",jugadorlist3));
        mDatabase.child("Equipo5").setValue(new Equipo("nom","7","0","6","2","8",jugadorlist4));
        mDatabase.child("Equipo6").setValue(new Equipo("nom","7","0","6","2","8",jugadorlist5));
        mDatabase.child("Equipo7").setValue(new Equipo("nom","7","0","6","2","8",jugadorlist6));
        mDatabase.child("Equipo8").setValue(new Equipo("nom","7","0","6","2","8",jugadorlist7));
        mDatabase.child("Equipo9").setValue(new Equipo("nom","7","0","6","2","8",jugadorlist8));
        mDatabase.child("Equipo10").setValue(new Equipo("nom","7","0","6","2","8",jugadorlist9));
        mDatabase.child("Equipo11").setValue(new Equipo("nom","7","0","6","2","8",jugadorlist10));
        mDatabase.child("Equipo12").setValue(new Equipo("nom","7","0","6","2","8",jugadorlist11));
        mDatabase.child("Equipo13").setValue(new Equipo("nom","7","0","6","2","8",jugadorlist12));
        mDatabase.child("Equipo14").setValue(new Equipo("nom","7","0","6","2","8",jugadorlist13));
        mDatabase.child("Equipo15").setValue(new Equipo("nom","7","0","6","2","8",jugadorlist14));
        mDatabase.child("Equipo16").setValue(new Equipo("nom","7","0","6","2","8",jugadorlist15));
        mDatabase.child("Equipo17").setValue(new Equipo("nom","7","0","6","2","8",jugadorlist16));
        mDatabase.child("Equipo18").setValue(new Equipo("nom","7","0","6","2","8",jugadorlist17));
        mDatabase.child("Equipo19").setValue(new Equipo("nom","7","0","6","2","8",jugadorlist18));
        mDatabase.child("Equipo20").setValue(new Equipo("nom","7","0","bkbkjbnkjln","2","8",jugadorlist19));


    }

    @NonNull
    private void actualizaJornadasPartidos() {
        mDatabase = FirebaseDatabase.getInstance().getReference("Jornadas");

        List<JornadasList> jlist0 = new ArrayList<JornadasList>();

        List<Partidos> plist0 = new ArrayList<Partidos>();
        plist0.add(new Partidos("Leganés","Alavés","1","0","18/08/2017","FIN"));
        plist0.add(new Partidos("Valencia","Las Palmas","1","0","18/08/2017","FIN"));
        plist0.add(new Partidos("Celta","Real Sociedad","2","3","19/08/2017","FIN"));
        plist0.add(new Partidos("Girona","Atlético","2","2","19/08/2017","FIN"));
        plist0.add(new Partidos("Sevilla","Espanyol","1","1","19/08/2017","FIN"));
        plist0.add(new Partidos("Ath. Club","Getafe","0","0","20/08/2017","FIN"));
        plist0.add(new Partidos("Barcelona","Betis","2","0","20/08/2017","FIN"));
        plist0.add(new Partidos("Deportivo","Madrid","0","3","20/08/2017","FIN"));
        plist0.add(new Partidos("Levante","Villarreal","1","0","21/08/2017","FIN"));
        plist0.add(new Partidos("Málaga","Eibar","0","1","21/08/2017","FIN"));


        List<Partidos> plist1 = new ArrayList<Partidos>();
        plist1.add(new Partidos("Real Sociedad","Villarreal","3","0","25/08/2017","FIN"));
        plist1.add(new Partidos("Betis","Celta","2","1","25/08/2017","FIN"));
        plist1.add(new Partidos("Alavés", "Barcelona","0","2","26/08/2017","FIN"));
        plist1.add(new Partidos("Levante","Deprtivo","2","2","26/08/2017","FIN"));
        plist1.add(new Partidos("Girona","Málaga","1","0","26/08/2017","FIN"));
        plist1.add(new Partidos("Las Palmas","Atlético","1","5","26/08/2017","FIN"));
        plist1.add(new Partidos("Espanyol","Leganés","0","1","27/08/2017","FIN"));
        plist1.add(new Partidos("Eibar","Ath. Club","0","1","27/08/2017","FIN"));
        plist1.add(new Partidos("Getafe","Sevilla","0","1","27/08/2017","FIN"));
        plist1.add(new Partidos("Madrid","Valencia","2","2","27/08/2017","FIN"));


        List<Partidos> plist2 = new ArrayList<Partidos>();
        plist2.add(new Partidos("Leganés","Getafe","1","2","08/09/2017","FIN"));
        plist2.add(new Partidos("Madrid","Levante","1","1","09/09/2017","FIN"));
        plist2.add(new Partidos("Valencia", "Atlético","0","0","09/09/2017","FIN"));
        plist2.add(new Partidos("Sevilla","Eibar","3","0","09/09/2017","FIN"));
        plist2.add(new Partidos("Barcelona","Espanyol","5","0","09/09/2017","FIN"));
        plist2.add(new Partidos("Deportivo","Real Sociedad","2","4","10/09/2017","FIN"));
        plist2.add(new Partidos("Ath. Club","Girona","2","0","10/09/2017","FIN"));
        plist2.add(new Partidos("Celta","Alavés","1","0","10/09/2017","FIN"));
        plist2.add(new Partidos("Villarreal","Betis","3","1","10/09/2017","FIN"));
        plist2.add(new Partidos("Málaga","Las Palmas","1","3","11/09/2017","FIN"));


        List<Partidos> plist3 = new ArrayList<Partidos>();
        plist3.add(new Partidos("Eibar","Leganés","1","0","15/09/2017","FIN"));
        plist3.add(new Partidos("Levante","Valencia","1","1","16/09/2017","FIN"));
        plist3.add(new Partidos("Getafe","Barcelona","1","2","16/09/2017","FIN"));
        plist3.add(new Partidos("Betis","Deportivo","2","1","16/09/2017","FIN"));
        plist3.add(new Partidos("Atlético","Málaga","1","0","16/09/2017","FIN"));
        plist3.add(new Partidos("Alavés","Villarreal","0","3","17/09/2017","FIN"));
        plist3.add(new Partidos("Girona","Sevilla","0","1","17/09/2017","FIN"));
        plist3.add(new Partidos("Las Palmas","Ath. Club","1","0","17/09/2017","FIN"));
        plist3.add(new Partidos("Real Sociedad","Madrid","1","3","17/09/2017","FIN"));
        plist3.add(new Partidos("Espanyol","Celta","2","1","18/09/2017","FIN"));


        List<Partidos> plist4 = new ArrayList<Partidos>();
        plist4.add(new Partidos("Valencia","Málaga","5","0","19/09/2017","FIN"));
        plist4.add(new Partidos("Barcelona","Eibar","6","1","19/09/2017","FIN"));
        plist4.add(new Partidos("Leganés", "Girona","0","0","20/09/2017","FIN"));
        plist4.add(new Partidos("Ath. Club","Atlético","1","2","20/09/2017","FIN"));
        plist4.add(new Partidos("Deportivo","Alavés","1","0","20/09/2017","FIN"));
        plist4.add(new Partidos("Sevilla","Las Palmas","1","0","20/09/2017","FIN"));
        plist4.add(new Partidos("Madrid","Betis","0","1","20/09/2017","FIN"));
        plist4.add(new Partidos("Villarreal","Espanyol","0","0","21/09/2017","FIN"));
        plist4.add(new Partidos("Celta","Getafe","1","1","21/09/2017","FIN"));
        plist4.add(new Partidos("Levante","Real Sociedad","2","2","21/09/2017","FIN"));


        List<Partidos> plist5 = new ArrayList<Partidos>();
        plist5.add(new Partidos("Atlético","Sevilla","2","0","23/09/2017","FIN"));
        plist5.add(new Partidos("Alavés","Madrid","1","2","23/09/2017","FIN"));
        plist5.add(new Partidos("Málaga", "Ath. Club","3","3","23/09/2017","FIN"));
        plist5.add(new Partidos("Girona","Barcelona","0","3","23/09/2017","FIN"));
        plist5.add(new Partidos("Espanyol","Deportivo","4","1","24/09/2017","FIN"));
        plist5.add(new Partidos("Getafe","Villarreal","4","0","24/09/2017","FIN"));
        plist5.add(new Partidos("Las Palmas","Leganés","0","2","24/09/2017","FIN"));
        plist5.add(new Partidos("Eibar","Celta","0","4","24/09/2017","FIN"));
        plist5.add(new Partidos("Real Sociedad","Valencia","2","3","24/09/2017","FIN"));
        plist5.add(new Partidos("Betis","Levante","4","0","25/09/2017","FIN"));


        List<Partidos> plist6 = new ArrayList<Partidos>();
        plist6.add(new Partidos("Celta","Girona","3","3","29/09/2017","FIN"));
        plist6.add(new Partidos("Deportivo","Getafe","2","1","30/09/2017","FIN"));
        plist6.add(new Partidos("Sevilla","Málaga","2","0","30/09/2017","FIN"));
        plist6.add(new Partidos("Levante","Alavés","0","2","30/09/2017","FIN"));
        plist6.add(new Partidos("Leganés","Atlético","0","0","30/09/2017","FIN"));
        plist6.add(new Partidos("Real Sociedad","Betis","4","4","01/10/2017","FIN"));
        plist6.add(new Partidos("Barcelona","Las Palmas","3","0","01/10/2017","FIN"));
        plist6.add(new Partidos("Villarreal","Eibar","3","0","01/10/2017","FIN"));
        plist6.add(new Partidos("Valencia","Ath. Club","3","2","01/10/2017","FIN"));
        plist6.add(new Partidos("Madrid","Espanyol","2","0","01/10/2017","FIN"));


        List<Partidos> plist7 = new ArrayList<Partidos>();
        plist7.add(new Partidos("Espanyol","Levante","0","0","13/10/2017","FIN"));
        plist7.add(new Partidos("Ath. Club","Sevilla","1","0","14/10/2017","FIN"));
        plist7.add(new Partidos("Getafe", "Madrid","1","2","14/10/2017","FIN"));
        plist7.add(new Partidos("Alavés","Real Sociedad","0","2","14/10/2017","FIN"));
        plist7.add(new Partidos("Atlético","Barcelona","1","1","14/10/2017","FIN"));
        plist7.add(new Partidos("Eibar","Deportivo","0","0","15/10/2017","FIN"));
        plist7.add(new Partidos("Girona","Villarreal","1","2","15/10/2017","FIN"));
        plist7.add(new Partidos("Málaga","Leganés","0","2","15/10/2017","FIN"));
        plist7.add(new Partidos("Betis","Valencia","3","6","15/10/2017","FIN"));
        plist7.add(new Partidos("Las Palmas","Celta","2","5","16/10/2017","FIN"));


        List<Partidos> plist8 = new ArrayList<Partidos>();
        plist8.add(new Partidos("Levante","Getafe","1","1","21/10/2017","FIN"));
        plist8.add(new Partidos("Betis","Alavés","2","0","21/10/2017","FIN"));
        plist8.add(new Partidos("Valencia", "Sevilla","4","0","21/10/2017","FIN"));
        plist8.add(new Partidos("Barcelona","Málaga","2","0","21/10/2017","FIN"));
        plist8.add(new Partidos("Villarreal","Las Palmas","4","0","22/10/2017","FIN"));
        plist8.add(new Partidos("Celta","Atlético","0","1","22/10/2017","FIN"));
        plist8.add(new Partidos("Leganés","Ath. Club","1","0","22/10/2017","FIN"));
        plist8.add(new Partidos("Madrid","Eibar","3","0","22/10/2017","FIN"));
        plist8.add(new Partidos("Real Sociedad","Espanyol","1","1","23/10/2017","FIN"));
        plist8.add(new Partidos("Deportivo","Girona","1","2","23/10/2017","FIN"));


        List<Partidos> plist9 = new ArrayList<Partidos>();
        plist9.add(new Partidos("Alavés","Valencia","1","2","28/10/2017","FIN"));
        plist9.add(new Partidos("Atlético","Villarreal","1","1","28/10/2017","FIN"));
        plist9.add(new Partidos("Ath. Club","Barcelona","0","2","28/10/2017","FIN"));
        plist9.add(new Partidos("Sevilla","Leganés","2","1","28/10/2017","FIN"));
        plist9.add(new Partidos("Getafe","Real Sociedad","2","1","29/10/2017","FIN"));
        plist9.add(new Partidos("Girona","Madrid","2","1","29/10/2017","FIN"));
        plist9.add(new Partidos("Eibar","Levante","2","2","29/10/2017","FIN"));
        plist9.add(new Partidos("Málaga","Celta","2","1","29/10/2017","FIN"));
        plist9.add(new Partidos("Las Palmas","Deportivo","1","3","30/10/2017","FIN"));
        plist9.add(new Partidos("Espanyol","Betis","1","0","30/10/2017","FIN"));


        List<Partidos> plist10 = new ArrayList<Partidos>();
        plist10.add(new Partidos("Betis","Getafe","2","2","03/11/2017","FIN"));
        plist10.add(new Partidos("Valencia","Leganés","3","0","04/11/2017","FIN"));
        plist10.add(new Partidos("Deportivo", "Atlético","0","1","04/11/2017","FIN"));
        plist10.add(new Partidos("Alavés","Espanyol","1","1","04/11/2017","FIN"));
        plist10.add(new Partidos("Barcelona","Sevilla","2","1","04/11/2017","FIN"));
        plist10.add(new Partidos("Levante","Girona","1","2","05/11/2017","FIN"));
        plist10.add(new Partidos("Celta","Ath. Club","3","1","05/11/2017","FIN"));
        plist10.add(new Partidos("Villarreal","Málaga","2","0","05/11/2017","FIN"));
        plist10.add(new Partidos("Real Sociedad","Eibar","3","1","05/11/2017","FIN"));
        plist10.add(new Partidos("Madrid","Las Palmas","3","0","05/11/2017","FIN"));


        List<Partidos> plist11 = new ArrayList<Partidos>();
        plist11.add(new Partidos("Girona","Real Sociedad","1","1","17/11/2017","FIN"));
        plist11.add(new Partidos("Getafe","Alavés","4","1","18/11/2017","FIN"));
        plist11.add(new Partidos("Leganés", "Barcelona","0","3","18/11/2017","FIN"));
        plist11.add(new Partidos("Sevilla","Celta","2","1","18/11/2017","FIN"));
        plist11.add(new Partidos("Atlético","Madrid","0","0","18/11/2017","FIN"));
        plist11.add(new Partidos("Málaga","Deportivo","3","2","19/11/2017","FIN"));
        plist11.add(new Partidos("Espanyol","Valencia","0","2","19/11/2017","FIN"));
        plist11.add(new Partidos("Las Palmas","Levante","0","2","19/11/2017","FIN"));
        plist11.add(new Partidos("Ath. Club","Villarreal","1","1","19/11/2017","FIN"));
        plist11.add(new Partidos("Eibar","Betis","5","0","20/11/2017","FIN"));


        List<Partidos> plist12 = new ArrayList<Partidos>();
        plist12.add(new Partidos("Celta","Leganés","1","0","24/11/2017","FIN"));
        plist12.add(new Partidos("Alavés","Eibar","1","2","25/11/2017","FIN"));
        plist12.add(new Partidos("Madrid", "Málaga","3","2","25/11/2017","FIN"));
        plist12.add(new Partidos("Betis","Girona","2","2","25/11/2017","FIN"));
        plist12.add(new Partidos("Levante","Atlético","0","5","25/11/2017","FIN"));
        plist12.add(new Partidos("Deportivo","Ath. Club","2","2","26/11/2017","FIN"));
        plist12.add(new Partidos("Real Sociedad","Las Palmas","2","2","26/11/2017","FIN"));
        plist12.add(new Partidos("Villarreal","Sevilla","2","3","26/11/2017","FIN"));
        plist12.add(new Partidos("Valencia","Barcelona","1","1","26/11/2017","FIN"));
        plist12.add(new Partidos("Espanyol","Getafe","1","0","27/11/2017","FIN"));


        List<Partidos> plist13 = new ArrayList<Partidos>();
        plist13.add(new Partidos("Málaga","Levante","0","0","01/12/2017","FIN"));
        plist13.add(new Partidos("Barcelona","Celta","2","2","02/12/2017","FIN"));
        plist13.add(new Partidos("Atlético","Real Sociedad","2","1","02/12/2017","FIN"));
        plist13.add(new Partidos("Sevilla","Deportivo","2","0","02/12/2017","FIN"));
        plist13.add(new Partidos("Ath. Club","Madrid","0","0","02/12/2017","FIN"));
        plist13.add(new Partidos("Leganés","Villarreal","3","1","03/12/2017","FIN"));
        plist13.add(new Partidos("Getafe","Valencia","1","0","03/12/2017","FIN"));
        plist13.add(new Partidos("Eibar","Espanyol","3","1","03/12/2017","FIN"));
        plist13.add(new Partidos("Las Palmas","Betis","1","0","03/12/2017","FIN"));
        plist13.add(new Partidos("Girona","Alavés","2","3","04/12/2017","FIN"));

        List<Partidos> plist14 = new ArrayList<Partidos>();
        plist14.add(new Partidos("Alavés","Las Palmas","2","0","08/12/2017","FIN"));
        plist14.add(new Partidos("Getafe","Eibar","0","0","09/12/2017","FIN"));
        plist14.add(new Partidos("Madrid", "Sevilla","5","0","09/12/2017","FIN"));
        plist14.add(new Partidos("Deportivo","Leganés","1","0","09/12/2017","FIN"));
        plist14.add(new Partidos("Valencia","Celta","1","0","09/12/2017","FIN"));
        plist14.add(new Partidos("Real Sociedad","Málaga","0","2","10/12/2017","FIN"));
        plist14.add(new Partidos("Betis","Atlético","0","1","10/12/2017","FIN"));
        plist14.add(new Partidos("Levante","Ath. Club","1","2","10/12/2017","FIN"));
        plist14.add(new Partidos("Villarreal","Barcelona","0","2","10/12/2017","FIN"));
        plist14.add(new Partidos("Espanyol","Girona","0","1","11/12/2017","FIN"));


        List<Partidos> plist15 = new ArrayList<Partidos>();
        plist15.add(new Partidos("Sevilla","Levante","0","0","15/12/2017","FIN"));
        plist15.add(new Partidos("Ath. Club","Real Sociedad","0","0","16/12/2017","FIN"));
        plist15.add(new Partidos("Eibar", "Valencia","2","1","16/12/2017","FIN"));
        plist15.add(new Partidos("Atlético","Alavés","1","0","16/12/2017","FIN"));
        plist15.add(new Partidos("Madrid","Leganés","-","-","Por definirse","FIN"));
        plist15.add(new Partidos("Girona","Getafe","1","0","17/12/2017","FIN"));
        plist15.add(new Partidos("Celta","Villarreal","0","1","17/12/2017","FIN"));
        plist15.add(new Partidos("Las Palmas","Espanyol","2","2","17/12/2017","FIN"));
        plist15.add(new Partidos("Barcelona","Deportivo","4","0","17/12/2017","FIN"));
        plist15.add(new Partidos("Málaga","Betis","0","2","18/12/2017","FIN"));


        List<Partidos> plist16 = new ArrayList<Partidos>();
        plist16.add(new Partidos("Levante","Leganés","0","0","19/12/2017","FIN"));
        plist16.add(new Partidos("Getafe","Las Palmas","2","0","20/12/2017","FIN"));
        plist16.add(new Partidos("Real Sociedad","Sevilla","3","1","20/12/2017","FIN"));
        plist16.add(new Partidos("Eibar","Girona","4","1","21/12/2017","FIN"));
        plist16.add(new Partidos("Alavés","Málaga","1","0","21/12/2017","FIN"));
        plist16.add(new Partidos("Betis","Ath. Club","0","2","22/12/2017","FIN"));
        plist16.add(new Partidos("Espanyol","Atlético","1","0","22/12/2017","FIN"));
        plist16.add(new Partidos("Madrid","Barcelona","0","3","23/12/2017","FIN"));
        plist16.add(new Partidos("Valencia","Villarreal","0","1","23/12/2017","FIN"));
        plist16.add(new Partidos("Deportivo","Celta","1","3","23/12/2017","FIN"));


        List<Partidos> plist17 = new ArrayList<Partidos>();
        plist17.add(new Partidos("Atlético","Getafe","2","0","06/01/2018","FIN"));
        plist17.add(new Partidos("Valencia","Girona","2","1","06/01/2018","FIN"));
        plist17.add(new Partidos("Las Palmas", "Eibar","1","2","06/01/2018","FIN"));
        plist17.add(new Partidos("Sevilla","Betis","3","5","06/01/2018","FIN"));
        plist17.add(new Partidos("Leganés","Real Sociedad","1","0","07/01/2018","FIN"));
        plist17.add(new Partidos("Barcelona","Levante","3","0","07/01/2018","FIN"));
        plist17.add(new Partidos("Villarreal","Deportivo","1","1","07/01/2018","FIN"));
        plist17.add(new Partidos("Ath. Club","Alavés","2","0","07/01/2018","FIN"));
        plist17.add(new Partidos("Celta","Madrid","2","2","07/01/2018","FIN"));
        plist17.add(new Partidos("Málaga","Espanyol","0","1","08/01/2018","FIN"));


        List<Partidos> plist18 = new ArrayList<Partidos>();
        plist18.add(new Partidos("Getafe","Málaga","1","0","12/01/2018","FIN"));
        plist18.add(new Partidos("Girona","Las Palmas","6","0","13/01/2018","FIN"));
        plist18.add(new Partidos("Madrid","Villarreal","0","1","13/01/2018","FIN"));
        plist18.add(new Partidos("Eibar","Atlético","0","1","13/01/2018","FIN"));
        plist18.add(new Partidos("Deportivo","Valencia","-","-","13/01/2018","FIN"));
        plist18.add(new Partidos("Levante","Celta","-","-","14/01/2018","FIN"));
        plist18.add(new Partidos("Alavés","Sevilla","-","-","14/01/2018","FIN"));
        plist18.add(new Partidos("Espanyol","Ath. Club","-","-","14/01/2018","FIN"));
        plist18.add(new Partidos("Real Sociedad","Barcelona","-","-","14/01/2018","FIN"));
        plist18.add(new Partidos("Betis","Leganés","-","-","15/01/2018","FIN"));


        List<Partidos> plist19 = new ArrayList<Partidos>();
        plist19.add(new Partidos("Getafe","Ath. Club","-","-","19/01/2018","21.00"));
        plist19.add(new Partidos("Espanyol","Sevilla","-","-","20/01/2018","13.00"));
        plist19.add(new Partidos("Atlético", "Girona","-","-","20/01/2018","16.15"));
        plist19.add(new Partidos("Villarreal","Levante","-","-","20/01/2018","18.30"));
        plist19.add(new Partidos("Las Palmas","Valencia","-","-","20/01/2018","20.45"));
        plist19.add(new Partidos("Alavés","Leganés","-","-","21/01/2018","12.00"));
        plist19.add(new Partidos("Madrid","Deportivo","-","-","21/01/2018","16.15"));
        plist19.add(new Partidos("Real Sociedad","Celta","-","-","21/01/2018","18.30"));
        plist19.add(new Partidos("Betis","Barcelona","-","-","21/01/2018","20.45"));
        plist19.add(new Partidos("Eibar","Málaga","-","-","22/01/2018","21.00"));


        List<Partidos> plist20 = new ArrayList<Partidos>();
        plist20.add(new Partidos("Ath. Club","Eibar","-","-","26/01/2018","21.00"));
        plist20.add(new Partidos("Deportivo","Levante","-","-","27/01/2018","13.00"));
        plist20.add(new Partidos("Valencia","Madrid","-","-","27/01/2018","16.15"));
        plist20.add(new Partidos("Málaga","Girona","-","-","27/01/2018","18.30"));
        plist20.add(new Partidos("Villarreal","Real Sociedad","-","-","27/01/2018","20.45"));
        plist20.add(new Partidos("Leganés","Espanyol","-","-","28/01/2018","12.00"));
        plist20.add(new Partidos("Atlético","Las Palmas","-","-","28/01/2018","16.15"));
        plist20.add(new Partidos("Sevilla","Getafe","-","-","28/01/2018","18.30"));
        plist20.add(new Partidos("Bacelona","Alavés","-","-","28/01/2018","20.45"));
        plist20.add(new Partidos("Celta", "Betis","-","-","29/01/2018","21.00"));


        List<Partidos> plist21 = new ArrayList<Partidos>();
        plist21.add(new Partidos("Real Sociedad","Deportivo","-","-","02/02/2018","21.00"));
        plist21.add(new Partidos("Eibar","Sevilla","-","-","03/02/2018","13.00"));
        plist21.add(new Partidos("Betis","Villarreal","-","-","03/02/2018","16.15"));
        plist21.add(new Partidos("Alavés","Celta","-","-","03/02/2018","18.30"));
        plist21.add(new Partidos("Levante","Madrid","-","-","03/02/2018","20.45"));
        plist21.add(new Partidos("Getafe","Leganés","-","-","04/02/2018","12.00"));
        plist21.add(new Partidos("Espanyol","Barcelona","-","-","04/02/2018","16.15"));
        plist21.add(new Partidos("Girona","Ath. Club","-","-","04/02/2018","18.30"));
        plist21.add(new Partidos("Atlético","Valencia","-","-","04/02/2018","20.45"));
        plist21.add(new Partidos("Las Palmas","Málaga","-","-","05/02/2018","21.00"));


        List<Partidos> plist22 = new ArrayList<Partidos>();
        plist22.add(new Partidos("Villarreal","Alavés","-","0","11/02/2018","17.00"));
        plist22.add(new Partidos("Valencia","Levante","-","-","11/02/2018","17.00"));
        plist22.add(new Partidos("Sevilla", "Girona","-","-","11/02/2018","17.00"));
        plist22.add(new Partidos("Madrid","Real Sociedad","-","-","11/02/2018","17.00"));
        plist22.add(new Partidos("Málaga","Atlético","-","-","11/02/2018","17.00"));
        plist22.add(new Partidos("Leganés","Eibar","-","-","11/02/2018","17.00"));
        plist22.add(new Partidos("Deportivo","Betis","-","-","11/02/2018","17.00"));
        plist22.add(new Partidos("Celta","Espanyol","-","-","11/02/2018","17.00"));
        plist22.add(new Partidos("Barcelona","Getafe","-","-","11/02/2018","17.00"));
        plist22.add(new Partidos("Ath. Club","Las Palmas","-","-","11/02/2018","17.00"));


        jlist0.add(new JornadasList("Jornada1",plist0));
        jlist0.add(new JornadasList("Jornada2",plist1));
        jlist0.add(new JornadasList("Jornada3",plist2));
        jlist0.add(new JornadasList("Jornada4",plist3));
        jlist0.add(new JornadasList("Jornada5",plist4));
        jlist0.add(new JornadasList("Jornada6",plist5));
        jlist0.add(new JornadasList("Jornada7",plist6));
        jlist0.add(new JornadasList("Jornada8",plist7));
        jlist0.add(new JornadasList("Jornada9",plist8));
        jlist0.add(new JornadasList("Jornada10",plist9));
        jlist0.add(new JornadasList("Jornada11",plist10));
        jlist0.add(new JornadasList("Jornada12",plist11));
        jlist0.add(new JornadasList("Jornada13",plist12));
        jlist0.add(new JornadasList("Jornada14",plist13));
        jlist0.add(new JornadasList("Jornada15",plist14));
        jlist0.add(new JornadasList("Jornada16",plist15));
        jlist0.add(new JornadasList("Jornada17",plist16));
        jlist0.add(new JornadasList("Jornada18",plist17));
        jlist0.add(new JornadasList("Jornada19",plist18));
        jlist0.add(new JornadasList("Jornada20",plist19));
        jlist0.add(new JornadasList("Jornada21",plist20));
        jlist0.add(new JornadasList("Jornada22",plist21));
        jlist0.add(new JornadasList("Jornada23",plist22));

        mDatabase.setValue(new Jornadas(jlist0));
    }


}
