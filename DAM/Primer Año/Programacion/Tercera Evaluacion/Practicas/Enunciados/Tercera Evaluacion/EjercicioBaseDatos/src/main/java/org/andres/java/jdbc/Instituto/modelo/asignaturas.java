package org.andres.java.jdbc.Instituto.modelo;

public class asignaturas extends alumnos {
    private int codiasig;
    private String nomasig;
    private int horas;


    public asignaturas(int curso, String nomcurso, int numalumn, int codalumn, String nombre, String direccion) {
        super(curso, nomcurso, numalumn, codalumn, nombre, direccion);
        this.codiasig = codiasig;
        this.nomasig = nomasig;
        this.horas = horas;
    }


    public int getCodiasig() {
        return codiasig;
    }

    public void setCodiasig(int codiasig) {
        this.codiasig = codiasig;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public String getNomasig() {
        return nomasig;
    }

    public void setNomasig(String nomasig) {
        this.nomasig = nomasig;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("asignaturas{");
        sb.append("codiasig=").append(codiasig);
        sb.append(", nomasig='").append(nomasig).append('\'');
        sb.append(", horas=").append(horas);
        sb.append('}');
        return sb.toString();
    }
}
