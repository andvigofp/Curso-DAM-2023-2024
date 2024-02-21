package Ejercicios.Ejercicio17;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MetdodosEj17 {
    public static int[] generarArrayAleatorio(Random random, int longitud, int min, int max) {
        int[] array = new int[longitud];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(max - min + 1) + min;
        }
        return array;
    }

    public static void mostrarArray(String mensaje, int[] array) {
        System.out.println(mensaje);
        System.out.print("Índice\n ");
        System.out.println("-------------------------");
        for (int i=0; i<array.length; i++) {

            System.out.print("|" +i + " |");


        }
        System.out.println("\n----------------------------");
        System.out.print("Valor\n ");
        System.out.println("----------------------------");
        System.out.println(Arrays.toString(array)); //Devuelve una cadena de caracteres representando el array especificado y sus elementos


    }

    public static int obtenerNumeroValido(Scanner teclado, int[] array) {
        int numero;
        boolean encontrado;
        do {
            System.out.print("Ingrese un número que se encuentre en el array: ");
            numero = teclado.nextInt();
            encontrado = buscarNumeroEnArray(array, numero);
            if (!encontrado) {
                System.out.println("El número no se encuentra en el array. Inténtelo de nuevo.");
                mostrarArray("Array generado:", array);
            }
        } while (!encontrado);
        return numero;
    }

    public static boolean buscarNumeroEnArray(int[] array, int numero) {
        for (int num : array) {
            if (num == numero) {
                return true;
            }
        }
        return false;
    }

    public static void rotarArrayHastaPosicionCero(int[] array, int numero) {
        while (array[0] != numero) {
            rotarArrayDerecha(array);
        }
    }

    public static void rotarArrayDerecha(int[] array) {
        int ultimoElemento = array[array.length - 1];
        for (int i = array.length - 1; i > 0; i--) {
            array[i] = array[i - 1];
        }
        array[0] = ultimoElemento;
    }
}
