package org.andres.Examen.Cola;

import java.util.Scanner;

public class Productor extends Thread{
    private Cola cola;
    private String frase;

    public Productor(Cola cola) {
        this.cola = cola;
        this.frase = frase;
    }

    @Override
    public void run() {
        Scanner teclado = new Scanner(System.in);
        int contador=0;

        do {
            for (int i=0; i<10; i++) {
                contador++;
                System.out.println("Dígame la cadena");
                frase = teclado.nextLine();

                cola.put(frase);

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }while (!frase.equals("*") || contador==10);
    }
}
