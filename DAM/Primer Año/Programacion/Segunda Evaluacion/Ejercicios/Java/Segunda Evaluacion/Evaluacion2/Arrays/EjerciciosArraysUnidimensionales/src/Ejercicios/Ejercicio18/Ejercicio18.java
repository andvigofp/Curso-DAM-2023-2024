package Ejercicios.Ejercicio18;

import java.util.Random;

public class Ejercicio18 {
    /**
     * Realiza un programa que genere 10 números enteros aleatorios entre 0 y 200 ambos incluidos y que
     * los almacene en un array. A continuación, el programa debe mostrar el contenido de ese array junto
     * al índice (0 – 9). Seguidamente el programa debe colocar de forma alterna y en orden los menores o
     * iguales de 100 y los mayores de 100: primero menor, luego mayor, luego menor, luego mayor…
     * Cuando se acaben los menores o los mayores, se completará con los números que queden.
     *
     * Ejemplo 1:
     *
     * Array original:
     * |Índice 0| 1| 2| 3| 4| 5| 6| 7| 8| 9|
     * |Valor 127| 178| 11| 39| 121| 82| 130| 47| 128| 129|
     *
     * Array resultado:
     * |Índice 0| 1| 2| 3| 4| 5| 6| 7| 8| 9|
     * |Valor 11| 127| 39| 178| 82| 121| 47| 130| 128| 129|
     *
     *
     * Ejemplo 2:
     *
     * Array original:
     * |Índice 0| 1| 2| 3| 4| 5| 6| 7| 8| 9|
     * |Valor 170| 189| 87| 149| 176| 110| 119| 9| 33| 157|
     *
     * Array resultado:
     * |Índice 0| 1| 2| 3| 4| 5| 6| 7| 8| 9|
     * |Valor 87| 170| 9| 189| 33| 149| 176| 110| 119| 157|
     *
     * Ejemplo 3:
     *
     * Array original:
     * |Índice 0| 1| 2| 3| 4| 5| 6| 7| 8| 9|
     * |Valor 119| 88| 139| 146| 34| 4| 195| 160| 27| 115|
     *
     * Array resultado:
     * |Índice 0| 1| 2| 3| 4| 5| 6| 7| 8| 9|
     * |Valor 88| 119| 34| 139| 4| 146| 27| 195| 160| 115|
     */

    public static void main(String[] args) {

            //Numeros aleatorios
            Random random = new Random();
            //Generar números aletorios
            int[] arrayOriginal = MetodosEj18.generarArrayAleatorio(random, 10, 0, 200);

            //Mostrar el resultado del array incial
            System.out.println("Array original:");
            MetodosEj18.mostrarArrayConIndice(arrayOriginal);

            //Ordenar los números de menor a mayor generados
            MetodosEj18.ordenarArrayAlterno(arrayOriginal);

            //Mostrar el array final, generado de menor a mayor
            System.out.println("\nArray resultado:");
            MetodosEj18.mostrarArrayConIndice(arrayOriginal);
        }
    }


