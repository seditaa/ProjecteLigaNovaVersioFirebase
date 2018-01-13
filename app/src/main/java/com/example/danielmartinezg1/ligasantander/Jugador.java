package com.example.danielmartinezg1.ligasantander;

/**
 * Created by Dani on 12/01/2018.
 */

class Jugador {
    private String nom;
    private int dorsal;
    private int gols;
    private int asistencies;

    public Jugador(String mesi, int i, int i1) {
        gols=0;
        asistencies = 0;
    }

    public Jugador(String nom, int dorsal, int gols, int asistencies) {
        this.nom = nom;
        this.dorsal = dorsal;
        this.gols = gols;
        this.asistencies = asistencies;
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

    public int getAsistencies(){
        return asistencies;
    }
}
