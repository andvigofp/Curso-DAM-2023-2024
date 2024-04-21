package org.andres.Examen.ColaMejorado;

import java.util.Scanner;

public class Productor extends Thread{
    private Cola cola;
    private int n;

    public Productor(Cola cola, int n) {
        this.cola = cola;
        this.n = n;
    }

    public void run() {
        Scanner teclado = new Scanner(System.in);
        String cadena= " ";
        do {
            System.out.println("Introduzca cadena convertir: (* para salir) ");
            cadena = teclado.nextLine();

            cola.put(cadena);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }while (!cadena.equals("*"));
    }
}
