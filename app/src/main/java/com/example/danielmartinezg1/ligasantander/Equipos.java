package com.example.danielmartinezg1.ligasantander;

import java.util.List;

/**
 * Created by Usuari on 15/01/2018.
 */
//CREACIÓ D'UN ELEMENT PRINCIPAL QUE CONTINDRÀ UNA LLISTA D'EQUIPS A LA CLASSE EQUIPO
public class Equipos {
        private List<Equipo> equipo_list;
        //Constructor i getter
        public Equipos(List<Equipo> equipo_list) {
            this.equipo_list = equipo_list;
        }

        public List<Equipo> getEquipo_list() {
            return equipo_list;
        }

    }


