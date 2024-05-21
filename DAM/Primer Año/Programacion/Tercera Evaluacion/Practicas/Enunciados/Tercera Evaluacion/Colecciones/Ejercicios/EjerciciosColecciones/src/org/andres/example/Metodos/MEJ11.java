package org.andres.example.Metodos;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Crea un mini-diccionario español-inglés que contenga, al menos, 20 palabras con su correspondiente
 * traducción). Utiliza un objeto de la clase HashMap para almacenar las parejas de palabras. El programa
 * pedirá una palabra en español y dará la correspondiente traducción en inglés.
 */
public class MEJ11 {
    // Método para crear el diccionario español-inglés
    public static Map<String, String> crearDiccionario() {
        Map<String, String> diccionario = new HashMap<>();
        // Agregar palabras y sus traducciones al diccionario
        diccionario.put("casa", "house");
        diccionario.put("perro", "dog");
        diccionario.put("gato", "cat");
        diccionario.put("árbol", "tree");
        diccionario.put("libro", "book");
        diccionario.put("ordenador", "computer");
        diccionario.put("coche", "car");
        diccionario.put("mesa", "table");
        diccionario.put("silla", "chair");
        diccionario.put("sol", "sun");
        diccionario.put("luna", "moon");
        diccionario.put("agua", "water");
        diccionario.put("manzana", "apple");
        diccionario.put("naranja", "orange");
        diccionario.put("banana", "banana");
        diccionario.put("rojo", "red");
        diccionario.put("verde", "green");
        diccionario.put("azul", "blue");
        diccionario.put("amarillo", "yellow");
        diccionario.put("blanco", "white");
        return diccionario;
    }

    // Método para mostrar un mensaje de bienvenida
    public static void mostrarMensajeBienvenida() {
        System.out.println("Bienvenido al mini diccionario español-inglés.");
        System.out.println("Por favor, introduce una palabra en español:");
    }

    // Método para pedir una palabra al usuario
    public static String pedirPalabra(Scanner teclado) {
        return teclado.nextLine().toLowerCase();
    }

    // Método para mostrar la traducción de una palabra
    public static void mostrarTraduccion(Map<String, String> diccionario, String palabraEspanol) {
        String traduccion = diccionario.get(palabraEspanol);
        if (traduccion != null) {
            System.out.println("La traducción de \"" + palabraEspanol + "\" es \"" + traduccion + "\".");
        } else {
            System.out.println("Lo siento, no encontré una traducción para \"" + palabraEspanol + "\".");
        }
    }
}
