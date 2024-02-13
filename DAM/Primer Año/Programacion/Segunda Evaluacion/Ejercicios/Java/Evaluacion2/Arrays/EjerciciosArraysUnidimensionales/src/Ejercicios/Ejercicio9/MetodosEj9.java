package Ejercicios.Ejercicio9;

import java.util.Scanner;

public class MetodosEj9 {
    //Métdod para pedir al usuario
    public static int[] pedirNumeros(Scanner teclado) {
        int[] numeros = new int[8];
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Introduce el número " + (i + 1) + ": ");
            numeros[i] = teclado.nextInt();
        }
        return numeros;
    }
    //Método para mostrar el resultado de para y par

    public static void mostrarNumerosParImpar(int[] numeros) {
        System.out.println("Números y clasificación:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " es ");
            if (esPar(numeros[i])) {
                System.out.println("par");
            } else {
                System.out.println("impar");
            }
        }
    }

    //Método para verificar si un número es par
    public static boolean esPar(int numero) {
        return numero % 2 == 0;
    }
}
