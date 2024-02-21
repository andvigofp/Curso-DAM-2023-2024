package Ejercicios.Ejercicio5;

import Ejercicios.Ejercicio3.MetodosEj3;

import java.util.Scanner;

public class Ejercicio5B {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        //Arrays
        Object[] resultado = MetodosEj5B.pedirNumerosMostrarMinMax(teclado, MetodosEj5B.num_MAX());

        int[] numeros = (int[]) resultado[0];
        int contadorPosicionesRestantes = (int) resultado[1];

        //Mostrar el contador de posiciones restantes
        System.out.println("Quedan " + (contadorPosicionesRestantes) + " posiciones por llenar.");


        // Obtener el mínimo y el máximo
        int[] minMax = MetodosEj5B.obtenerMinMax(numeros);
        int minimo = minMax[0];
        int maximo = minMax[1];

        // Mostrar los números con "máximo" y "mínimo" al lado del máximo y el mínimo, respectivamente
        System.out.println("\nNúmeros introducidos:");
        MetodosEj5B.mostrarNumerosConMaxMin(numeros, minimo, maximo);
    }
}