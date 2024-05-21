package org.andres.example.Metodos;

public class Utilidades {
    // Método para quitar comentarios de una línea
    public static String quitarComentariosLinea(String linea) {
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