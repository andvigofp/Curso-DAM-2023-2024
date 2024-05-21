package org.andres.archivos.ejemplos;

import java.io.*;

public class LecturaEscrituraCombinada {
    public static void main(String[] args) {
        try {
            BufferedReader br1 = new BufferedReader(new FileReader("fichero1.txt"));
            BufferedReader br2 = new BufferedReader(new FileReader("fichero2.txt"));
            BufferedWriter bw = new BufferedWriter(new FileWriter("mezcla.txt"));

            String line1 = "";
            String line2 = "";

            while ( (line1 !=null) || (line2 !=null)) {
                line1 = br1.readLine();
                line2 = br2.readLine();

                if (line1 !=null) {
                    bw.write(line1 + "\n");
                }
                if (line2 !=null) {
                    bw.write(line2 + "\n");
                }
            }
            br1.close();
            br2.close();
            bw.close();
            System.out.println("Archivo mezcla.txt creado sastifactoriamnete. ");

        } catch (IOException ioe) {
            System.out.println("Se ha producido un error de lectura/escritura");
        }
    }
}
