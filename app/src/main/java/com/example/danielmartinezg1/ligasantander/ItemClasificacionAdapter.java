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

public abstract class ItemClasificacionAdapter extends BaseAdapter {
/*
    protected PartidosFragment fragment;
    protected ArrayList<ItemClasificacion> items;


    public ItemClasificacionAdapter(PartidosFragment fragment, ArrayList<ItemClasificacion> items) {
        this.fragment = fragment;
        this.items = items;
    }
*/

    Context context;
    List<ItemClasificacion> ItemClass;
    ItemClasificacionAdapter(Context context, List<ItemClasificacion> ItemClass) {
        this.context = context;
        this.ItemClass = ItemClass;
    }
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

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //View vi = convertView;
/*
        if (vi == null) {

            LayoutInflater inflater = (LayoutInflater) fragment.getContext()
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            vi = inflater.inflate(R.layout.clasificacion_listview_item_layout, null);

        }

        ItemClasificacion item = convertView.get(position);

        ImageView imagen = (ImageView) vi.findViewById(R.id.imagen);
        int imageResource = fragment.getResources()
                .getIdentifier(item.getRutaImagen(), null,
                        fragment.getContext().getPackageName());
        imagen.setImageDrawable(fragment.getResources().getDrawable(
                imageResource));

        ImageView imagen2 = (ImageView) vi.findViewById(R.id.imagen2);
        int imageResource2 = fragment.getResources()
                .getIdentifier(item.getRutaImagen(), null,
                        fragment.getContext().getPackageName());
        imagen2.setImageDrawable(fragment.getResources().getDrawable(
                imageResource2));

        TextView equipo1 = (TextView) vi.findViewById(R.id.equipo1);
        equipo1.setText(item.getEquipo1());

        TextView equipo2 = (TextView) vi.findViewById(R.id.equipo2);
        equipo2.setText(item.getEquipo2());

        TextView fecha = (TextView) vi.findViewById(R.id.fecha);
        fecha.setText(item.getFecha());
*/

        if (convertView == null) {
            LayoutInflater mInflater = (LayoutInflater) context
                    .getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
            convertView = mInflater.inflate(R.layout.clasificacion_listview_item_layout, null);
        }

        TextView equipo1 = (TextView) convertView.findViewById(R.id.equipo1);
        TextView equipo2 = (TextView) convertView.findViewById(R.id.equipo2);
        TextView resultado1 = (TextView) convertView.findViewById(R.id.resultado1);
        TextView resultado2 = (TextView) convertView.findViewById(R.id.resultado2);
        TextView fecha = (TextView) convertView.findViewById(R.id.fecha);

        ItemClasificacion row_pos = ItemClass.get(position);
        // setting the image resource and title

        equipo1.setText(row_pos.getEquipo1());
        equipo2.setText(row_pos.getEquipo2());
        resultado1.setText(row_pos.getResultado1());
        resultado2.setText(row_pos.getResultado2());
        fecha.setText(row_pos.getFecha());

        return convertView;
    }
}
