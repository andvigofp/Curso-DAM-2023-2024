package Ejercicios.Ejercicio21;

import java.util.Random;

public class MetodosEj21 {

    //Método para generar números aleatorios de un array
    public static int[] generarArrayAleatorio(int size, int maxValue) {
        int[] array = new int[size];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(maxValue + 1); // Números aleatorios entre 0 y maxValue
        }
        return array;
    }

    //Método para mostrar el contenido de un array
    public static void mostrarArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    //Método para cincuerizar un array
    public static void cincuerizarArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 5 != 0) { // Si no es múltiplo de 5
                array[i] = ((array[i] / 5) + 1) * 5; // Obtener el siguiente múltiplo de 5
            }
        }
    }
}

