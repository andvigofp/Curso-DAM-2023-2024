package org.andres.example.Ejercicio4B;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MEj4B {


    //Método para leer números enteros del usuario y almacenarlos en un ArrayList
    public static ArrayList<String> leerPalabras (Scanner teclado) {

        ArrayList <String> palabras = new ArrayList<>();
        for (int i=0; i<10; i++) {
            System.out.println("Introduzca 10 palabras");
           String palabra= teclado.nextLine().toLowerCase();
            palabras.add(palabra);
        }
       return palabras;
    }


    //Método para ordenar los números en orden ascendente
  public static void ordenarNumeros(ArrayList<String> palabras) {
        Collections.sort(palabras);
  }

  //Método para mostar el resultado del ArrayList
  public static void mostrarNumeros(ArrayList<String> palabras) {
        for (String p : palabras) {
            System.out.print(p + " ");
        }
  }
}
