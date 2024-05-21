package org.andres.archivos.ejemplos;

import java.io.File;

public class OtrosUsosFichero {
    public static void main(String[] args) {
        File ficcheros = new File(".");
        String[] listaArchivos = ficcheros.list();

        for (String nombreArchivo : listaArchivos) {
            System.out.println(nombreArchivo);
        }
    }
}
