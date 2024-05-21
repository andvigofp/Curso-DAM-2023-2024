package org.andres.archivos.ejemplos;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ManejopFicheroOpc2 {
    public static void main(String[] args) {

            try {
                BufferedReader br = new BufferedReader(new FileReader("malaga.txt"));
                String line = "";
                while (line !=null) {
                    System.out.println(line);
                    line = br.readLine();
                }
            } catch (FileNotFoundException fnfe) {
                System.out.println("No se encuentra el fichero malaga.txt");
            } catch (IOException ioe) {
                System.out.println("No se ha podido leer el fichero malaga.txt");
            }
    }
}
