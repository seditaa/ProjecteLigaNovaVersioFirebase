package com.example.danielmartinezg1.ligasantander;

import java.util.List;

/**
 * Created by Dani on 15/01/2018.
 */
//CREACIÓ DE LA CLASSE PICHICHIS_LIST AMB L'ESTRUCTURA DESSITJADA A LA BASE DE DADES
public class Pichichis_list {
    private List<Jugador> pichichi_list;

    //Constructor buit
    public Pichichis_list() {
    }

    //Constructor i getter
    public Pichichis_list(List<Jugador> pichichi_list) {
        this.pichichi_list = pichichi_list;
    }

    public List<Jugador> getPichichi_list() {
        return pichichi_list;
    }
}
