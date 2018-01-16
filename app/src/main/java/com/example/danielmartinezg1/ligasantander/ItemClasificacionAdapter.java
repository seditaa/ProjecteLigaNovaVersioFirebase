package com.example.danielmartinezg1.ligasantander;

import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Dani on 12/01/2018.
 */
//ADAPTADOR PERSONALITZAT PER CONFIGURAR UN NOU MODEL DE LISTVIEW
public class ItemClasificacionAdapter extends BaseAdapter {
    protected PartidosFragment fragment;
    protected ArrayList<Partidos> items;

    //Constructor
    public ItemClasificacionAdapter(PartidosFragment fragment, ArrayList<Partidos> items) {
        this.fragment = fragment;
        this.items = items;
    }

    Context context;
    List<Partidos> ItemClass;

    //Constructor
    ItemClasificacionAdapter(Context context, List<Partidos> ItemClass) {
        this.context = context;
        this.ItemClass = ItemClass;
    }

    //Getters
    @Override
    public int getCount() {

        return ItemClass.size();
    }

    @Override
    public Object getItem(int position) {
        return ItemClass.get(position);
    }

    @Override
    public long getItemId(int position) {
        return ItemClass.indexOf(getItem(position));
    }

    //Métode getView on inflem el nou layout de l'item al ListView dessitjat
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            LayoutInflater mInflater = (LayoutInflater) context
                    .getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
            convertView = mInflater.inflate(R.layout.clasificacion_listview_item_layout, null);
        }

        TextView equipo1 = (TextView) convertView.findViewById(R.id.equipo1);
        TextView equipo2 = (TextView) convertView.findViewById(R.id.equipo2);
        TextView resultado1 = (TextView) convertView.findViewById(R.id.resultado1);
        TextView resultado2 = (TextView) convertView.findViewById(R.id.resultado2);
        TextView dia = (TextView) convertView.findViewById(R.id.fecha);
        TextView hora = (TextView) convertView.findViewById(R.id.hora);

        Partidos row_pos = ItemClass.get(position);

        equipo1.setText(row_pos.getEquipo1());
        equipo2.setText(row_pos.getEquipo2());
        resultado1.setText(row_pos.getResultado1());
        resultado2.setText(row_pos.getResultado2());
        dia.setText(row_pos.getDia());
        hora.setText(row_pos.getHora());

        return convertView;
    }
}
