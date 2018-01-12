package com.example.danielmartinezg1.ligasantander;

import android.app.Activity;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

public class ClasificacionFragment extends Fragment {
    public DatabaseReference mDatabase;
    public ValueEventListener eventListener;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final View view = inflater.inflate(R.layout.fragment_clasificacion, container, false);

        getActivity().setTitle("Clasificación");

        mDatabase = FirebaseDatabase.getInstance().getReference().child("clasificacion_fragment");
        eventListener = new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                //EQUIPOS
                TextView equipo1nombre = (TextView) view.findViewById(R.id.equipo1nombre);
                TextView equipo2nombre = (TextView) view.findViewById(R.id.equipo2nombre);

                TextView equipo3nombre = (TextView) view.findViewById(R.id.equipo3nombre);
                TextView puntos = (TextView) view.findViewById(R.id.equipo1puntos);
                TextView partidosganados = (TextView) view.findViewById(R.id.equipo1pg);
                TextView partidosperdidos = (TextView) view.findViewById(R.id.equipo1pp);
                /*
                TextView equipo4nombre = (TextView) findViewById(R.id.equipo4nombre);
                TextView equipo5nombre = (TextView) findViewById(R.id.equipo5nombre);
                TextView equipo6nombre = (TextView) findViewById(R.id.equipo6nombre);
                TextView equipo7nombre = (TextView) findViewById(R.id.equipo7nombre);
                TextView equipo8nombre = (TextView) findViewById(R.id.equipo8nombre);
                TextView equipo9nombre = (TextView) findViewById(R.id.equipo9nombre);
                TextView equipo10nombre = (TextView) findViewById(R.id.equipo10nombre);
                TextView equipo11nombre = (TextView) findViewById(R.id.equipo11nombre);
                TextView equipo12nombre = (TextView) findViewById(R.id.equipo12nombre);
                TextView equipo13nombre = (TextView) findViewById(R.id.equipo13nombre);
                TextView equipo14nombre = (TextView) findViewById(R.id.equipo14nombre);
                TextView equipo15nombre = (TextView) findViewById(R.id.equipo15nombre);
                TextView equipo16nombre = (TextView) findViewById(R.id.equipo16nombre);
                TextView equipo17nombre = (TextView) findViewById(R.id.equipo17nombre);
                TextView equipo18nombre = (TextView) findViewById(R.id.equipo18nombre);
                TextView equipo19nombre = (TextView) findViewById(R.id.equipo19nombre);
                TextView equipo20nombre = (TextView) findViewById(R.id.equipo20nombre);
*/
                equipo1nombre.setText(dataSnapshot.child("equipos").child("eq01").getValue().toString());
                equipo2nombre.setText(dataSnapshot.child("equipos").child("eq02").getValue().toString());
                equipo3nombre.setText(dataSnapshot.child("equipos").child("eq03").getValue().toString());
                puntos.setText(dataSnapshot.child("puntos").child("p1").getValue().toString());
                partidosganados.setText(dataSnapshot.child("pg").child("g1").getValue().toString());
                partidosperdidos.setText(dataSnapshot.child("pp").child("p1").getValue().toString());
                /*
                equipo4nombre.setText(dataSnapshot.child("eq04").getValue().toString());
                equipo5nombre.setText(dataSnapshot.child("eq05").getValue().toString());
                equipo6nombre.setText(dataSnapshot.child("eq06").getValue().toString());
                equipo7nombre.setText(dataSnapshot.child("eq07").getValue().toString());
                equipo8nombre.setText(dataSnapshot.child("eq08").getValue().toString());
                equipo9nombre.setText(dataSnapshot.child("eq09").getValue().toString());
                equipo10nombre.setText(dataSnapshot.child("eq10").getValue().toString());
                equipo11nombre.setText(dataSnapshot.child("eq11").getValue().toString());
                equipo12nombre.setText(dataSnapshot.child("eq12").getValue().toString());
                equipo13nombre.setText(dataSnapshot.child("eq13").getValue().toString());
                equipo14nombre.setText(dataSnapshot.child("eq14").getValue().toString());
                equipo15nombre.setText(dataSnapshot.child("eq15").getValue().toString());
                equipo16nombre.setText(dataSnapshot.child("eq16").getValue().toString());
                equipo17nombre.setText(dataSnapshot.child("eq17").getValue().toString());
                equipo18nombre.setText(dataSnapshot.child("eq18").getValue().toString());
                equipo19nombre.setText(dataSnapshot.child("eq19").getValue().toString());
                equipo20nombre.setText(dataSnapshot.child("eq20").getValue().toString());

                //PUNTOS
                TextView equipo1puntos = (TextView) findViewById(R.id.equipo1puntos);
                TextView equipo2puntos = (TextView) findViewById(R.id.equipo2puntos);
                TextView equipo3puntos = (TextView) findViewById(R.id.equipo3puntos);
                TextView equipo4puntos = (TextView) findViewById(R.id.equipo4puntos);
                TextView equipo5puntos = (TextView) findViewById(R.id.equipo5puntos);
                TextView equipo6puntos = (TextView) findViewById(R.id.equipo6puntos);
                TextView equipo7puntos = (TextView) findViewById(R.id.equipo7puntos);
                TextView equipo8puntos = (TextView) findViewById(R.id.equipo8puntos);
                TextView equipo9puntos = (TextView) findViewById(R.id.equipo9puntos);
                TextView equipo10puntos = (TextView) findViewById(R.id.equipo10puntos);
                TextView equipo11puntos = (TextView) findViewById(R.id.equipo11puntos);
                TextView equipo12puntos = (TextView) findViewById(R.id.equipo12puntos);
                TextView equipo13puntos = (TextView) findViewById(R.id.equipo13puntos);
                TextView equipo14puntos = (TextView) findViewById(R.id.equipo14puntos);
                TextView equipo15puntos = (TextView) findViewById(R.id.equipo15puntos);
                TextView equipo16puntos = (TextView) findViewById(R.id.equipo16puntos);
                TextView equipo17puntos = (TextView) findViewById(R.id.equipo17puntos);
                TextView equipo18puntos = (TextView) findViewById(R.id.equipo18puntos);
                TextView equipo19puntos = (TextView) findViewById(R.id.equipo19puntos);
                TextView equipo20puntos = (TextView) findViewById(R.id.equipo20puntos);
                */
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        };

        mDatabase.addValueEventListener(eventListener);

        return view;
    }


}


