package Boletin3.Ej3_Fichero;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Productor extends Thread {
    private Compartido comp;
    private String ping="PING";
    private String pong ="PONG";

    public Productor(Compartido comp, String ping, String pong) {
        this.comp = comp;
        this.ping = ping;
        this.pong = pong;
    }

    public void run() {
        File fichero = new File(ping,pong); // declarar fichero
        if (fichero.exists()) {
            try {
                FileReader fic = new FileReader(fichero);
                int i;
                while ((i = fic.read()) != -1) // se va leyendo un car�cter
                {
                    char c= (char) i;
                    comp.put(i); // pone el car�cter

                    try {
                        sleep(100);
                    } catch (InterruptedException e) {
                    }
                }
                comp.put(i);
            } catch (IOException e1) {
                e1.printStackTrace();
            }

        }
        System.out.println("\nFin Productor");
    }//run
}
