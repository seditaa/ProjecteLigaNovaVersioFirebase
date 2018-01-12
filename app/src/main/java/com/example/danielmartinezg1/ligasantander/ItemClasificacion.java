package com.example.danielmartinezg1.ligasantander;

/**
 * Created by Dani on 11/01/2018.
 */

public class ItemClasificacion {

    private String equipo1;
    private String equipo2;
    private String resultado1;
    private String resultado2;
    private String fecha;

    public ItemClasificacion(String equipo1, String equipo2, String resultado1, String resultado2, String fecha) {
        this.equipo1 = equipo1;
        this.equipo2 = equipo2;
        this.resultado1 = resultado1;
        this.resultado2 = resultado2;
        this.fecha = fecha;

    }

    public String getEquipo1() {
        return equipo1;
    }

    public void setEquipo1(String equipo1) {
        this.equipo1 = equipo1;
    }

    public String getEquipo2() {
        return equipo2;
    }

    public void setEquipo2(String equipo2) {
        this.equipo2 = equipo2;
    }

    public String getResultado1() {
        return resultado1;
    }

    public void setResultado1(String resultado1) {
        this.resultado1 = resultado1;
    }

    public String getResultado2() {
        return resultado2;
    }

    public void setResultado2(String resultado2) {
        this.resultado2 = resultado2;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
}
