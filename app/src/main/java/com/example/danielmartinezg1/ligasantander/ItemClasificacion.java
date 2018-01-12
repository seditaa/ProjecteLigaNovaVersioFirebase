package com.example.danielmartinezg1.ligasantander;

/**
 * Created by Dani on 11/01/2018.
 */

public class ItemClasificacion {
    protected long id;
    protected String rutaImagen;
    protected String equipo1;
    protected String equipo2;
    protected String fecha;

    public ItemClasificacion() {
        this.equipo1 = "";
        this.equipo2 = "";
        this.fecha = "";
        this.rutaImagen = "";
    }

    public ItemClasificacion(long id, String equipo1, String equipo2, String fecha) {
        this.id = id;
        this.equipo1 = equipo1;
        this.equipo2 = equipo2;
        this.fecha = fecha;
        this.rutaImagen = "";
    }

    public ItemClasificacion(long id, String equipo1, String equipo2, String fecha, String rutaImagen) {
        this.id = id;
        this.equipo1 = equipo1;
        this.equipo2 = equipo2;
        this.fecha = fecha;
        this.rutaImagen = rutaImagen;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getRutaImagen() {
        return rutaImagen;
    }

    public void setRutaImagen(String rutaImagen) {
        this.rutaImagen = rutaImagen;
    }

    public String getEquipo1() {
        return equipo1;
    }

    public void setEquipo1(String nombre) {
        this.equipo1 = equipo1;
    }

    public String getEquipo2() {
        return equipo2;
    }

    public void setEquipo2(String nombre) {
        this.equipo2 = equipo2;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String tipo) {
        this.fecha = fecha;
    }
}
