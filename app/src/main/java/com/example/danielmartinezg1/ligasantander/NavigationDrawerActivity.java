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
//ACTIVITAT PRINCIPAL DE LA APLICACIÓ
public class NavigationDrawerActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    DrawerLayout drawer;
    Toolbar toolbar;
    NavigationView navigationView;
    ActionBar actionBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigation_drawer);

        //Elements de la NavigationDrawer
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

        //Establim WelcomeFragment com a fragment principal de la activitat
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
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem menuItem) {
        // Donem funcionalitats als elements del Navigation View
        switch (menuItem.getItemId()) {
            case R.id.partidos:
                menuItem.setChecked(true);
                setFragment(0);
                drawer.closeDrawer(GravityCompat.START);
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
                return true;

        }
        return true;


    }


    public void setFragment(int position) {
        FragmentManager fragmentManager;
        FragmentTransaction fragmentTransaction;
        switch (position) {
            case 0:
                //Executem el fragment PartidosFragment
                fragmentManager = getSupportFragmentManager();
                fragmentTransaction = fragmentManager.beginTransaction();
                PartidosFragment PartidosFragment = new PartidosFragment();
                //Creem el bundle i li introduim la Jornada actual per a que aquest
                // s'obri en la jornada que volem establir
                Bundle bundle = new Bundle();
                String numJornada = new String();
                //Jornada actual
                numJornada="18";
                bundle.putString("Jornada",numJornada);
                PartidosFragment.setArguments(bundle);
                //Comunicació amb el fragment PartidosFragment per visualitzar la jornada actual
                fragmentTransaction = fragmentTransaction.replace(R.id.content_frame, PartidosFragment);
                fragmentTransaction.commit();
                break;
            case 1:
                //Executem el fragment CalendarFragment
                fragmentManager = getSupportFragmentManager();
                fragmentTransaction = fragmentManager.beginTransaction();
                CalendarFragment calendarFragment = new CalendarFragment();
                fragmentTransaction.replace(R.id.content_frame, calendarFragment);
                fragmentTransaction.commit();
                break;
            case 2:
                //Executem el fragment ClassificationFragment
                fragmentManager = getSupportFragmentManager();
                fragmentTransaction = fragmentManager.beginTransaction();
                ClasificacionFragment clasificacionFragment = new ClasificacionFragment();
                fragmentTransaction.replace(R.id.content_frame, clasificacionFragment);
                fragmentTransaction.commit();
                break;
            case 3:
                //Executem el fragment FavoritosFragment
                fragmentManager = getSupportFragmentManager();
                fragmentTransaction = fragmentManager.beginTransaction();
                FavoritosFragment favoritosFragment = new FavoritosFragment();
                fragmentTransaction.replace(R.id.content_frame, favoritosFragment);
                fragmentTransaction.commit();
                break;
            case 4:
                //Executem el fragment GoleadoresFragment
                fragmentManager = getSupportFragmentManager();
                fragmentTransaction = fragmentManager.beginTransaction();
                GoleadoresFragment goleadoresFragment = new GoleadoresFragment();
                fragmentTransaction.replace(R.id.content_frame, goleadoresFragment);
                fragmentTransaction.commit();
                break;
            case 5:
                //Executem el fragment WelcomeFragment
                fragmentManager = getSupportFragmentManager();
                fragmentTransaction = fragmentManager.beginTransaction();
                WelcomeFragment welcomeFragment = new WelcomeFragment();
                fragmentTransaction.replace(R.id.content_frame, welcomeFragment);
                fragmentTransaction.commit();
                break;
        }
    }



}

