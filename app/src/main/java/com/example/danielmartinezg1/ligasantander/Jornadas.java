package com.example.danielmartinezg1.ligasantander;

import java.util.List;

/**
 * Created by Dani on 12/01/2018.
 */

public class Jornadas {
    private List <JornadasList> jornadas_list;


    public Jornadas(List<JornadasList> jornadas_list) {
        this.jornadas_list = jornadas_list;
    }

    public List<JornadasList> getJornadas_list() {
        return jornadas_list;
    }

}
