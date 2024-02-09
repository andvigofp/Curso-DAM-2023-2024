package Ejercicios.Ejercicio11;

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

        //Variables tipo entero
        int indicePrimos = 0, indiceNoPrimos=0;

        //Crear un array para almacenar los 10 números
        int[] numeros = new int[10];

        //Pedir valores al usario almacenados en el array (0-9)
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingrese el número en la posición " + i + ": ");
            numeros[i] = teclado.nextInt();
        }

        //Mostrar el contenido del array junto al índice horizontalmente
        System.out.println("\nContenido del array junto al índice:");
        System.out.println("-------------------------------------");
        System.out.print("| Índice ");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("|   " + i + "   ");
        }
        System.out.println("|");
        System.out.println("-------------------------------------");
        System.out.print("| Número ");
        for (int i = 0; i < numeros.length; i++) {
            System.out.printf("|  %3d  ", numeros[i]);
        }
        System.out.println("|");
        System.out.println("-------------------------------------");

        //Crear el array resultante
        int[] resultado = new int[numeros.length];


        //Mover los números primos al principio del array resultante
        for (int i = 0; i < numeros.length; i++) {
            if (esPrimo(numeros[i])) {
                resultado[indicePrimos] = numeros[i];
                indicePrimos++;
            }
        }

        //Mover los números que no son primos al resto del array resultante
        indiceNoPrimos = indicePrimos;

        for (int i = 0; i < numeros.length; i++) {
            if (!esPrimo(numeros[i])) {
                resultado[indiceNoPrimos] = numeros[i];
                indiceNoPrimos++;
            }
        }

        //Mostrar el array resultante horizontalmente
        System.out.println("\nArray resultante:");
        System.out.println("-------------------------------------");
        System.out.print("| Índice ");
        for (int i = 0; i < resultado.length; i++) {
            System.out.print("|   " + i + "   ");
        }
        System.out.println("|");
        System.out.println("-------------------------------------");
        System.out.print("| Número ");
        for (int i = 0; i < resultado.length; i++) {
            System.out.printf("|  %3d  ", resultado[i]);
        }
        System.out.println("|");
        System.out.println("-------------------------------------");

    }

    //Método para verificar si un número es primo
    public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
}