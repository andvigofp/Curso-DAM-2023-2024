package Ejercicios.Ej2;

import java.util.Scanner;

/**
 * Escribe un programa que pida 20 números enteros. Estos números se deben introducir en un
 * array de 4 filas por 5 columnas. El programa mostrará las sumas parciales de filas y columnas
 * igual que si de una hoja de cálculo se tratara. La suma total debe aparecer en la esquina
 * inferior derecha.
 */

public class Ej2 {
    public static void main(String[] args) {
        //Leer por teclado
        Scanner teclado = new Scanner(System.in);
        //Array de números enteros de 4 filas de 5 columnas
        int numeros[][] = new int[MetodosEj2.num_MaxFila()][MetodosEj2.num_MaxColum()];

        //Para pedir al usuario por teclado
        MetodosEj2.pedirNumero(teclado,numeros);

        System.out.println();

        MetodosEj2.sumaFila(numeros);

        MetodosEj2.sumaTotal(numeros);

    }
}