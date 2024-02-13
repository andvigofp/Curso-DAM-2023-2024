package Ejercicios.Ejercicio3;

import java.util.Scanner;

public class MetodosEj3 {

    //Método para pedir números
    public static int[] pedirnumero(Scanner teclado) {
        int[] numero = new int[10];

        for (int i =0; i<numero.length; i++) {
            System.out.println("Introduce valores del array " + i + ": ");
            numero[i] = teclado.nextInt();
        }

        System.out.println("------------------------------");
        return numero;
    }

    public static void resultadoArrayInicial(int[] numeros) {
        System.out.println("-------------------------------------");
        System.out.print("| Array Incial ");
        for (int i=0; i<numeros.length; i++) {
            System.out.printf("|  %3d  ", numeros[i]);
        }
        System.out.println("|");
        System.out.println("-------------------------------------");
    }

    //Método para mosrar el resultado
    public static void resultadoArray(int numeros[]) {
        System.out.println("-------------------------------------");
        System.out.print("| Array Final ");
        for (int i =numeros.length -1; i>0; i--) {
            System.out.printf("|  %3d  ", numeros[i]);
        }
        System.out.println("|");
        System.out.println("-------------------------------------");
    }
}

