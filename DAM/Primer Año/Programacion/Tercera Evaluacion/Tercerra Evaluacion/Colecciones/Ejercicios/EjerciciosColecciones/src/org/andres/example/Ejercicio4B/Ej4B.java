package org.andres.example.Ejercicio4B;

import org.andres.example.Ejercicio3.MEj3;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Escribe un programa que ordene 10 números enteros introducidos por teclado y almacenados en un objeto
 * de la clase ArrayList.
 */
public class Ej4B {
    public static void main(String[] args) {
        //Salida por teclado
        Scanner teclado = new Scanner(System.in);
        //ArrayList que lea 10 números
        ArrayList<String> palabras = MEj4B.leerPalabras(teclado);
        //Ordene los números en orden ascendente
        MEj4B.ordenarPalabras(palabras);
        //Mostrar el resultado
        MEj4B.mostrarPalbras(palabras);


    }
}
