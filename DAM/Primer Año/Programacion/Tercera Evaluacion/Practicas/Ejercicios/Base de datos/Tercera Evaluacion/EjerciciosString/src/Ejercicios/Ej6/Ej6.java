package Ejercicios.Ej6;

import Ejercicios.Ej5.MEj5;

import java.util.Scanner;

/**
 * Crea un programa que en una cadena de caracteres sustituya los puntos por comas.
 */
public class Ej6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

       String cadena= MEj6.solicitarCadena(teclado);

        String resultado = MEj6.remplazarPuntosComas(cadena);

        System.out.println("Cadena con puntos remplazado por comas " + resultado);

        teclado.close();
    }
}
