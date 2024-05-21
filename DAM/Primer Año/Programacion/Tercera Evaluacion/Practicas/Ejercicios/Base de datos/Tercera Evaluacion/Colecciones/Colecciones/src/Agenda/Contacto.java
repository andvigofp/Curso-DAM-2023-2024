package Agenda;

import java.util.StringJoiner;

public class Contacto {
    private String nombre;
    private int telefono;


    public Contacto() {

    }
    public Contacto(String nombre, int telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public boolean comparaion(Contacto c) {
        if (this.nombre.trim().equalsIgnoreCase(c.getNombre().trim())) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Contacto.class.getSimpleName() + "[", "]")
                .add("nombre='" + nombre + "'")
                .add("telefono=" + telefono)
                .toString();
    }
}
