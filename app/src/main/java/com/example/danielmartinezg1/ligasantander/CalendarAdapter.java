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

//ADAPTADOR PERSONALITZAT PELS ITEMS DEL LISTVIEW DEL CALENDARI

public class CalendarAdapter extends BaseAdapter{

    protected CalendarFragment fragment;
    protected ArrayList<JornadasList> items;

    //Constructor
    public CalendarAdapter(CalendarFragment fragment, ArrayList<JornadasList> items) {
        this.fragment = fragment;
        this.items = items;
    }

    Context contextC;
    List<JornadasList> ItemClassCalendar;

    //Constructor
    public CalendarAdapter(Context contextC, List<JornadasList> itemClassCalendar) {
        this.contextC = contextC;
        ItemClassCalendar = itemClassCalendar;
    }

    //Getters
    @Override
    public int getCount() {
        return ItemClassCalendar.size();
    }

    @Override
    public Object getItem(int position) {
        return ItemClassCalendar.get(position);
    }

    @Override
    public long getItemId(int position) {
        return ItemClassCalendar.indexOf(getItem(position));
    }

    //Métode getView on inflem el nou layout de l'item al ListView dessitjat
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            LayoutInflater mInflater = (LayoutInflater) contextC
                    .getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
            convertView = mInflater.inflate(R.layout.calendar_item_layout, null);
        }

        TextView item_jornada = (TextView) convertView.findViewById(R.id.jornada_txt);

        JornadasList row_pos = ItemClassCalendar.get(position);

        item_jornada.setText(row_pos.getNombre_jornada());

        return convertView;
    }
}
