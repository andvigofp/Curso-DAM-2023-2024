package Ejercicios.Ejercicio5;

import java.util.Scanner;

public class Ejercicio5B {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int[] numeros = MetodosEj5B.pedirNumerosMostrarMinMax(teclado);



        // Obtener el mínimo y el máximo
        int[] minMax = MetodosEj5B.obtenerMinMax(numeros);
        int minimo = minMax[0];
        int maximo = minMax[1];

        // Mostrar los números con "máximo" y "mínimo" al lado del máximo y el mínimo, respectivamente
        System.out.println("\nNúmeros introducidos:");
        MetodosEj5B.mostrarNumerosConMaxMin(numeros, minimo, maximo);
    }
}