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
                BlankFragment BlankFragment = new BlankFragment();
                fragmentTransaction = fragmentTransaction.replace(R.id.content_frame, BlankFragment);
                fragmentTransaction.commit();

                mDatabase = FirebaseDatabase.getInstance().getReference().child("semana2");
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
                mDatabase.addChildEventListener(childEventListener);
                mDatabase.addValueEventListener(eventListener);

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

                ListView mListView = (ListView) findViewById(R.id.listview);
                mDatabase = FirebaseDatabase.getInstance().getReference().child("20161120");
                firebaseListAdapter = new FirebaseListAdapter<String>(this, String.class, android.R.layout.simple_list_item_1, mDatabase) {
                    @Override
                    protected void populateView(View v, String model, int position) {
                        TextView textview = (TextView) v.findViewById(android.R.id.text1);
                        textview.setText(model);
                    }
                };
                mListView.setAdapter(firebaseListAdapter);

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

