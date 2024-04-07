package Ejercicios.Ejercicio5;

import Ejercicios.Ejercicio1.MetodosEj1;
import Ejercicios.Ejercicio3.MetodosEj3;

import java.util.Scanner;

public class MetodosEj5 {

    //Método para btener el tamaño máximo del array
    public static int num_MAX() {
        return 10;
    }

    //Método contador
    public static void contador(int contadorPosiciones) {
        System.out.println("Te quedan " + contadorPosiciones + " poiciones restantes.");
    }

    //Métdo para pedir al usuario los números mímo y máximo de un array
    public static Object[]  pedirNumerosMostrarMinMax(Scanner teclado, int tamano) {
        int[] numeros = new int[tamano];
        int contadorPosicionesRestantes = tamano;

        // Pedir al usuario que introduzca 10 números y almacenarlos en el array
        for (int i = 0; i < num_MAX(); i++) {
            System.out.print("Introduce válores " + (i + 1) + ": ");
            numeros[i] = teclado.nextInt();
            contadorPosicionesRestantes--; //Reducir el contador
            contador(contadorPosicionesRestantes);
        }

        return new Object[]{numeros, contadorPosicionesRestantes}; //Devolver el arreglo y el contador actualizado
    }

    //Método para calcular el mínimo
    public static int calcularMin(int numMax[]) {
        int min;
        int auxiliar = numMax[0];

        for (int i = 0; i < num_MAX(); i++) {
            for (int j = 1; j < num_MAX() - 1; j++) {
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

        for (int i = 0; i < num_MAX(); i++) {
            for (int j = 1; j < num_MAX()- 1; j++) {
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
        for (int i = 0; i < num_MAX(); i++) {
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
