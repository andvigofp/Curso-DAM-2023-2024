package org.andres.java.jdbc.Instituto.modelo;

public class notas extends alumnos{
    private eval eval;
    private int nota;

    public notas(int curso, String nomcurso, int numalumn, int codalumn, String nombre, String direccion, eval eval, int nota) {
        super(curso, nomcurso, numalumn, codalumn, nombre, direccion);
        this.eval = eval;
        this.nota = nota;
    }

    public org.andres.java.jdbc.Instituto.modelo.eval getEval() {
        return eval;
    }

    public void setEval(org.andres.java.jdbc.Instituto.modelo.eval eval) {
        this.eval = eval;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("notas{");
        sb.append("eval=").append(eval);
        sb.append(", nota=").append(nota);
        sb.append('}');
        return sb.toString();
    }
}
