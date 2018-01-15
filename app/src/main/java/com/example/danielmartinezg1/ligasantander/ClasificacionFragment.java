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

        mDatabase = FirebaseDatabase.getInstance().getReference().child("Equipos").child("equipo_list");
        eventListener = new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                //EQUIPOS
                TextView equipo1nombre = (TextView) view.findViewById(R.id.equipo1nombre);
                TextView equipo2nombre = (TextView) view.findViewById(R.id.equipo2nombre);
                TextView equipo3nombre = (TextView) view.findViewById(R.id.equipo3nombre);
                TextView equipo4nombre = (TextView) view.findViewById(R.id.equipo4nombre);
                TextView equipo5nombre = (TextView) view.findViewById(R.id.equipo5nombre);
                TextView equipo6nombre = (TextView) view.findViewById(R.id.equipo6nombre);
                TextView equipo7nombre = (TextView) view.findViewById(R.id.equipo7nombre);
                TextView equipo8nombre = (TextView) view.findViewById(R.id.equipo8nombre);
                TextView equipo9nombre = (TextView) view.findViewById(R.id.equipo9nombre);
                TextView equipo10nombre = (TextView) view.findViewById(R.id.equipo10nombre);
                TextView equipo11nombre = (TextView) view.findViewById(R.id.equipo11nombre);
                TextView equipo12nombre = (TextView) view.findViewById(R.id.equipo12nombre);
                TextView equipo13nombre = (TextView) view.findViewById(R.id.equipo13nombre);
                TextView equipo14nombre = (TextView) view.findViewById(R.id.equipo14nombre);
                TextView equipo15nombre = (TextView) view.findViewById(R.id.equipo15nombre);
                TextView equipo16nombre = (TextView) view.findViewById(R.id.equipo16nombre);
                TextView equipo17nombre = (TextView) view.findViewById(R.id.equipo17nombre);
                TextView equipo18nombre = (TextView) view.findViewById(R.id.equipo18nombre);
                TextView equipo19nombre = (TextView) view.findViewById(R.id.equipo19nombre);
                TextView equipo20nombre = (TextView) view.findViewById(R.id.equipo20nombre);

                equipo1nombre.setText(dataSnapshot.child("0").child("nom").getValue().toString());
                equipo2nombre.setText(dataSnapshot.child("1").child("nom").getValue().toString());
                equipo3nombre.setText(dataSnapshot.child("2").child("nom").getValue().toString());
                //TODO:acabar de hacer setText de los nombres de los equipos de la misma manera que se hace con los 3 casos de arriba (equipo4nombre seria el siguiente)

                //PUNTOS
                TextView equipo1puntos = (TextView) view.findViewById(R.id.equipo1puntos);
                TextView equipo2puntos = (TextView) view.findViewById(R.id.equipo2puntos);
                TextView equipo3puntos = (TextView) view.findViewById(R.id.equipo3puntos);
                TextView equipo4puntos = (TextView) view.findViewById(R.id.equipo4puntos);
                TextView equipo5puntos = (TextView) view.findViewById(R.id.equipo5puntos);
                TextView equipo6puntos = (TextView) view.findViewById(R.id.equipo6puntos);
                TextView equipo7puntos = (TextView) view.findViewById(R.id.equipo7puntos);
                TextView equipo8puntos = (TextView) view.findViewById(R.id.equipo8puntos);
                TextView equipo9puntos = (TextView) view.findViewById(R.id.equipo9puntos);
                TextView equipo10puntos = (TextView) view.findViewById(R.id.equipo10puntos);
                TextView equipo11puntos = (TextView) view.findViewById(R.id.equipo11puntos);
                TextView equipo12puntos = (TextView) view.findViewById(R.id.equipo12puntos);
                TextView equipo13puntos = (TextView) view.findViewById(R.id.equipo13puntos);
                TextView equipo14puntos = (TextView) view.findViewById(R.id.equipo14puntos);
                TextView equipo15puntos = (TextView) view.findViewById(R.id.equipo15puntos);
                TextView equipo16puntos = (TextView) view.findViewById(R.id.equipo16puntos);
                TextView equipo17puntos = (TextView) view.findViewById(R.id.equipo17puntos);
                TextView equipo18puntos = (TextView) view.findViewById(R.id.equipo18puntos);
                TextView equipo19puntos = (TextView) view.findViewById(R.id.equipo19puntos);
                TextView equipo20puntos = (TextView) view.findViewById(R.id.equipo20puntos);

                equipo1puntos.setText(dataSnapshot.child("0").child("punts").getValue().toString());
                equipo2puntos.setText(dataSnapshot.child("1").child("punts").getValue().toString());
                //TODO: actualizar los child de la misma manera que està hecho con equipos y los 2 ejemplos de arriba
                equipo3puntos.setText(dataSnapshot.child("puntos").child("p3").getValue().toString());
                equipo4puntos.setText(dataSnapshot.child("puntos").child("p4").getValue().toString());
                equipo5puntos.setText(dataSnapshot.child("puntos").child("p5").getValue().toString());
                equipo6puntos.setText(dataSnapshot.child("puntos").child("p6").getValue().toString());
                equipo7puntos.setText(dataSnapshot.child("puntos").child("p7").getValue().toString());
                equipo8puntos.setText(dataSnapshot.child("puntos").child("p8").getValue().toString());
                equipo9puntos.setText(dataSnapshot.child("puntos").child("p9").getValue().toString());
                equipo10puntos.setText(dataSnapshot.child("puntos").child("p10").getValue().toString());
                equipo11puntos.setText(dataSnapshot.child("puntos").child("p11").getValue().toString());
                equipo12puntos.setText(dataSnapshot.child("puntos").child("p12").getValue().toString());
                equipo13puntos.setText(dataSnapshot.child("puntos").child("p13").getValue().toString());
                equipo14puntos.setText(dataSnapshot.child("puntos").child("p14").getValue().toString());
                equipo15puntos.setText(dataSnapshot.child("puntos").child("p15").getValue().toString());
                equipo16puntos.setText(dataSnapshot.child("puntos").child("p16").getValue().toString());
                equipo17puntos.setText(dataSnapshot.child("puntos").child("p17").getValue().toString());
                equipo18puntos.setText(dataSnapshot.child("puntos").child("p18").getValue().toString());
                equipo19puntos.setText(dataSnapshot.child("puntos").child("p19").getValue().toString());
                equipo20puntos.setText(dataSnapshot.child("puntos").child("p20").getValue().toString());


                //PARTIDOS GANADOS
                TextView partidosganados1 = (TextView) view.findViewById(R.id.equipo1pg);
                TextView partidosganados2 = (TextView) view.findViewById(R.id.equipo2pg);
                TextView partidosganados3 = (TextView) view.findViewById(R.id.equipo3pg);
                TextView partidosganados4 = (TextView) view.findViewById(R.id.equipo4pg);
                TextView partidosganados5 = (TextView) view.findViewById(R.id.equipo5pg);
                TextView partidosganados6 = (TextView) view.findViewById(R.id.equipo6pg);
                TextView partidosganados7 = (TextView) view.findViewById(R.id.equipo7pg);
                TextView partidosganados8 = (TextView) view.findViewById(R.id.equipo8pg);
                TextView partidosganados9 = (TextView) view.findViewById(R.id.equipo9pg);
                TextView partidosganados10 = (TextView) view.findViewById(R.id.equipo10pg);
                TextView partidosganados11 = (TextView) view.findViewById(R.id.equipo11pg);
                TextView partidosganados12 = (TextView) view.findViewById(R.id.equipo12pg);
                TextView partidosganados13 = (TextView) view.findViewById(R.id.equipo13pg);
                TextView partidosganados14 = (TextView) view.findViewById(R.id.equipo14pg);
                TextView partidosganados15 = (TextView) view.findViewById(R.id.equipo15pg);
                TextView partidosganados16 = (TextView) view.findViewById(R.id.equipo16pg);
                TextView partidosganados17 = (TextView) view.findViewById(R.id.equipo17pg);
                TextView partidosganados18 = (TextView) view.findViewById(R.id.equipo18pg);
                TextView partidosganados19 = (TextView) view.findViewById(R.id.equipo19pg);
                TextView partidosganados20 = (TextView) view.findViewById(R.id.equipo20pg);

                partidosganados1.setText(dataSnapshot.child("0").child("pg").getValue().toString());
                partidosganados2.setText(dataSnapshot.child("1").child("pg").getValue().toString());
                //TODO: actualizar los child de la misma manera que està hecho con equipos y los 2 ejemplos de arriba
                partidosganados3.setText(dataSnapshot.child("pg").child("g3").getValue().toString());
                partidosganados4.setText(dataSnapshot.child("pg").child("g4").getValue().toString());
                partidosganados5.setText(dataSnapshot.child("pg").child("g5").getValue().toString());
                partidosganados6.setText(dataSnapshot.child("pg").child("g6").getValue().toString());
                partidosganados7.setText(dataSnapshot.child("pg").child("g7").getValue().toString());
                partidosganados8.setText(dataSnapshot.child("pg").child("g8").getValue().toString());
                partidosganados9.setText(dataSnapshot.child("pg").child("g9").getValue().toString());
                partidosganados10.setText(dataSnapshot.child("pg").child("g10").getValue().toString());
                partidosganados11.setText(dataSnapshot.child("pg").child("g11").getValue().toString());
                partidosganados12.setText(dataSnapshot.child("pg").child("g12").getValue().toString());
                partidosganados13.setText(dataSnapshot.child("pg").child("g13").getValue().toString());
                partidosganados14.setText(dataSnapshot.child("pg").child("g14").getValue().toString());
                partidosganados15.setText(dataSnapshot.child("pg").child("g15").getValue().toString());
                partidosganados16.setText(dataSnapshot.child("pg").child("g16").getValue().toString());
                partidosganados17.setText(dataSnapshot.child("pg").child("g17").getValue().toString());
                partidosganados18.setText(dataSnapshot.child("pg").child("g18").getValue().toString());
                partidosganados19.setText(dataSnapshot.child("pg").child("g19").getValue().toString());
                partidosganados20.setText(dataSnapshot.child("pg").child("g20").getValue().toString());

                //PARTIDOS PERDIDOS
                TextView partidosperdidos1 = (TextView) view.findViewById(R.id.equipo1pp);
                TextView partidosperdidos2 = (TextView) view.findViewById(R.id.equipo2pp);
                TextView partidosperdidos3 = (TextView) view.findViewById(R.id.equipo3pp);
                TextView partidosperdidos4 = (TextView) view.findViewById(R.id.equipo4pp);
                TextView partidosperdidos5 = (TextView) view.findViewById(R.id.equipo5pp);
                TextView partidosperdidos6 = (TextView) view.findViewById(R.id.equipo6pp);
                TextView partidosperdidos7 = (TextView) view.findViewById(R.id.equipo7pp);
                TextView partidosperdidos8 = (TextView) view.findViewById(R.id.equipo8pp);
                TextView partidosperdidos9 = (TextView) view.findViewById(R.id.equipo9pp);
                TextView partidosperdidos10 = (TextView) view.findViewById(R.id.equipo10pp);
                TextView partidosperdidos11 = (TextView) view.findViewById(R.id.equipo11pp);
                TextView partidosperdidos12 = (TextView) view.findViewById(R.id.equipo12pp);
                TextView partidosperdidos13 = (TextView) view.findViewById(R.id.equipo13pp);
                TextView partidosperdidos14 = (TextView) view.findViewById(R.id.equipo14pp);
                TextView partidosperdidos15 = (TextView) view.findViewById(R.id.equipo15pp);
                TextView partidosperdidos16 = (TextView) view.findViewById(R.id.equipo16pp);
                TextView partidosperdidos17 = (TextView) view.findViewById(R.id.equipo17pp);
                TextView partidosperdidos18 = (TextView) view.findViewById(R.id.equipo18pp);
                TextView partidosperdidos19 = (TextView) view.findViewById(R.id.equipo19pp);
                TextView partidosperdidos20 = (TextView) view.findViewById(R.id.equipo20pp);

                partidosperdidos1.setText(dataSnapshot.child("0").child("pp").getValue().toString());
                partidosperdidos2.setText(dataSnapshot.child("1").child("pp").getValue().toString());
                //TODO: actualizar los child de la misma manera que està hecho con equipos y los 2 ejemplos de arriba
                partidosperdidos3.setText(dataSnapshot.child("pp").child("p3").getValue().toString());
                partidosperdidos4.setText(dataSnapshot.child("pp").child("p4").getValue().toString());
                partidosperdidos5.setText(dataSnapshot.child("pp").child("p5").getValue().toString());
                partidosperdidos6.setText(dataSnapshot.child("pp").child("p6").getValue().toString());
                partidosperdidos7.setText(dataSnapshot.child("pp").child("p7").getValue().toString());
                partidosperdidos8.setText(dataSnapshot.child("pp").child("p8").getValue().toString());
                partidosperdidos9.setText(dataSnapshot.child("pp").child("p9").getValue().toString());
                partidosperdidos10.setText(dataSnapshot.child("pp").child("p10").getValue().toString());
                partidosperdidos11.setText(dataSnapshot.child("pp").child("p11").getValue().toString());
                partidosperdidos12.setText(dataSnapshot.child("pp").child("p12").getValue().toString());
                partidosperdidos13.setText(dataSnapshot.child("pp").child("p13").getValue().toString());
                partidosperdidos14.setText(dataSnapshot.child("pp").child("p14").getValue().toString());
                partidosperdidos15.setText(dataSnapshot.child("pp").child("p15").getValue().toString());
                partidosperdidos16.setText(dataSnapshot.child("pp").child("p16").getValue().toString());
                partidosperdidos17.setText(dataSnapshot.child("pp").child("p17").getValue().toString());
                partidosperdidos18.setText(dataSnapshot.child("pp").child("p18").getValue().toString());
                partidosperdidos19.setText(dataSnapshot.child("pp").child("p19").getValue().toString());
                partidosperdidos20.setText(dataSnapshot.child("pp").child("p20").getValue().toString());

                //PARTIDOS EMPATADOS
                TextView partidosempatados1 = (TextView) view.findViewById(R.id.equipo1pe);
                TextView partidosempatados2 = (TextView) view.findViewById(R.id.equipo2pe);
                TextView partidosempatados3 = (TextView) view.findViewById(R.id.equipo3pe);
                TextView partidosempatados4 = (TextView) view.findViewById(R.id.equipo4pe);
                TextView partidosempatados5 = (TextView) view.findViewById(R.id.equipo5pe);
                TextView partidosempatados6 = (TextView) view.findViewById(R.id.equipo6pe);
                TextView partidosempatados7 = (TextView) view.findViewById(R.id.equipo7pe);
                TextView partidosempatados8 = (TextView) view.findViewById(R.id.equipo8pe);
                TextView partidosempatados9 = (TextView) view.findViewById(R.id.equipo9pe);
                TextView partidosempatados10 = (TextView) view.findViewById(R.id.equipo10pe);
                TextView partidosempatados11 = (TextView) view.findViewById(R.id.equipo11pe);
                TextView partidosempatados12 = (TextView) view.findViewById(R.id.equipo12pe);
                TextView partidosempatados13 = (TextView) view.findViewById(R.id.equipo13pe);
                TextView partidosempatados14 = (TextView) view.findViewById(R.id.equipo14pe);
                TextView partidosempatados15 = (TextView) view.findViewById(R.id.equipo15pe);
                TextView partidosempatados16 = (TextView) view.findViewById(R.id.equipo16pe);
                TextView partidosempatados17 = (TextView) view.findViewById(R.id.equipo17pe);
                TextView partidosempatados18 = (TextView) view.findViewById(R.id.equipo18pe);
                TextView partidosempatados19 = (TextView) view.findViewById(R.id.equipo19pe);
                TextView partidosempatados20 = (TextView) view.findViewById(R.id.equipo20pe);

                partidosempatados1.setText(dataSnapshot.child("0").child("pe").getValue().toString());
                partidosempatados2.setText(dataSnapshot.child("1").child("pe").getValue().toString());
                //TODO: actualizar los child de la misma manera que està hecho con equipos y los 2 ejemplos de arriba
                partidosempatados3.setText(dataSnapshot.child("pe").child("e3").getValue().toString());
                partidosempatados4.setText(dataSnapshot.child("pe").child("e4").getValue().toString());
                partidosempatados5.setText(dataSnapshot.child("pe").child("e5").getValue().toString());
                partidosempatados6.setText(dataSnapshot.child("pe").child("e6").getValue().toString());
                partidosempatados7.setText(dataSnapshot.child("pe").child("e7").getValue().toString());
                partidosempatados8.setText(dataSnapshot.child("pe").child("e8").getValue().toString());
                partidosempatados9.setText(dataSnapshot.child("pe").child("e9").getValue().toString());
                partidosempatados10.setText(dataSnapshot.child("pe").child("e10").getValue().toString());
                partidosempatados11.setText(dataSnapshot.child("pe").child("e11").getValue().toString());
                partidosempatados12.setText(dataSnapshot.child("pe").child("e12").getValue().toString());
                partidosempatados13.setText(dataSnapshot.child("pe").child("e13").getValue().toString());
                partidosempatados14.setText(dataSnapshot.child("pe").child("e14").getValue().toString());
                partidosempatados15.setText(dataSnapshot.child("pe").child("e15").getValue().toString());
                partidosempatados16.setText(dataSnapshot.child("pe").child("e16").getValue().toString());
                partidosempatados17.setText(dataSnapshot.child("pe").child("e17").getValue().toString());
                partidosempatados18.setText(dataSnapshot.child("pe").child("e18").getValue().toString());
                partidosempatados19.setText(dataSnapshot.child("pe").child("e19").getValue().toString());
                partidosempatados20.setText(dataSnapshot.child("pe").child("e20").getValue().toString());

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        };

        mDatabase.addValueEventListener(eventListener);

        return view;
    }


}


