package Ejercicios.Ejercicio11;

import java.util.Scanner;

public class Ejercicio11B {
    public static void main(String[] args) {
        //Leer los 10 números del usuario
        Scanner teclado = new Scanner(System.in);

        //Variables tipo entero
        int indicePrimos = 0, indiceNoPrimos=0;

        //Crear un array para almacenar los 10 números
        int[] numeros = new int[10];

       //Pedir valores al usario almacenados en el array (0-9)
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingrese el número en la posición " + i + ": ");
            numeros[i] = teclado.nextInt();
        }

        //Mostrar el contenido del array junto al índice horizontalmente
        System.out.println("\nContenido del array junto al índice:");
        System.out.println("-------------------------------------");
        System.out.print("| Índice ");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("|   " + i + "   ");
        }
        System.out.println("|");
        System.out.println("-------------------------------------");
        System.out.print("| Número ");
        for (int i = 0; i < numeros.length; i++) {
            System.out.printf("|  %3d  ", numeros[i]);
        }
        System.out.println("|");
        System.out.println("-------------------------------------");

        //Crear arrays para almacenar números primos y no primos
        int[] primos = new int[numeros.length];
        int[] noPrimos = new int[numeros.length];


        //Separar los números primos y no primos
        for (int i = 0; i < numeros.length; i++) {
            if (esPrimo(numeros[i])) {
                primos[indicePrimos] = numeros[i];
                indicePrimos++;
            } else {
                noPrimos[indiceNoPrimos] = numeros[i];
                indiceNoPrimos++;
            }
        }

        //Copiar los números primos al array resultante
        for (int i = 0; i < indicePrimos; i++) {
            numeros[i] = primos[i];
        }

        //Copiar los números no primos al array resultante
        for (int i = 0; i < indiceNoPrimos; i++) {
            numeros[indicePrimos + i] = noPrimos[i];
        }

        //Mostrar el array resultante horizontalmente
        System.out.println("\nArray resultante:");
        System.out.println("-------------------------------------");
        System.out.print("| Índice ");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("|   " + i + "   ");
        }
        System.out.println("|");
        System.out.println("-------------------------------------");
        System.out.print("| Número ");
        for (int i = 0; i < numeros.length; i++) {
            System.out.printf("|  %3d  ", numeros[i]);
        }
        System.out.println("|");
        System.out.println("-------------------------------------");

    }

    //Método para verificar si un número es primo
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
