package com.example.danielmartinezg1.ligasantander;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Dani on 12/01/2018.
 */

public class JornadasList {
    private String nombre_jornada;
    private List<Partidos> partidos_list;

    public JornadasList() {
    }

    public JornadasList(String nombre_jornada, List<Partidos> partidos_list) {
        this.nombre_jornada = nombre_jornada;
        this.partidos_list = partidos_list;
    }

    public String getNombre_jornada() {
        return nombre_jornada;
    }

    public List<Partidos> getPartidos_list() {
        return partidos_list;
    }
}
