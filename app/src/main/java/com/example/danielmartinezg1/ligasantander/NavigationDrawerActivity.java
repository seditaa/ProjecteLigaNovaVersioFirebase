package com.example.danielmartinezg1.ligasantander;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.ActionBar;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;
import android.widget.TextView;

import com.firebase.ui.database.FirebaseListAdapter;
import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

public class NavigationDrawerActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    DrawerLayout drawer;
    Toolbar toolbar;
    NavigationView navigationView;
    ActionBar actionBar;
    TextView txt_prueba;
    TextView txt_prueba2;
    TextView txt_prueba3;

    public DatabaseReference mDatabase;
    public ValueEventListener eventListener;
    public ChildEventListener childEventListener;
    public FirebaseListAdapter <String> firebaseListAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigation_drawer);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        actionBar = getSupportActionBar();
        actionBar.setHomeAsUpIndicator(R.drawable.side_nav_bar);
        actionBar.setDisplayHomeAsUpEnabled(true);

        drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        setFragment(5);
    }

    @Override
    public void onBackPressed() {
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.navigation_drawer, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem menuItem) {
        // Handle navigation view item clicks here.
        switch (menuItem.getItemId()) {
            case R.id.partidos:
                menuItem.setChecked(true);
                setFragment(0);
                drawer.closeDrawer(GravityCompat.START);
                Log.i("Dani","clicado");
                return true;
            case R.id.calendario:
                menuItem.setChecked(true);
                setFragment(1);
                drawer.closeDrawer(GravityCompat.START);
                return true;
            case R.id.clasificacion:
                menuItem.setChecked(true);
                setFragment(2);
                drawer.closeDrawer(GravityCompat.START);
                Log.i("Dani","clicado");
                return true;
            case R.id.favoritos:
                menuItem.setChecked(true);
                setFragment(3);
                drawer.closeDrawer(GravityCompat.START);
                return true;
            case R.id.goleadores:
                menuItem.setChecked(true);
                setFragment(4);
                drawer.closeDrawer(GravityCompat.START);
                Log.i("Dani","clicado");
                return true;

        }
        return true;


    }


    public void setFragment(int position) {
        FragmentManager fragmentManager;
        FragmentTransaction fragmentTransaction;
        switch (position) {
            case 0:
                fragmentManager = getSupportFragmentManager();
                fragmentTransaction = fragmentManager.beginTransaction();
                PartidosFragment PartidosFragment = new PartidosFragment();
                fragmentTransaction = fragmentTransaction.replace(R.id.content_frame, PartidosFragment);
                fragmentTransaction.commit();

/*
      //          mDatabase = FirebaseDatabase.getInstance().getReference("provaJugador");
//                List<Jugador> lj = new ArrayList<Jugador>();
//                lj.add(new Jugador("Mesi",10,20));
//                mDatabase.setValue(new Equipo("b",34,78,lj));
                mDatabase.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(DataSnapshot dataSnapshot) {
                        txt_prueba = (TextView) findViewById(R.id.txt_prueba);
                        txt_prueba2 = (TextView) findViewById(R.id.txt_prueba2);
                        txt_prueba3 = (TextView) findViewById(R.id.txt_prueba3);

                        Equipo e = dataSnapshot.getValue(Equipo.class);
                        txt_prueba3.setText(e.getNom());
                        txt_prueba2.setText(e.getJugadorList().get(0).getNom());
                    }

                    @Override
                    public void onCancelled(DatabaseError databaseError) {

                    }
                });
                childEventListener = new ChildEventListener() {
                    @Override
                    public void onChildAdded(DataSnapshot dataSnapshot, String s) {
                        Log.i("Dani","child added");
                    }

                    @Override
                    public void onChildChanged(DataSnapshot dataSnapshot, String s) {
                        Log.i("Dani","child changed");
                    }

                    @Override
                    public void onChildRemoved(DataSnapshot dataSnapshot) {
                        Log.i("Dani","child removed");
                    }

                    @Override
                    public void onChildMoved(DataSnapshot dataSnapshot, String s) {
                        Log.i("Dani","child moved");
                    }

                    @Override
                    public void onCancelled(DatabaseError databaseError) {
                        Log.e("Error","Error",databaseError.toException());
                    }
                };
                eventListener = new ValueEventListener() {
                    @Override
                    public void onDataChange(DataSnapshot dataSnapshot) {
                        txt_prueba = (TextView) findViewById(R.id.txt_prueba);
                        txt_prueba2 = (TextView) findViewById(R.id.txt_prueba2);
                        txt_prueba3 = (TextView) findViewById(R.id.txt_prueba3);
                        //txt_prueba.setText(dataSnapshot.child("dia1").getValue().toString());
                        //txt_prueba2.setText(dataSnapshot.child("dia2").getValue().toString());
                        //txt_prueba3.setText(dataSnapshot.child("dia3").getValue().toString());
                    }

                    @Override
                    public void onCancelled(DatabaseError databaseError) {

                    }
                };
                //mDatabase.addChildEventListener(childEventListener);
                //mDatabase.addValueEventListener(eventListener);
*/
                break;
            case 1:
                fragmentManager = getSupportFragmentManager();
                fragmentTransaction = fragmentManager.beginTransaction();
                CalendarFragment calendarFragment = new CalendarFragment();
                fragmentTransaction.replace(R.id.content_frame, calendarFragment);
                fragmentTransaction.commit();
                break;
            case 2:
                fragmentManager = getSupportFragmentManager();
                fragmentTransaction = fragmentManager.beginTransaction();
                ClasificacionFragment clasificacionFragment = new ClasificacionFragment();
                fragmentTransaction.replace(R.id.content_frame, clasificacionFragment);
                fragmentTransaction.commit();
/*
                mDatabase = FirebaseDatabase.getInstance().getReference().child("clasificacion_fragment").child("equipos");
                eventListener = new ValueEventListener() {
                    @Override
                    public void onDataChange(DataSnapshot dataSnapshot) {
                        //EQUIPOS
                        TextView equipo1nombre = (TextView) findViewById(R.id.equipo1nombre);
                        TextView equipo2nombre = (TextView) findViewById(R.id.equipo2nombre);
                        TextView equipo3nombre = (TextView) findViewById(R.id.equipo3nombre);
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

                        equipo1nombre.setText(dataSnapshot.child("eq01").getValue().toString());
                        equipo2nombre.setText(dataSnapshot.child("eq02").getValue().toString());
                        equipo3nombre.setText(dataSnapshot.child("eq03").getValue().toString());
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
                    }

                    @Override
                    public void onCancelled(DatabaseError databaseError) {

                    }
                };

                mDatabase.addValueEventListener(eventListener);
*/
                break;
            case 3:
                fragmentManager = getSupportFragmentManager();
                fragmentTransaction = fragmentManager.beginTransaction();
                FavoritosFragment favoritosFragment = new FavoritosFragment();
                fragmentTransaction.replace(R.id.content_frame, favoritosFragment);
                fragmentTransaction.commit();
                break;
            case 4:
                fragmentManager = getSupportFragmentManager();
                fragmentTransaction = fragmentManager.beginTransaction();
                GoleadoresFragment goleadoresFragment = new GoleadoresFragment();
                fragmentTransaction.replace(R.id.content_frame, goleadoresFragment);
                fragmentTransaction.commit();
/*
                ListView mListView = (ListView) findViewById(R.id.listview);
                mDatabase = FirebaseDatabase.getInstance().getReference().child("20161120");
                firebaseListAdapter = new <String>(this, String.class, android.R.layout.simple_list_item_1, mDatabase) {
                    @Override
                    protected void populateView(View v, String model, int position) {
                        TextView textview = (TextView) v.findViewById(android.R.id.text1);
                        textview.setText(model);
                    }
                };
                mListView.setAdapter(firebaseListAdapter);
*/
                break;
            case 5:
                fragmentManager = getSupportFragmentManager();
                fragmentTransaction = fragmentManager.beginTransaction();
                WelcomeFragment welcomeFragment = new WelcomeFragment();
                fragmentTransaction.replace(R.id.content_frame, welcomeFragment);
                fragmentTransaction.commit();
                break;
        }
    }



}

