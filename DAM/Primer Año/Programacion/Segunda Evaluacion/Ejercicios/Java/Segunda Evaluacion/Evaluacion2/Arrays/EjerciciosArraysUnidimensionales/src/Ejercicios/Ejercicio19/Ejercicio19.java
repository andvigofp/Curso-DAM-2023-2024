package Ejercicios.Ejercicio19;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio19 {
    /**
     * Realiza un programa que sea capaz de insertar un número en una posición concreta de un array. En
     * primer lugar, el programa generará un array de 12 números enteros aleatorios entre 0 y 200 ambos
     * incluidos. A continuación, se debe mostrar el contenido de ese array junto al índice (0 – 11).
     * Seguidamente el programa preguntará por el número que se quiere insertar y por la posición donde
     * será insertado. Los números del array se desplazan a la derecha para dejar sitio al nuevo. El último
     * número (el que se encuentra en la posición 11) siempre se perderá.
     */

    public static void main(String[] args) {
        //Leer por teclado
        Scanner teclado = new Scanner(System.in);
        //Generar números aleatorios
        Random random = new Random();

        //Generar un array de 12 números enteros aleatorios entre 0 y 200
        int[] array = MetodoEj19.generarArrayAleatorio(random, 12, 0, 200);

        //Mostrar el array original junto a sus índices
        System.out.println("Array original:");
        MetodoEj19.mostrarArrayConIndices(array);

        //Solicitar al usuario el número y la posición donde desea insertarlo
        MetodoEj19.solicitarNumeroYPosicion(teclado, array);

        //Mostrar el array actualizado junto a sus índices
        System.out.println("Array actualizado:");
        MetodoEj19.mostrarArrayConIndices(array);
        }
    }


