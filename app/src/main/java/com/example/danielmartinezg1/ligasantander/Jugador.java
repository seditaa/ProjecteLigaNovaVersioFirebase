package com.example.danielmartinezg1.ligasantander;

/**
 * Created by Dani on 12/01/2018.
 */

class Jugador {
    private String nom;
    private int dorsal;
    private int gols;

    public Jugador() {
        gols=0;
    }

    public Jugador(String nom, int dorsal, int gols) {
        this.nom = nom;
        this.dorsal = dorsal;
        this.gols = gols;
    }

    public String getNom() {

        return nom;
    }

    public int getDorsal() {
        return dorsal;
    }

    public int getGols() {
        return gols;
    }
}
