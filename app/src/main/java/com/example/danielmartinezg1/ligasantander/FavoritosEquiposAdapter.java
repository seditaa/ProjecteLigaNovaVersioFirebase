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
 * Created by Usuari on 15/01/2018.
 */

public class FavoritosEquiposAdapter extends BaseAdapter {

    protected FavoritosFragment fragment;
    protected ArrayList<Equipo> items;

    public FavoritosEquiposAdapter(FavoritosFragment fragment, ArrayList<Equipo> items) {
        this.fragment = fragment;
        this.items = items;
    }

    Context contextfavoritos;
    List<Equipo> ItemClassfavoritos;


    public FavoritosEquiposAdapter(Context contextfavoritos, List<Equipo> itemClassfavoritos) {
        this.contextfavoritos = contextfavoritos;
        ItemClassfavoritos = itemClassfavoritos;
    }

    @Override
    public int getCount() {
        return ItemClassfavoritos.size();
    }

    @Override
    public Object getItem(int position) {
        return ItemClassfavoritos.get(position);
    }

    @Override
    public long getItemId(int position) {
        return ItemClassfavoritos.indexOf(getItem(position));
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            LayoutInflater mInflater = (LayoutInflater) contextfavoritos
                    .getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
            convertView = mInflater.inflate(R.layout.favoritos_item_layout, null);
        }

        TextView favorito = (TextView) convertView.findViewById(R.id.favorito_txt);


        Equipo row_pos = ItemClassfavoritos.get(position);
        // setting the image resource and title


        favorito.setText(row_pos.getNom());



        return convertView;
    }
}
