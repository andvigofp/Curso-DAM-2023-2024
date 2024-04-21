package org.andres.Boletin3.Fichero;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Field;

public class Productor extends Thread{
    private Compartido compartido;
    private String nombre;

    public Productor(Compartido c, String nombre) {
        this.compartido = c;
        this.nombre = nombre;
    }

    public void run() {
        File fichero = new File(nombre);
        if (fichero.exists()) {
            try {
                FileReader fic =  new FileReader(fichero);
                int i;
                while ((i = fic.read()) !=-1) {
                    char c = (char) i;
                    compartido.put(i);
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                compartido.put(i);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        System.out.println("\nFin Productor");
    }
}
