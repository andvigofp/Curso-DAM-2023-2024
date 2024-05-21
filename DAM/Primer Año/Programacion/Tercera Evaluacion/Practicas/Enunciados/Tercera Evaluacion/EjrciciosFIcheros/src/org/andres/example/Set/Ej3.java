package org.andres.example.Set;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Escribe un programa que guarde en un fichero el contenido de otros dos ficheros, de tal forma que en el
 * fichero resultante aparezcan las líneas de los primeros dos ficheros mezcladas, es decir, la primera línea será
 * del primer fichero, la segunda será del segundo fichero, la tercera será la siguiente del primer fichero, etc.
 * Los nombres de los dos ficheros origen y el nombre del fichero destino se deben pasar como argumentos
 * en la línea de comandos.
 * Hay que tener en cuenta que los ficheros de donde se van cogiendo las líneas pueden tener tamaños
 * diferentes.
 */
public class Ej3 {

    public static void main(String[] args) {
        // Verificar que se hayan proporcionado los nombres de los ficheros origen y destino
        if (args.length != 3) {
            System.out.println("Uso del programa: Ej3 fichero1.txt fichero2.txt mezcla.txt");
            System.exit(-1); // sale del programa
        }

        try {
            BufferedReader bf1 = new BufferedReader(new FileReader(args[0]));
            BufferedReader bf2 = new BufferedReader(new FileReader(args[1]));
            BufferedWriter bw = new BufferedWriter(new FileWriter(args[2]));

            String linea1;
            String linea2;

            while (true) {
                linea1 = bf1.readLine();
                linea2 = bf2.readLine();

                if (linea1 == null && linea2 == null) {
                    break; // Salir del bucle si ambas líneas son nulas
                }

                if (linea1 != null) {
                    bw.write(linea1 + "\n");
                }

                if (linea2 != null) {
                    bw.write(linea2 + "\n");
                }
            }

            bf1.close();
            bf2.close();
            bw.close();

            System.out.println("Mezcla de archivos a finalizaco.");

        } catch (IOException ioe) {
            System.out.println("Se ha producido un error de lectura/escritura");
            System.err.println(ioe.getMessage());
        }
    }
}