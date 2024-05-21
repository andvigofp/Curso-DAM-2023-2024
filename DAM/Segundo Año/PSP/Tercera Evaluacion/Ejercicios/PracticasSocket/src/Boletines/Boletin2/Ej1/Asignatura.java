package Boletines.Boletin2.Ej1;

import java.io.Serializable;

public class Asignatura implements Serializable {
    private int id;
    private String nombreAsig;

    public Asignatura() {
        super();
    }

    public Asignatura(int id, String nombreAsig) {
        super();
        this.id = id;
        this.nombreAsig = nombreAsig;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreAsig() {
        return nombreAsig;
    }

    public void setNombreAsig(String nombreAsig) {
        this.nombreAsig = nombreAsig;
    }

    @Override
    public String toString() {
        return "Asignatura{" +
                "id=" + id +
                ", nombreAsig='" + nombreAsig + '\'' +
                '}';
    }
}
