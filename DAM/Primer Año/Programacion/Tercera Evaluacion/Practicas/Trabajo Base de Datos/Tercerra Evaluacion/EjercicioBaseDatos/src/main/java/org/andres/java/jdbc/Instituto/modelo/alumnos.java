package org.andres.java.jdbc.Instituto.modelo;

public class alumnos extends Cursos{
    private int codalumn;
    private String nombre;
    private String direccion;

    public alumnos(int curso, String nomcurso, int numalumn, int codalumn, String nombre, String direccion) {
        super(curso, nomcurso, numalumn);
        this.codalumn = codalumn;
        this.nombre = nombre;
        this.direccion = direccion;
    }


    public int getCodalumn() {
        return codalumn;
    }

    public void setCodalumn(int codalumn) {
        this.codalumn = codalumn;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("alumnos{");
        sb.append("codalumn=").append(codalumn);
        sb.append(", nombre='").append(nombre).append('\'');
        sb.append(", direccion='").append(direccion).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
