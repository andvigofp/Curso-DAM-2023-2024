package Ejercicios.Ejercicio5;

import java.util.Scanner;

public class MetodosEj5 {

    //Métdo para pedir al usuario los números mímo y máximo de un array
    public static int[] pedirNumerosMostrarMinMax(Scanner teclado) {
        int[] numeros = new int[10];

        // Pedir al usuario que introduzca 10 números y almacenarlos en el array
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Introduce válores " + (i + 1) + ": ");
            numeros[i] = teclado.nextInt();
        }

        return numeros;
    }

    //Método para calcular el mínimo
    public static int calcularMin(int numMax[]) {
        int min;
        int auxiliar = numMax[0];

        for (int i = 0; i < numMax.length; i++) {
            for (int j = 1; j < numMax.length - 1; j++) {
                min = (numMax[i] < numMax[j]) ? numMax[i] : numMax[j];
                if (min < auxiliar) {
                    auxiliar = min;
                }
            }
        }
        return (auxiliar);
    }
    //Método para calcular el Máximo
    public static int calcularMax(int numMax[]) {
        int max;
        int auxiliar = numMax[0];

        for (int i = 0; i < numMax.length; i++) {
            for (int j = 1; j < numMax.length - 1; j++) {
                max = (numMax[i] > numMax[j]) ? numMax[i] : numMax[j];
                if (max > auxiliar) {
                    auxiliar = max;
                }
            }
        }
        return (auxiliar);
    }

    public static void resultado(int[] numeros, int maximo, int minimo) {
        System.out.println("\t\tNúmero");
        System.out.println("--------------------------------");
        for (int i = 0; i < numeros.length; i++) {
            System.out.printf("%6d", numeros[i]);
            if (numeros[i] == maximo) {
                System.out.print(" (máximo)");
            } else if (numeros[i] == minimo) {
                System.out.print(" (mínimo)");
            }
            System.out.println();
        }

    }
}
