package org.andres.Examen.Fondo;

public class Principal {
    public static void main(String[] args) {
        Fondo fondo = new Fondo("Fondo");

        Sede sede1 = new Sede(fondo,  "Sede 1");
        Sede sede2 = new Sede(fondo, "Sede 2");
        Sede sede3 = new Sede(fondo, "Sede 3");
        Sede sede4 = new Sede(fondo, "Sede 4");
        Sede sede5 = new Sede(fondo, "Sede 5");

        sede1.start();
        sede2.start();
        sede3.start();
        sede4.start();
        sede5.start();

        try {
            sede1.join();
            sede2.join();
            sede3.join();
            sede4.join();
            sede5.join();

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("El total de todas las sedes es " + fondo.getCantidad());
    }


}
