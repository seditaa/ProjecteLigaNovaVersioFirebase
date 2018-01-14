package com.example.danielmartinezg1.ligasantander;

/**
 * Created by Dani on 12/01/2018.
 */

class Partidos {
    private String equipo1;
    private String equipo2;
    private String resultado1;
    private String resultado2;
    private String dia;
    private String hora;

    public Partidos() {
    }

    public Partidos(int resultado1, int resultado2) {
        resultado1 = 0;
        resultado2 = 0;
    }

    public Partidos(String equipo1, String equipo2, String resultado1, String resultado2, String dia, String hora) {
        this.equipo1 = equipo1;
        this.equipo2 = equipo2;
        this.resultado1 = resultado1;
        this.resultado2 = resultado2;
        this.dia = dia;
        this.hora = hora;
    }

    public String getEquipo1() {
        return equipo1;
    }

    public String getEquipo2() {
        return equipo2;
    }

    public String getResultado1() {
        return resultado1;
    }

    public String getResultado2() {
        return resultado2;
    }

    public String getDia() {
        return dia;
    }

    public String getHora() {
        return hora;
    }
}
