package Ejercicios.Ejercicio5;

import Ejercicios.Ejercicio3.MetodosEj3;

import java.util.Scanner;

public class MetodosEj5B {

    //Método para tamaño de la longitud de un array
    public static int num_MAX() {
        return 10;
    }

    //Método contador
    public static void contador(int contadorPosiciones) {
        System.out.println("Te quedan " + contadorPosiciones + " poiciones restantes.");
    }

    //Método para pedir números al usuario
    public static Object[] pedirNumerosMostrarMinMax(Scanner teclado, int tamano) {
        int[] numeros = new int[tamano];
        int contadorPosicionesRestantes = tamano;

        // Pedir al usuario que introduzca 10 números y almacenarlos en el array
        for (int i = 0; i < MetodosEj3.num_MAX(); i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = teclado.nextInt();
            contadorPosicionesRestantes--;
            contador(contadorPosicionesRestantes);
        }

        return new Object[]{numeros, contadorPosicionesRestantes}; //Devolver el arreglo y el contador actualizado
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
