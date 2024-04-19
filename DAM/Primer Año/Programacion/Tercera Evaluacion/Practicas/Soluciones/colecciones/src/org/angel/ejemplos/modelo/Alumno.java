package org.angel.ejemplos.modelo;

public class Alumno implements Comparable <Alumno> {
    private String nombre;
    private int nota;

    public Alumno() {
    }

    public Alumno(String nombre, int nota) {
        this.nombre = nombre;
        this.nota = nota;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return nombre + ", nota=" + nota;
    }

    @Override
    public int compareTo(Alumno a) {
       /* if (this.nombre==null){

            return 0;
        }
        return this.nombre.compareTo(a.nombre);*/
        // comparamos un int por lo tanto es necesario utilizar las comparaciones de int
        if (this.nota == a.nota) {
            return 0;
        }
        if (this.nota > a.nota) {

            return 1;

        } else {
            return -1;
        }
        /* si estamos utilizando un wraper Integer
        if (this.nota == null){
        return 0:
        }
        return this.nota.comparteTo(a.nota);
         */
    }

}