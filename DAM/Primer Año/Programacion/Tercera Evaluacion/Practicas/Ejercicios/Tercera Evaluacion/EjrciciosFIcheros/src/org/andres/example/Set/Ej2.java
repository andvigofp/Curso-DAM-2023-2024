package org.andres.example.Set;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Realiza un programa que lea el fichero creado en el ejercicio anterior y que muestre los números por
 * pantalla.
 */

public class Ej2 {
    public static void main(String[] args) {

        try {
            // Crea un objeto BufferedReader para leer el archivo "primos.dat"
           BufferedReader reader = new BufferedReader(new FileReader("fichero1.txt"));

            String line ="";

            while (line !=null) {
                System.out.println(line + " ");
                line = reader.readLine();
            }
            System.out.println();
            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("No existe el archivo " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error de escrictura " + e.getMessage());
        }
    }
}
