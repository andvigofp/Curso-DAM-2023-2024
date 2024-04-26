package org.andres.example.Ejercicio12;

import java.util.Arrays;

public class Cartas  {
    private String figura;
    private String palo;

    public Cartas(String figura, String palo) {
        this.figura = figura;
        this.palo = palo;
    }

    public String getFigura() {
        return figura;
    }

    public String getPalo() {
        return palo;
    }

    @Override
    public String toString() {
        return figura + " de " + palo;
    }

}

