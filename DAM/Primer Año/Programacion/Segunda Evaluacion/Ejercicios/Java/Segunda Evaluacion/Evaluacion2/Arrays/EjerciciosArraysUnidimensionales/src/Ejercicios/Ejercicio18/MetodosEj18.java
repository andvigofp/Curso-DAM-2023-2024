package Ejercicios.Ejercicio18;

import java.util.Random;

public class MetodosEj18 {
    //Método para generar números aleatorios
    public static int[] generarArrayAleatorio(Random random, int longitud, int min, int max) {
        int[] array = new int[longitud];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(max - min + 1) + min;
        }
        return array;
    }

    //Método para mostrar el resultado del array inicial
    public static void mostrarArrayConIndice(int[] array) {
        System.out.print("|Índice  ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(i + "| ");
        }
        System.out.println();
        System.out.print("|Valor   ");
        for (int num : array) {
            System.out.print(num + "| ");
        }
        System.out.println();
    }

    //Método para ordenar los números menor y mayor de un array
    public static void ordenarArrayAlterno(int[] array) {
        int[] copiaArray = array.clone();
        int indiceMenor = 0;
        int indiceMayor = 1;

        for (int num : copiaArray) {
            if (num <= 100) {
                if (indiceMenor < array.length) {
                    array[indiceMenor] = num;
                    indiceMenor += 2;
                }
            } else {
                if (indiceMayor < array.length) {
                    array[indiceMayor] = num;
                    indiceMayor += 2;
                }
            }
        }
    }
}
