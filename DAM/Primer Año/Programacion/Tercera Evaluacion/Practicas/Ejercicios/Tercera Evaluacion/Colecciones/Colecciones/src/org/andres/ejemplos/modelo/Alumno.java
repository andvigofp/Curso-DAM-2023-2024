package org.andres.ejemplos.modelo;

import java.util.StringJoiner;

public class Alumno implements Comparable <Alumno>{
    private String nombre;

    private Integer nota;
    public Alumno() {

    }

    public Alumno(String nombre, Integer nota) {
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

    public void setNota(Integer nota) {
        this.nota = nota;
    }


    @Override
    public String toString() {
        return new StringJoiner(", ", Alumno.class.getSimpleName() + "[", "]")
                .add("nombre='" + nombre + "'")
                .add("nota=" + nota)
                .toString();
    }

    @Override
    public int compareTo(Alumno a) {
        //Comparamos un
        if (this.nota == a.nota) {
            return 0;
        }
        return this.nombre.compareTo(a.nombre);
        /**if (this.nota > a.nota) {
            return 1;
        } else {
            return -1;
        }**/
    }
}
