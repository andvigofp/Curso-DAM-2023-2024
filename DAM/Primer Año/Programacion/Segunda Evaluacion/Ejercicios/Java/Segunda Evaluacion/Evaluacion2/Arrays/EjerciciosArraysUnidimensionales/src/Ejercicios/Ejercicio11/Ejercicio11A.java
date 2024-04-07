package Ejercicios.Ejercicio11;

import Ejercicios.Ejercicio10.MetodosEj10;

import java.util.Scanner;

public class Ejercicio11A {
    /**
     * Realiza un programa que pida 10 números por teclado y que los almacene en un array. A continuación
     * se mostrará el contenido de ese array junto al índice (0 – 9) utilizando para ello una tabla.
     * Seguidamente el programa pasará los primos a las primeras posiciones, desplazando el resto de
     * números (los que no son primos) de tal forma que no se pierda ninguno. Al final se debe mostrar el
     * array resultante.
     */

    public static void main(String[] args) {
        //Leer los 10 números del usuario
        Scanner teclado = new Scanner(System.in);

        //Pedir el número de posición
        int[] numeros = MetodosEj11.leerNumeros(teclado);
        //Mostrar el resultado array incial
        MetodosEj11.mostrarArrayIncial("Contenido del array junto al índice:", numeros);
        //Reorganizar los números primos y no primos del array
        int[] resultado = MetodosEj11.reorganizarNumerosPrimos(numeros);
        //Mostrar el resultado final del array
        MetodosEj11.mostrarArrayIncial("Array resultante:", resultado);
    }
}