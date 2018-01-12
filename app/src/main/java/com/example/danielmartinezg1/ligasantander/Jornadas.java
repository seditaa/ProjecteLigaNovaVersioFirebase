package com.example.danielmartinezg1.ligasantander;

import java.util.List;

/**
 * Created by Dani on 12/01/2018.
 */

public class Jornadas {
    private int numero_jornada;
    private List<Equipo> EquipoList;

    public Jornadas(int numero_jornada, List<Equipo> equipoList) {
        this.numero_jornada = numero_jornada;
        EquipoList = equipoList;
    }

    public int getNumero_jornada() {
        return numero_jornada;
    }

    public List<Equipo> getEquipoList() {
        return EquipoList;
    }
}
