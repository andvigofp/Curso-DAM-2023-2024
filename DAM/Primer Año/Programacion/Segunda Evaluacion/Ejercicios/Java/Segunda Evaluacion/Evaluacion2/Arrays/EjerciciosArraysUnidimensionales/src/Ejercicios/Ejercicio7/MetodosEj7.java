package Ejercicios.Ejercicio7;

import java.util.Random;

public class MetodosEj7 {
   
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