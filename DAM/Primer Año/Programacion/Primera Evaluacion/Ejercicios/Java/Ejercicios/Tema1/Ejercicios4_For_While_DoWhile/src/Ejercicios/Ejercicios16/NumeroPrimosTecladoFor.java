package Ejercicios.Ejercicios16;

import java.util.Scanner;

public class NumeroPrimosTecladoFor {
    public static void main(String[] args) {
        // Salida por teclado
        Scanner scanner = new Scanner(System.in);
        // Variables
        int numero1;
        boolean esPrimo;

        System.out.print("Ingrese un número para verificar si es primo: ");
        numero1 = scanner.nextInt();

        if (numero1 < 2) {
            System.out.println("El número debe ser mayor o igual a 2 para ser primo.");
        } else {
            esPrimo = true;
            // Condición del si para determinar si ún número no es primo
            if (numero1 == 2) {
                esPrimo = true;
            } else if (numero1 % 2 == 0) {
                esPrimo = false;
            } else {
                for (int i = 3; i <= Math.sqrt(numero1); i += 2) {
                    if (numero1 % i == 0) {
                        esPrimo = false;
                        break;
                    }
                }
            }

            if (esPrimo) {
                System.out.println("El número " + numero1 + " es primo.");
            } else {
                System.out.println("El número " + numero1 + " no es primo.");
            }
        }

    }
}