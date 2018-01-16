package com.example.danielmartinezg1.ligasantander;

/**
 * Created by Dani on 12/01/2018.
 */
//CREACIÓ DE LA CLASSE JUGADOR AMB L'ESTRUCTURA DESSITJADA A LA BASE DE DADES
class Jugador {
    private String nom;
    private String gols;
    private String asistencies;

    //Constructor buit
    public Jugador() {
    }

    //Constructor
    public Jugador(String nom, String gols, String asistencies) {
        this.nom = nom;
        this.gols = gols;
        this.asistencies = asistencies;
    }

    //Getters
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
