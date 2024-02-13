package Ejercicios.Ejercicio6;

import java.util.Scanner;

public class MetodosEj6 {
    //Método para pedir Números de un array al usuario
    public static int[] pedirNumeros(Scanner teclado) {
        int[] numeros = new int[15];
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Introduce el número " + (i + 1) + ": ");
            numeros[i] = teclado.nextInt();
        }
        return numeros;
    }

    //Métodos para rotar el array a la derecha
    public static void rotarArrayDerecha(int[] array) {
        int ultimoNumero = array[array.length - 1];
        for (int i = array.length - 1; i > 0; i--) {
            array[i] = array[i - 1];
        }
        array[0] = ultimoNumero;
    }

    //Método para mostrar el resultado den array
    public static void mostrarArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
