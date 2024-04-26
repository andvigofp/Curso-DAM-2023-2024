package org.andres.example.Ejercicio4;

import java.util.ArrayList;
import java.util.Random;

public class MEj4 {
    //Método para generar una palabra aleatoria de longitud aleatoria con letras mayúsculas y minúsculas
    public static String generarPalabraAleatoria() {
        Random rand = new Random();
        int longitud = rand.nextInt(10) + 1; // Longitud aleatoria entre 1 y 10 caracteres
        StringBuilder palabra = new StringBuilder();
        for (int i = 0; i < longitud; i++) {
            char letra;
            if (rand.nextBoolean()) { // Generar letra mayúscula o minúscula de manera aleatoria
                letra = (char) (rand.nextInt(26) + 'A'); // Letra mayúscula
            } else {
                letra = (char) (rand.nextInt(26) + 'a'); // Letra minúscula
            }
            palabra.append(letra);
        }
        return palabra.toString();
    }

    //Método para generar una lista de palabras aleatorias de tamaño aleatorio
  public static ArrayList<String> generarListaPalabrasAleatorias() {
        Random random = new Random();
      ArrayList<String> lista = new ArrayList<>();
      int tamano = random.nextInt((20 - 10) + 1) + 10; // Tamaño aleatorio entre 10 y 20
      for (int i = 0; i < tamano; i++) {
         lista.add(generarPalabraAleatoria());
      }
      return lista;
  }

    //Método para calcular la longitud promedio de las palabras en la lista
    public static double calcularLongitudPromedio(ArrayList<String> lista) {
        int sumaLongitudes = 0;
        for (String palabra : lista) {
            sumaLongitudes += palabra.length();
        }
        return (double) sumaLongitudes / lista.size();
    }

    //Método para encontrar la palabra más larga en la lista
    public static String encontrarPalabraMasLarga(ArrayList<String> lista) {
        String palabraMasLarga = "";
        for (String palabra : lista) {
            if (palabra.length() > palabraMasLarga.length()) {
                palabraMasLarga = palabra;
            }
        }
        return palabraMasLarga;
    }

    //Método para encontrar la palabra más corta en la lista
    public static String encontrarPalabraMasCorta(ArrayList<String> lista) {
        String palabraMasCorta = lista.get(0);
        for (String palabra : lista) {
            if (palabra.length() < palabraMasCorta.length()) {
                palabraMasCorta = palabra;
            }
        }
        return palabraMasCorta;
    }

}
