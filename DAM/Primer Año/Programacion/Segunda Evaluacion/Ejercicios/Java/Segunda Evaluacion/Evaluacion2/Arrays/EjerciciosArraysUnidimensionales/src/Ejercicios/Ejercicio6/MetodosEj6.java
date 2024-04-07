package Ejercicios.Ejercicio6;

import java.util.Scanner;

public class MetodosEj6 {
    //Método para tamaño de la longitud de un array
    public static int num_Max() {
        return 15; //Longitud del array
    }

    //Método contador
    public static void contador(int contadorPosiciones) {
        System.out.println("Te quedan " + contadorPosiciones + " poiciones restantes.");
    }

    //Método para pedir Números de un array al usuario
    public static Object[] pedirNumeros(Scanner teclado, int tamano) {
        int[] numeros = new int[tamano];
        int contadorPosicionesRestantes = tamano;
        for (int i = 0; i < tamano; i++) {
            System.out.print("Introduce el número " + (i + 1) + ": ");
            numeros[i] = teclado.nextInt();
            contadorPosicionesRestantes--;
            contador(contadorPosicionesRestantes);
        }
        return new Object[]{numeros, contadorPosicionesRestantes}; //Devolver el arreglo y el contador actualizado
    }

    //Método para la longitud del array
    public static int tamnoArray () {

        int tamano = num_Max();
        return tamano;
    }

    //Métodos para rotar el array a la derecha
    public static void rotarArrayDerecha(int[] array) {
        int ultimoNumero = array[tamnoArray() - 1];
        for (int i = tamnoArray() - 1; i > 0; i--) {
            array[i] = array[i - 1];
        }
        array[0] = ultimoNumero;
    }

    //Método para mostrar el resultado den array
    public static void mostrarArray(int[] array) {
        for (int i = 0; i < tamnoArray(); i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
