package org.andres.pooherencia;

import java.util.StringJoiner;

public class Alumno extends Persona {
    private String instituto;
    private double notasMatematicas;
    private double notasLenguaje;

    private double notasHistoria;

    public String getInstituto() {
        return instituto;
    }

    public void setInstituto(String instituto) {
        this.instituto = instituto;
    }

    public double getNotasMatematicas() {
        return notasMatematicas;
    }

    public void setNotasMatematicas(double notasMatematicas) {
        this.notasMatematicas = notasMatematicas;
    }

    public double getNotasLenguaje() {
        return notasLenguaje;
    }

    public void setNotasLenguaje(double notasLenguaje) {
        this.notasLenguaje = notasLenguaje;
    }

    public double getNotasHistoria() {
        return notasHistoria;
    }

    public void setNotasHistoria(double notasHistoria) {
        this.notasHistoria = notasHistoria;
    }


}
