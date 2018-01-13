package com.example.danielmartinezg1.ligasantander;

/**
 * Created by Dani on 12/01/2018.
 */

class Jugador {
    private String nom;
    private String gols;
    private String asistencies;

    public Jugador(String nom, String gols, String asistencies) {
        this.nom = nom;
        this.gols = gols;
        this.asistencies = asistencies;
    }

    public String getNom() {

        return nom;
    }

    public String getGols() {
        return gols;
    }

    public String getAsistencies(){
        return asistencies;
    }
}
