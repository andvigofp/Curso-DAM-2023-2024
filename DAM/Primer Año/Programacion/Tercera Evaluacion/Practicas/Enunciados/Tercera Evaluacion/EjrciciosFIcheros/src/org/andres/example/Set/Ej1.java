package org.andres.example.Set;

import org.andres.example.Metodos.MEJ1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Escribe un programa que guarde en un fichero con nombre primos.dat los números primos que hay entre
 * 1 y 500
 */
public class Ej1 {
    public static void main(String[] args) {


        try {
         BufferedWriter  file = new BufferedWriter(new FileWriter("primos.dat"));

            for (int i=2; i<=501; i++) {
                if (MEJ1.esPrimo(i)) {
                    file.write(String.valueOf(i) + "\n");
                }
            }
            System.out.println("Se ha creado el archivo primos.dat correctamente");
           file.close();


        } catch (IOException e) {
            System.out.println("Error de escritura " + e.getMessage());
        }
    }
    }

