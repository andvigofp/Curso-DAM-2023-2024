package org.andres.example.Ejercicio2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MEJ2 {
    //Método para leer números de una lista
    public static List<Integer> leerNumeros() {
        List<Integer> numeros = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        // Leer números positivos hasta que se introduzca un número negativo
        System.out.println("Introduce números enteros positivos. Introduce un número negativo para terminar:");
        while (true) {
            int numero = scanner.nextInt();
            if (numero < 0) {
                break;
            }
            numeros.add(numero);
        }

        return numeros;
    }

    //Método para mostar una lista
    public static void mostrarLista(List<Integer> numeros) {
        System.out.println(numeros);
    }

    //Método para mostrar los números pares y multiplicar pr 100
    public static void procesarPares(List<Integer> numeros) {
        System.out.println("Índices de valores pares:");
        for (int i = 0; i < numeros.size(); i++) {
            if (numeros.get(i) % 2 == 0) {
                System.out.println(i);
                // Multiplicar el número par por 100
                numeros.set(i, numeros.get(i) * 100);
            }
        }
    }
}

