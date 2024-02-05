package Ejerciicos.Ejercicios14;

import java.util.Scanner;

public class DivisibleEntreCincoParSwich {
    /**
     *Realiza un programa que diga si un número introducido por teclado es par y/o
     * divisible entre 5.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //variables
        int numero;

        // Solicitar un número al usuario
        System.out.println("Introduce un número entero:");
        numero = scanner.nextInt();

        // Utilizar switch para verificar si el número es par y/o divisible entre 5
        switch (numero % 2) {
            case 0:
                System.out.println(numero + " es un número par.");
                break;
            default:
                System.out.println(numero + " no es un número par.");
                break;
        }

        switch (numero % 5) {
            case 0:
                System.out.println(numero + " es divisible entre 5.");
                break;
            default:
                System.out.println(numero + " no es divisible entre 5.");
                break;
        }
    }
}

