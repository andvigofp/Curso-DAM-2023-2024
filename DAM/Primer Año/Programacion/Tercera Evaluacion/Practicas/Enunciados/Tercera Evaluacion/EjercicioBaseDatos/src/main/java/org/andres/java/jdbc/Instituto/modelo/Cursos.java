package org.andres.java.jdbc.Instituto.modelo;

public class Cursos {
    private int curso;
    private String nomcurso;
    private int numalumn;

    public Cursos(int curso, String nomcurso, int numalumn) {
        this.curso = curso;
        this.nomcurso = nomcurso;
        this.numalumn = numalumn;
    }

    public int getCurso() {
        return curso;
    }

    public void setCurso(int curso) {
        this.curso = curso;
    }

    public String getNomcurso() {
        return nomcurso;
    }

    public void setNomcurso(String nomcurso) {
        this.nomcurso = nomcurso;
    }

    public int getNumalumn() {
        return numalumn;
    }

    public void setNumalumn(int numalumn) {
        this.numalumn = numalumn;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Cursos{");
        sb.append("curso=").append(curso);
        sb.append(", nomcurso='").append(nomcurso).append('\'');
        sb.append(", numalumn=").append(numalumn);
        sb.append('}');
        return sb.toString();
    }
}
