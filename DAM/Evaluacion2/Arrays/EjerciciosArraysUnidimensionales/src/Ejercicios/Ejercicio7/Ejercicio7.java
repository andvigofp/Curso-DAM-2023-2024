package Ejercicios.Ejercicio7;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio7 {
    /**
     * Escribe un programa que genere 100 números aleatorios del 0 al 20 y que los muestre por pantalla
     * separados por espacios. El programa pedirá entonces por teclado dos valores y a continuación
     * cambiará todas las ocurrencias del primer valor por el segundo en la lista generada anteriormente.
     * Los números que se han cambiado deben aparecer entrecomillados
     */

    public static void main(String[] args) {
        //Pedir valores por teclado
        Scanner teclado = new Scanner(System.in);

        int[] numeros = generarNumerosAleatorios(100, 0, 20);

        //Variables de tipo entero
        int valorAntiguo, valorNuevo;

        System.out.println("Números generados");
        mostrarNumeros(numeros);

        //Pedir dos valores por teclado
        System.out.print("Introduce el primer valor: ");
        valorAntiguo = teclado.nextInt();

        System.out.print("Introduce el segundo valor: ");
        valorNuevo = teclado.nextInt();

        //Cambiar las ocurrencias del primer valor por el segundo
        cambiarValores(numeros, valorAntiguo, valorNuevo);

        //Mostar la lista con los valores cambiados
        System.out.println("Números con cambios:");
        mostrarNumerosConCambios(numeros, valorAntiguo, valorNuevo);

    }

    //Método para generar números aleatorios en un rango dado
    public static int[] generarNumerosAleatorios(int cantidad, int min, int max) {
        Random random = new Random();
        int[] numeros = new int[cantidad];
        for (int i = 0; i < cantidad; i++) {
            numeros[i] = random.nextInt(max - min + 1) + min;
        }
        return numeros;
    }

    //Métod para mostrar los números separados por espacios
    public static void mostrarNumeros(int[] numeros) {
        for (int numero : numeros) {
            System.out.print(numero + " ");
        }
        System.out.println();
    }

    //Método para cambiar las ocurrencias de un valor a otro
    public static void cambiarValores(int[] numeros, int valorAntiguo, int valorNuevo) {
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == valorAntiguo) {
                numeros[i] = valorNuevo;
            }
        }
    }

    //Método para mostrar los números con los cambios entrecomillados
    public static void mostrarNumerosConCambios(int[] numeros, int valorAntiguo, int valorNuevo) {
        for (int numero : numeros) {
            if (numero == valorNuevo) {
                System.out.print("\"" + numero + "\" ");
            } else {
                System.out.print(numero + " ");
            }
        }
        System.out.println();
    }
}