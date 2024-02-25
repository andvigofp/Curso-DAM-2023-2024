package Ejercicios.Ejercicio3;

import java.util.Scanner;

public class MetodosEj3 {

        //Método para tamaño de la longitud de un array
        public static int num_MAX() {
            return 10;
        }

    //Método contador
    public static void contador(int contadorPosiciones) {
        System.out.println("Te quedan " + contadorPosiciones + " poiciones restantes.");
    }


        //Método para pedir números
        public static Object[] pedirnumero(Scanner teclado, int tamanoArray) {
            int[] numero = new int[tamanoArray];
            int contadorPosicionesRestantes = tamanoArray;

            for (int i = 0; i < tamanoArray; i++) {
                System.out.println("Introduce el valor para la posición " + i + ": ");
                numero[i] = teclado.nextInt();
                contadorPosicionesRestantes--; //Reducir el contador
               contador(contadorPosicionesRestantes);
            }

            System.out.println("------------------------------");
            return new Object[]{numero, contadorPosicionesRestantes}; //Devolver el arreglo y el contador actualizado
        }

        //Método
        public static void resultadoArrayInicial(int[] numeros) {
            System.out.println("-------------------------------------");
            System.out.print("| Array Incial ");
            for (int i = 0; i < num_MAX(); i++) {
                System.out.printf("|  %3d  ", numeros[i]);
            }
            System.out.println("|");
            System.out.println("-------------------------------------");
        }

        // Método para mostrar el resultado
        public static void resultadoArray(int numeros[]) {
            System.out.println("-------------------------------------");
            System.out.print("| Array Final ");
            for (int i = num_MAX() - 1; i >= 0; i--) {
                System.out.printf("|  %3d  ", numeros[i]);
            }
            System.out.println("|");
            System.out.println("-------------------------------------");
        }
    }
