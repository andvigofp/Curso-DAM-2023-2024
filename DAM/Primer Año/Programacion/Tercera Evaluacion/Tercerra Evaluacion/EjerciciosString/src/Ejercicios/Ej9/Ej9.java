package Ejercicios.Ej9;

import java.util.Scanner;

/**
 * Encuentra cadena. Diseña un programa en Java que solicite al usuario una cadena en la que
 * buscará y otra que será la cadena buscada. El programa indicará cuantas veces aparece la
 * segunda cadena en la primera.
 */
public class Ej9 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        //Pedir  al usuario la cadena en la que buscará
        String cadenaPrincipal = MEj9.solicitarCadena(teclado, "Introduce la cadena en la que buscarás: ");

        //Pedir al usuario la cadena buscada
        String cadenaBuscada = MEj9.solicitarCadena(teclado, "Introduce la cadena buscada: ");

        //Contar cuántas veces aparece la cadena buscada en la cadena principal
        int aparaciones = MEj9.contarAparciones(cadenaPrincipal, cadenaBuscada);

        // Mostrar el resultado
        System.out.println("La cadena buscada aparece " + aparaciones + " veces en la cadena principal.");

        teclado.close();
    }
}
