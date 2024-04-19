package org.andres.Ejercicios.PracticasPSP.ProductorConsumdidor;

import java.util.Scanner;

public class Productor extends Thread{
    private Cola cola;
    private int n;

    public Productor(Cola cola, int n) {
        this.cola = cola;
        this.n = n;
    }

    @Override
    public void run() {
        Scanner sc = new Scanner(System.in);
        String cad;

        do {
            System.out.println("Introduzca cadena para convertir: (* para salir) ");
            cad = sc.nextLine().trim(); // Eliminar espacios en blanco alrededor de la cadena
            if (!cad.equals("*")) {
            }
                cola.producir(cad);

            try {
                sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } while (!cad.equals("*"));
        System.out.println("Saliendo del productor.");
    }
}