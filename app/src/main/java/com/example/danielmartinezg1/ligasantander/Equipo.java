package com.example.danielmartinezg1.ligasantander;

import java.util.List;

/**
 * Created by Dani on 12/01/2018.
 */

public class Equipo {
    private String nom;
    private int gols;
    private int punts;
    private List<Jugador> jugadorList;

    public Equipo(String nom, int gols, int punts, List<Jugador> jugadorList) {
        this.nom = nom;
        this.gols = gols;
        this.punts = punts;
        this.jugadorList = jugadorList;
    }

    public Equipo() {
    }

    public String getNom() {
        return nom;
    }

    public int getGols() {
        return gols;
    }

    public int getPunts() {
        return punts;
    }

    public List<Jugador> getJugadorList() {
        return jugadorList;
    }
}
