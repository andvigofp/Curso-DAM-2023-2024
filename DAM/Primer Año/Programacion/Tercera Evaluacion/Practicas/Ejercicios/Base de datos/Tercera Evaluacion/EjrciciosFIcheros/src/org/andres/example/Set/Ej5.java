package org.andres.example.Set;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Escribe un programa capaz de quitar los comentarios de un programa de Java. Se utilizaría de la siguiente
 * manera:
 * quita_comentarios PROGRAMA_ORIGINAL PROGRAMA_LIMPIO
 * Por ejemplo:
 * quita_comentarios hola.java holav2.java
 * crea un fichero con nombre holav2.java que contiene el código de hola.java pero sin los comentario
 */
public class Ej5 {
    public static void main(String[] args) {
        // Verificar que se hayan proporcionado los nombres de los archivos origen y destino
        if (args.length != 2) {
            System.out.println("Uso del programa: Ej5 ficheroComentarios.txt.txt holav2.txt");
            return;
        }

        String archivoOriginal = args[0];
        String archivoLimpo = args[1];

        try {
            BufferedReader lector = new BufferedReader(new FileReader(archivoOriginal));
            BufferedWriter escritor = new BufferedWriter(new FileWriter(archivoLimpo));

            String linea;

            while ((linea = lector.readLine()) != null) {
                linea = quitarComentariosLinea(linea);
                if (!linea.trim().isEmpty()) { // No escribir líneas vacías
                    escritor.write(linea);
                    escritor.newLine();
                }
            }

            lector.close();
            escritor.close();

            System.out.println("Comentarios eliminados correctamente.");
        } catch (IOException e) {
            System.out.println("Error al leer/escribir los archivos: " + e.getMessage());
        }
    }

    // Método para quitar comentarios de una línea
    private static String quitarComentariosLinea(String linea) {
        // Quitar comentarios de una línea (//)
        int indiceComentario = linea.indexOf("//");
        if (indiceComentario != -1) {
            linea = linea.substring(0, indiceComentario);
        }

        // Quitar comentarios de varias líneas (/* */)
        int indiceComentarioInicio = linea.indexOf("/*");
        int indiceComentarioFin = linea.indexOf("*/");
        if (indiceComentarioInicio != -1 && indiceComentarioFin != -1) {
            linea = linea.substring(0, indiceComentarioInicio) + linea.substring(indiceComentarioFin + 2);
        } else if (indiceComentarioInicio != -1) {
            linea = linea.substring(0, indiceComentarioInicio);
        }

        return linea;
    }

}

