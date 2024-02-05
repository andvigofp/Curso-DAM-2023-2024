package Ejerciicos.Ejercicios14;

import java.util.Scanner;

public class DivisibleEntreCincoParIf {
    /**
     *Realiza un programa que diga si un número introducido por teclado es par y/o
     * divisible entre 5.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Variable
        int numero;
        // Solicitar un número al usuario
        System.out.println("Introduce un número entero:");
        numero = scanner.nextInt();

        // Comprobar si el número es par y/o divisible entre 5
        if (numero % 2 == 0) {
            System.out.println(numero + " es un número par.");
        } else {
            System.out.println(numero + " no es un número par.");
        }

        if (numero % 5 == 0) {
            System.out.println(numero + " es divisible entre 5.");
        } else {
            System.out.println(numero + " no es divisible entre 5.");
        }
    }
}

