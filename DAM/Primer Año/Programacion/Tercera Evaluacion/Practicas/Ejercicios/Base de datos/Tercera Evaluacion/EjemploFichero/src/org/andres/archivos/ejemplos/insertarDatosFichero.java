package org.andres.archivos.ejemplos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class insertarDatosFichero {
    public static void main(String[] args) {

        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("fruta.txt"));
            bw.write("naranaja\n");
            bw.write("manzana\n");
            bw.write("limon\n");

            bw.close();

        } catch (IOException ioe) {
            System.out.println("Ha sido impòsible escribir en el fichero. ");
        }
    }
}
