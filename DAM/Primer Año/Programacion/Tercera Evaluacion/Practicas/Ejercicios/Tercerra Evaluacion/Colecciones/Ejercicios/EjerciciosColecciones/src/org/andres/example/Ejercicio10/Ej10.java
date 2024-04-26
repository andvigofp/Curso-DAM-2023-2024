package org.andres.example.Ejercicio10;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Crea un mini-diccionario español-inglés que contenga, al menos, 20 palabras (con su correspondiente
 * traducción). Utiliza un objeto de la clase HashMap para almacenar las parejas de palabras. El programa
 * pedirá una palabra en español y dará la correspondiente traducción en inglés.
 */
public class Ej10 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Map<String, String> diccionario = new HashMap<>();
        MEJ10.crearDiccionario(diccionario);
        MEJ10.mostrarmensjae();
        //pedir por teclado la palabra en espñaol
        String palabraEspanol = MEJ10.pedirPalabra(teclado);
        //Mostrar resultado de la tracción español a ingles
        MEJ10.mostrarTraduccion(diccionario,palabraEspanol);

    }
}
