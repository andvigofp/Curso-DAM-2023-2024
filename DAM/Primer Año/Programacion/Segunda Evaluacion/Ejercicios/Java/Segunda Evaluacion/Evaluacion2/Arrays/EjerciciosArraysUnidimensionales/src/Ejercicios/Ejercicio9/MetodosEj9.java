package Ejercicios.Ejercicio9;

import java.util.Scanner;

public class MetodosEj9 {

    //Método para tamaño de la longitud de un array
    public static int num_MAX() {
        return 8;
    }

    //Método contador
    public static void contador(int contadorPosiciones) {
        System.out.println("Te quedan " + contadorPosiciones + " poiciones restantes.");
    }

    //Métdod para pedir al usuario
    public static Object[] pedirNumeros(Scanner teclado, int tamanoArray) {
        int[] numeros = new int[num_MAX()];
        int contadorPosicionesRestantes = tamanoArray;
        for (int i = 0; i < num_MAX(); i++) {
            System.out.print("Introduce el número " + (i + 1) + ": ");
            numeros[i] = teclado.nextInt();
            contadorPosicionesRestantes--; //Reducir el contador
            contador(contadorPosicionesRestantes);
        }
        return new Object[]{numeros, contadorPosicionesRestantes}; //Devolver el arreglo y el contador actualizado
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
