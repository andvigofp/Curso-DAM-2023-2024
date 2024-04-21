package org.andres.Examen.Fondo;

public class Sede extends Thread{
  private Fondo fondo;
   private double importe;
   private String nombre;

    public Sede(Fondo fondo, String nombre) {
        this.fondo = fondo;
        this.importe =importe;
        this.nombre = nombre;
    }

    @Override
    public void run() {
        double total =0;

        for (int i=0; i<30; i++) {
            importe=Math.random()*100;

            fondo.sumarCantidad(importe);
            total +=importe;
        }

        System.out.println("el total " + total);
    }
}
