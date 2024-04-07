package Ejercicios.Ejercicio11;

import java.util.Scanner;

public class MetodosEj11 {
    //Méteod para pedir al usuario mediante la posción dela array
    public static int[] leerNumeros(Scanner teclado) {
        int[] numeros = new int[10];
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingrese el número en la posición " + i + ": ");
            numeros[i] = teclado.nextInt();
        }
        return numeros;
    }

    //Método para mostrar el array inicial
    public static void mostrarArrayIncial(String mensaje, int[] array) {
        System.out.println(mensaje);
        System.out.println("-------------------------------------");
        System.out.print("| Índice ");
        for (int i = 0; i < array.length; i++) {
            System.out.print("|   " + i + "   ");
        }
        System.out.println("|");
        System.out.println("-------------------------------------");
        System.out.print("| Valor ");
        for (int i = 0; i < array.length; i++) {
            System.out.printf("|  %3d  ", array[i]);
        }
        System.out.println("|");
        System.out.println("-------------------------------------");
    }

    //Métdo para reorganizar lso Numeros Primos o no primos
    public static int[] reorganizarNumerosPrimos(int[] numeros) {
        int[] resultado = new int[numeros.length];
        int indicePrimos = 0;
        int indiceNoPrimos = 0;

        for (int numero : numeros) {
            if (esPrimo(numero)) {
                resultado[indicePrimos] = numero;
                indicePrimos++;
            }
        }

        indiceNoPrimos = indicePrimos;
        for (int numero : numeros) {
            if (!esPrimo(numero)) {
                resultado[indiceNoPrimos] = numero;
                indiceNoPrimos++;
            }
        }

        return resultado;
    }

    //Método para saber si es un número primo
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
