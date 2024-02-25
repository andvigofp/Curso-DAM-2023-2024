package Ejercicios.Ejercicio16;

import java.util.Random;
import java.util.Scanner;

public class MetodoEj16 {
//Método para crear y rellenar un array con números aleatorios
    public static int[] crearArrayAleatorio(Random random, int longitud, int maximo) {
        int[] array = new int[longitud];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(maximo + 1); // Números aleatorios entre 0 y maximo
        }
        return array;
    }

    // Método para mostrar el contenido de un array
    public static void mostrarArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    // Método para resaltar los múltiplos de un número en el array
    public static void resaltarMultiplos(int[] array, int multiplo) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] % multiplo == 0) {
                System.out.print("[" + array[i] + "] ");
            } else {
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();
    }

    // Método para realizar todas las operaciones del programa
    public static void realizarOperaciones(Scanner teclado, Random random) {
        // Crear y rellenar el array con números aleatorios entre 0 y 400
        int[] array = crearArrayAleatorio(random, 20, 400);

        // Mostrar el array original
        System.out.println("Array original:");
        mostrarArray(array);

        // Preguntar al usuario qué múltiplos desea resaltar
        System.out.print("¿Desea resaltar los múltiplos (1- los múltiplos de 5, 2- los múltiplos de 7): ");
        int opcion = teclado.nextInt();

        // Resaltar los múltiplos correspondientes
        System.out.println("Array con los múltiplos resaltados:");
        if (opcion == 1) {
            resaltarMultiplos(array, 5);
        } else if (opcion == 2) {
            resaltarMultiplos(array, 7);
        } else {
            System.out.println("Opción no válida.");
        }
    }
}