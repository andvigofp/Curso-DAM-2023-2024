package Ejercicios.Ejercicio13;

import java.util.Random;

public class MetodosEj13 {
    //Método para generar números aleatorios
    public static int[] generarNumerosAleatorios(int cantidad, int maximo) {
        int[] array = new int[cantidad];
        Random random = new Random();
        for (int i = 0; i < cantidad; i++) {
            array[i] = random.nextInt(maximo + 1);
        }
        return array;
    }

    //Método para mostrar el array
    public static void mostrarArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    //Método para encontrar el máximo en el array
    public static int encontrarMaximo(int[] array) {
        int maximo = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > maximo) {
                maximo = array[i];
            }
        }
        return maximo;
    }

    //Método para encontrar el mínimo en el array
    public static int encontrarMinimo(int[] array) {
        int minimo = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < minimo) {
                minimo = array[i];
            }
        }
        return minimo;
    }

    //Método para mostrar el array con el número destacado entre dobles asteriscos
    public static void mostrarArrayConDestacado(int[] array, int numeroDestacado) {
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
