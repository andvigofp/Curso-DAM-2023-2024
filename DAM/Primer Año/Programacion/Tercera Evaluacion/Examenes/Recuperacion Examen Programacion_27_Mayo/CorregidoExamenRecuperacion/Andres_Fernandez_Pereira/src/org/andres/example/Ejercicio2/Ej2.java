package org.andres.example.Ejercicio2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {
        // Leer números positivos hasta que se introduzca un número negativo
        List<Integer> numeros = MEJ2.leerNumeros();

        // Mostrar la lista original
        System.out.println("Lista original:");
        System.out.println("Lista original:");
        MEJ2.mostrarLista(numeros);

        // Encontrar y mostrar los índices de los elementos de valor par
        MEJ2.procesarPares(numeros);

        // Mostrar la lista modificada
        System.out.println("Lista modificada:");
        MEJ2.mostrarLista(numeros);
    }
}
