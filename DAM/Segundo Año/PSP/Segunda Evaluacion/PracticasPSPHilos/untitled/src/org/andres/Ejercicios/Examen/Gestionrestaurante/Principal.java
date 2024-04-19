package org.andres.Ejercicios.Examen.Gestionrestaurante;

public class Principal {
    public static void main(String[] args) {
        FondoComun fondo = new FondoComun();
        Sede[] sedes = new Sede[5];
        for (int i = 0; i < sedes.length; i++) {
            sedes[i] = new Sede(i + 1, fondo);
            sedes[i].start();
        }

        for (Sede sede : sedes) {
            try {
                sede.join(); // Espera a que todas las sedes terminen
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Importe total global facturado: €" + fondo.consultar());
    }
}
