package org.andres.Boletin3.Clase;

public class ComienzoClase {
    public static void main(String[] args) {
        Bienvenida b = new Bienvenida();

        for (int i=0; i < 3; i++) {
            new Alumno(b, i).start();
        }
        Profesor p = new Profesor(b, "Pepito Pérez");
        p.start();
    }
}
