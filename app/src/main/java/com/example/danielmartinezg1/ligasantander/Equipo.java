package com.example.danielmartinezg1.ligasantander;

import java.util.List;

/**
 * Created by Dani on 12/01/2018.
 */
//CREACIÓ DE LA CLASSE EQUIPO AMB L'ESTRUCTURA DESSITJADA A LA BASE DE DADES
public class Equipo {
    //Dades que haurà de tenir cada equip
    private String nom;
    private String punts;
    private String pj;
    private String pg;
    private String pp;
    private String pe;
    private List<Jugador> jugadorList;

    //Constructor buit
    public Equipo() {
    }

    //Contstructor
    public Equipo(String nom, String punts, String pj, String pg, String pp, String pe, List<Jugador> jugadorList) {
        this.nom = nom;
        this.punts = punts;
        this.pj = pj;
        this.pg = pg;
        this.pp = pp;
        this.pe = pe;
        this.jugadorList = jugadorList;
    }

    //Getters
    public String getNom() {
        return nom;
    }


    public String getPunts() {
        return punts;
    }

    public List<Jugador> getJugadorList() {
        return jugadorList;
    }

    public String getPj() {
        return pj;
    }

    public String getPg() {
        return pg;
    }

    public String getPp() {
        return pp;
    }

    public String getPe() {
        return pe;
    }
}
