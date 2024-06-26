package org.andres.example.Set;


import java.io.*;
import java.util.Collections;
import java.util.Vector;

/**
 * Realiza un programa que sea capaz de ordenar alfabéticamente las palabras contenidas en un fichero de
 * texto. El nombre del fichero que contiene las palabras se debe pasar como argumento en la línea de
 * comandos. El nombre del fichero resultado debe ser el mismo que el original añadiendo la coletilla sort, por
 * ejemplo palabras_sort.txt. Suponemos que cada palabra ocupa una línea.
 */
public class Ej4 {
    public static void main(String[] args) {
        // Verificar que se hayan proporcionado los nombres de los ficheros origen y destino
        if (args.length != 1) {
            System.out.println("Uso del programa: Ej4 fichero1.txt");
            System.exit(-1);
        }

        try {
            BufferedReader br = new BufferedReader(new FileReader(args[0]));
            int l = args[0].length();
            String nombre = args[0].substring(0, l - 4);
            String extension = args[0].substring(l - 4, l);

            BufferedWriter bw = new BufferedWriter(new FileWriter(nombre + "_sort" + extension));

            Vector<String> v = new Vector<String>();

            String linea = "";
            while (linea != null) {
                v.addElement(linea);
                linea = br.readLine();
            }
            br.close();

            v.removeElementAt(0);
            Collections.sort(v);

            for (String s: v) {
                bw.write(s + "\n");
            }
            System.out.println("fichero1_sort.txt se ha generado correctamente");
            bw.close();
        } catch (IOException ioe) {
            System.err.println(ioe.getMessage());
        }
    }
    }

