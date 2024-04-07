package Ejercicios.Ejercicio19;

import java.util.Random;
import java.util.Scanner;

public class MetodoEj19 {

    //Método para generar un array de números enteros aleatorios en un rango dado
    public static int[] generarArrayAleatorio(Random random, int longitud, int min, int max) {
        int[] array = new int[longitud];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(max - min + 1) + min;
        }
        return array;
    }

    //Método para mostrar un array junto a sus índices
    public static void mostrarArrayConIndices(int[] array) {
        System.out.print("|Índice\t");
        for (int i = 0; i < array.length; i++) {
            System.out.print(i + "| ");
        }
        System.out.println();
        System.out.print("|Valor\t");
        for (int valor : array) {
            System.out.print(valor + "\t");
        }
        System.out.println();
    }

    //Método para insertar un número en una posición específica del array
    public static void insertarNumeroEnArray(int[] array, int numero, int posicion) {
        if (posicion < 0 || posicion >= array.length) {
            System.out.println("La posición indicada no es válida.");
            return;
        }
        for (int i = array.length - 1; i > posicion; i--) {
            array[i] = array[i - 1]; // Desplazar los elementos a la derecha
        }
        array[posicion] = numero; // Insertar el nuevo número en la posición indicada
    }

    //Método para solicitar al usuario un número y una posición donde insertarlo
    public static void solicitarNumeroYPosicion(Scanner teclado, int[] array) {
        System.out.print("Ingrese el número que desea insertar: ");
        int numeroInsertar = teclado.nextInt();
        System.out.print("Ingrese la posición donde desea insertarlo (0 - " + (array.length - 1) + "): ");
        int posicion = teclado.nextInt();
        insertarNumeroEnArray(array, numeroInsertar, posicion);
    }
}

