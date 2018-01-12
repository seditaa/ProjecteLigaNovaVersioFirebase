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

/**
 * Created by Dani on 12/01/2018.
 */

public abstract class ItemClasificacionAdapter extends BaseAdapter {
    //protected Activity activity;
    protected PartidosFragment fragment;
    protected ArrayList<ItemClasificacion> items;

    public ItemClasificacionAdapter(PartidosFragment fragment, ArrayList<ItemClasificacion> items) {
        this.fragment = fragment;
        this.items = items;
    }

    @Override
    public int getCount() {

        return items.size();
    }

    @Override
    public Object getItem(int position) {
        return items.get(position);
    }

    @Override
    public long getItemId(int position) {
        return items.get(position).getId();
    }

    @Override
    public View getView(int position, View contentView, ViewGroup parent) {
        View vi = contentView;

        if (contentView == null) {
            LayoutInflater inflater = (LayoutInflater) fragment.getContext()
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            vi = inflater.inflate(R.layout.clasificacion_listview_item_layout, null);
        }

        ItemClasificacion item = items.get(position);

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

        return vi;
    }
}
