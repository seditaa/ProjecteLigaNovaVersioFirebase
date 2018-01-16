package com.example.danielmartinezg1.ligasantander;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Dani on 15/01/2018.
 */
//ADAPTADOR PERSONALITZAT PER CONFIGURAR UN NOU MODEL DE LISTVIEW
public class GoleadoresAdapter extends BaseAdapter {
    protected GoleadoresFragment fragment;
    protected ArrayList<Jugador> items;

    //Constructor
    public GoleadoresAdapter(GoleadoresFragment fragment, ArrayList<Jugador> items) {
        this.fragment = fragment;
        this.items = items;
    }

    Context contextGol;
    List<Jugador> ItemClassGol;

    //Constructor
    public GoleadoresAdapter(Context contextGol, List<Jugador> itemClassfavoritos) {
        this.contextGol = contextGol;
        ItemClassGol = itemClassfavoritos;
    }

    //Getters
    @Override
    public int getCount() {
        return ItemClassGol.size();
    }

    @Override
    public Object getItem(int position) {
        return ItemClassGol.get(position);
    }

    @Override
    public long getItemId(int position) {
        return ItemClassGol.indexOf(getItem(position));
    }

    //Métode getView on inflem el nou layout de l'item al ListView dessitjat
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            LayoutInflater mInflater = (LayoutInflater) contextGol
                    .getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
            convertView = mInflater.inflate(R.layout.item_goleadores_layout, null);
        }

        TextView goles = (TextView) convertView.findViewById(R.id.goles_txt);
        TextView nombre = (TextView) convertView.findViewById(R.id.nombre_txt);

        Jugador row_pos = ItemClassGol.get(position);

        goles.setText(row_pos.getGols());
        nombre.setText(row_pos.getNom());

        return convertView;
    }
}
