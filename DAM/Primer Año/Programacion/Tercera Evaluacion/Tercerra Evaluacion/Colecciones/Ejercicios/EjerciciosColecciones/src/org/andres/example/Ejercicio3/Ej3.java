package org.andres.example.Ejercicio3;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Escribe un programa que ordene 10 números enteros introducidos por teclado y almacenados en un objeto
 * de la clase ArrayList.
 */
public class Ej3 {
    public static void main(String[] args) {
        //Salida por teclado
        Scanner teclado = new Scanner(System.in);
        //ArrayList que lea 10 números
        ArrayList<Integer> numeros = MEj3.leerNumeros(teclado);
        //Ordene los números en orden ascendente
        MEj3.ordenarNumeros(numeros);
        //Mostrar el resultado
        MEj3.mostrarNumeros(numeros);


    }
}
