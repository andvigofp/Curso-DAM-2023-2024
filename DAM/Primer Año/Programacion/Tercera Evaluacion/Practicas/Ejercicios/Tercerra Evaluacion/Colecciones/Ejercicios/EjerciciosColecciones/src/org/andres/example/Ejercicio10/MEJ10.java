package org.andres.example.Ejercicio10;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MEJ10 {

    // Método para crear el diccionario español-inglés
    public static void crearDiccionario(Map<String,String> diccionario) {
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
    }

    // Método para mostrar mensaje de bienvenida
    public static void mostrarmensjae() {
        System.out.println("Bienvenido al mini diccionario español-ingles.");
        System.out.println("Po favor, introduzca una palabra en español.");
    }

    // Método para pedir una palabra al usuario
    public static String pedirPalabra(Scanner teclado) {
        return teclado.nextLine().toLowerCase();
    }

    // Método para mostrar la tradución de una palabra
    public static void mostrarTraduccion(Map<String, String> diccionario, String palabraEspanol) {
        String traduccion = diccionario.get(palabraEspanol);
        if (traduccion !=null) {
            System.out.println("la traducción de \"" + palabraEspanol + "\" es \"" +  traduccion + "\".");
        }else {
            System.out.println("Lo siento, no encontré una traducción para \"" + palabraEspanol + "\".");
        }
    }
}
