package Ejercicios.Ejercicio12;

import java.util.Scanner;

public class MetodosEj12 {
    //Métodos para pedir números al usuario por la psoción del aray
    public static void pedirNumeros(int[] numeros, Scanner teclado) {
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingrese el número en la posición " + i + ": ");
            numeros[i] = teclado.nextInt();
        }
    }

    //Métodos para mostrar el resultado incial del array
    public static void resultadoArrayInicial(int[] numeros) {
        System.out.println("\nContenido del array junto al índice:");
        System.out.println("-------------------------------------");
        System.out.print("| Índice ");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("|   " + i + "   ");
        }
        System.out.println("|");
        System.out.println("-------------------------------------");
        System.out.print("| Valor ");
        for (int i = 0; i < numeros.length; i++) {
            System.out.printf("|  %3d  ", numeros[i]);
        }
        System.out.println("|");
        System.out.println("-------------------------------------");
    }

    //Métedos para rotar la arary mediante la posición del array
    public static int[] rotacionArray(int[] numeros, int posInicial, int posFinal) {
        int[] auxiliar = new int[numeros.length];
        for (int i = 0; i < numeros.length; i++) {
            auxiliar[i] = numeros[i];
        }
        if (posInicial < posFinal) {
            int numInicial = numeros[posInicial];
            auxiliar[posFinal] = numInicial;
            for (int i = posFinal; i < numeros.length - 1; i++) {
                auxiliar[i + 1] = numeros[i];
            }
            auxiliar[0] = numeros[numeros.length - 1];
            for (int i = 1; i <= posInicial; i++) {
                auxiliar[i] = numeros[i - 1];
            }
        }
        return auxiliar;
    }

    //Métodos para mostrar el resultado final del array
    public static void resultadoArrayFinal(int[] numeros) {
        System.out.println("\nContenido del array junto al índice:");
        System.out.println("-------------------------------------");
        System.out.print("| Índice ");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("|   " + i + "   ");
        }
        System.out.println("|");
        System.out.println("-------------------------------------");
        System.out.print("| Valor ");
        for (int i = 0; i < numeros.length; i++) {
            System.out.printf("|  %3d  ", numeros[i]);
        }
        System.out.println("|");
        System.out.println("-------------------------------------");
    }


}

