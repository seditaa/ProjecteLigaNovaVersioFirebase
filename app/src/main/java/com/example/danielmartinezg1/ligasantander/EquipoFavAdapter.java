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
 * Created by Dani on 14/01/2018.
 */
//ADAPTADOR PERSONALITZAT PER CONFIGURAR UN NOU MODEL DE LISTVIEW
public class EquipoFavAdapter extends BaseAdapter{
    protected EquipoFavfragment fragment;
    protected ArrayList<Jugador> items;

    //Constructor
    public EquipoFavAdapter(EquipoFavfragment fragment, ArrayList<Jugador> items) {
        this.fragment = fragment;
        this.items = items;
    }

    Context contextFav;
    List<Jugador> ItemClassFav;

    //Constructor
    public EquipoFavAdapter(Context contextFav, List<Jugador> itemClassCFav) {
        this.contextFav = contextFav;
        ItemClassFav = itemClassCFav;
    }

    //Getters
    @Override
    public int getCount() {
        return ItemClassFav.size();
    }

    @Override
    public Object getItem(int position) {
        return ItemClassFav.get(position);
    }

    @Override
    public long getItemId(int position) {
        return ItemClassFav.indexOf(getItem(position));
    }

    //Métode getView on inflem el nou layout de l'item al ListView dessitjat
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            LayoutInflater mInflater = (LayoutInflater) contextFav
                    .getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
            convertView = mInflater.inflate(R.layout.info_equipo_fav, null);
        }

        TextView nombrejugador = (TextView) convertView.findViewById(R.id.nomjugador);
        TextView goles = (TextView) convertView.findViewById(R.id.golsjugador);
        TextView assist = (TextView) convertView.findViewById(R.id.assistenciesjugador);

        Jugador row_pos = ItemClassFav.get(position);

        nombrejugador.setText(row_pos.getNom());
        goles.setText(row_pos.getGols());
        assist.setText(row_pos.getAsistencies());

        return convertView;
    }
}
