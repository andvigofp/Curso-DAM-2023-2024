package Ejercicios.Ejercicio5;

import Ejercicios.Ejercicio3.MetodosEj3;

import java.util.Scanner;

public class Ejercicio5 {
    /**
     * Escribe un programa que pida 10 números por teclado y que luego muestre los números introducidos
     * junto con las palabras “máximo” y “mínimo” al lado del máximo y del mínimo respectivamente.
     */

    public static void main(String[] args) {
        //Leer por teclado
        Scanner teclado = new Scanner(System.in);

        //Arrays
        Object[] resultado = MetodosEj5.pedirNumerosMostrarMinMax(teclado, MetodosEj5.num_MAX());

        int[] numeros = (int[]) resultado[0];
        int contadorPosicionesRestantes = (int) resultado[1];

        //Mostrar el contador de posiciones restantes
        System.out.println("Quedan " + (contadorPosicionesRestantes) + " posiciones por llenar.");

        //Variables de tipo entero maximo y mínimo de los números de un aaray
        int maximo = Integer.MIN_VALUE;
        int minimo = Integer.MAX_VALUE;

        minimo = MetodosEj5.calcularMin(numeros);
        maximo = MetodosEj5.calcularMax(numeros);
        MetodosEj5.resultado(numeros,maximo,minimo);

    }

}