package org.andres.example.Ejercicio3;

import java.util.*;

public class MEj3 {


    //Método para leer números enteros del usuario y almacenarlos en un ArrayList
    public static ArrayList<Integer> leerNumeros (Scanner teclado) {
        int numero;
        ArrayList <Integer> numeros = new ArrayList<>();

        for (int i=0; i<10; i++) {
            System.out.println("Introduzca 10 números enteros");
            numero = teclado.nextInt();
            numeros.add(numero);
        }
       return numeros;
    }


    //Método para ordenar los  números en orden ascendente
  public static void ordenarNumeros(ArrayList<Integer> numeros) {
        Collections.sort(numeros);
  }

  //Método para mostar el resultado del ArrayList
  public static void mostrarNumeros(ArrayList<Integer> numeros) {
        for (int n : numeros) {
            System.out.print(n + " ");
        }
  }
}
