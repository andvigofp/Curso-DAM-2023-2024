package Ejercicios.Ejercicio5;

import java.util.Scanner;

public class MetodosEj5B {

    //Método para pedir números al usuario
    public static int[] pedirNumerosMostrarMinMax(Scanner teclado) {
        int[] numeros = new int[10];

        // Pedir al usuario que introduzca 10 números y almacenarlos en el array
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = teclado.nextInt();
        }

        return numeros;
    }

    //Método para obtener mínimo y máximo

    public static int[] obtenerMinMax(int[] array) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int num : array) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }
        return new int[]{min, max};
    }

    //Método para mostrar el resultao del mínimo y máximo
    public static void mostrarNumerosConMaxMin(int[] array, int min, int max) {
        for (int num : array) {
            System.out.print(num);
            if (num == max) {
                System.out.print(" (máximo)");
            } else if (num == min) {
                System.out.print(" (mínimo)");
            }
            System.out.println();
        }
    }
}
