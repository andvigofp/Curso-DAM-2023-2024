package Ejercicios.Ej10;

import java.util.Scanner;

/**
 *
 */
public class MEj10 {
    //Método para solicitar una cadena al usuario
    public static String solictarCadena(Scanner teclado, String mesnaje) {
        System.out.println(mesnaje);
        return teclado.nextLine();
    }

    //Método para transformar la primera cadena según la segunda cadena
    public static String transformarCadena(String cadenaOriginal, String cadenaBuscada) {
        return cadenaOriginal.replace(cadenaBuscada, cadenaBuscada.toUpperCase());

    }
}

    //Método para transformar la primera cadena según la segunda cadena
    /**public static String transformarCadena(String cadenaOriginal, String cadenaBuscada) {
        // Verificar si la cadena original contiene la cadena buscada
        if (cadenaOriginal.contains(cadenaBuscada)) {
            // Obtener el índice de la primera aparición de la cadena buscada
            int indice = cadenaOriginal.indexOf(cadenaBuscada);
            // Obtener la parte de la cadena original antes de la cadena buscada
            String parteAnterior = cadenaOriginal.substring(0, indice);
            // Obtener la parte de la cadena original después de la cadena buscada
            String partePosterior = cadenaOriginal.substring(indice + cadenaBuscada.length());
            // Convertir la parte de la cadena original correspondiente a la cadena buscada a mayúsculas
            String parteMayusculas = cadenaOriginal.substring(indice, indice + cadenaBuscada.length()).toUpperCase();
            // Concatenar todas las partes y devolver la cadena transformada
            return parteAnterior + parteMayusculas + partePosterior;
        } else {
            // Si la cadena original no contiene la cadena buscada, devolver la cadena original sin cambios
            return cadenaOriginal;
        }
    }
}**/



