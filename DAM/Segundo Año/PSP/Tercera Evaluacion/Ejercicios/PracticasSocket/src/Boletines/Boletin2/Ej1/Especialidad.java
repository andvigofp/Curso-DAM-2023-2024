package Boletines.Boletin2.Ej1;

import java.io.Serializable;

public class Especialidad implements Serializable {
    private int id;
    private String  nombreEspe;

    public Especialidad() {
        super();
    }

    public Especialidad(int id, String nombreEspe) {
        super();
        this.id = id;
        this.nombreEspe = nombreEspe;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreEspe() {
        return nombreEspe;
    }

    public void setNombreEspe(String nombreEspe) {
        this.nombreEspe = nombreEspe;
    }

    @Override
    public String toString() {
        return "Especialidad{" +
                "id=" + id +
                ", nombreEspe='" + nombreEspe + '\'' +
                '}';
    }
}
