package Ejercicios.Ejercicio13;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio13 {
    /**
     *Escribe un programa que rellene un array de 100 elementos con números enteros aleatorios
     * comprendidos entre 0 y 500 (ambos incluidos). A continuación, el programa mostrará el array y
     * preguntará si el usuario quiere destacar el máximo o el mínimo. Seguidamente se volverá a mostrar el
     * array escribiendo el número destacado entre dobles asteriscos.
     */
    public static void main(String[] args) {
        int[] array = new int[100];
        Random random = new Random();
        Scanner teclado = new Scanner(System.in);

        // Rellenar el array con números aleatorios entre 0 y 500
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(501); // El método nextInt(int bound) genera números entre 0 (inclusive) y bound (exclusive)
        }

        // Mostrar el array
        System.out.println("Array original:");
        mostrarArray(array);

        // Preguntar al usuario si quiere destacar el máximo o el mínimo
        System.out.println("\n¿Que Quieres destacar (1- mínimo, 2- máximo)");
        String opcion = teclado.nextLine().trim().toLowerCase();

        // Encontrar el número destacado y destacarlo en el array
        int numeroDestacado;
        if (opcion.equals("1")) {
            numeroDestacado = encontrarMinimo(array);
        } else if (opcion.equals("2")) {
            numeroDestacado = encontrarMaximo(array);
        } else {
            System.out.println("Opción no válida. Saliendo del programa.");
            return;
        }

        // Mostrar el array con el número destacado entre dobles asteriscos
        System.out.println("\nArray con el número destacado:");
        mostrarArrayConDestacado(array, numeroDestacado);


    }

    // Método para mostrar el array
    private static void mostrarArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    // Método para encontrar el máximo en el array
    private static int encontrarMaximo(int[] array) {
        int maximo = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > maximo) {
                maximo = array[i];
            }
        }
        return maximo;
    }

    // Método para encontrar el mínimo en el array
    private static int encontrarMinimo(int[] array) {
        int minimo = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < minimo) {
                minimo = array[i];
            }
        }
        return minimo;
    }

    // Método para mostrar el array con el número destacado entre dobles asteriscos
    private static void mostrarArrayConDestacado(int[] array, int numeroDestacado) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == numeroDestacado) {
                System.out.print("**" + array[i] + "** ");
            } else {
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();
    }
}