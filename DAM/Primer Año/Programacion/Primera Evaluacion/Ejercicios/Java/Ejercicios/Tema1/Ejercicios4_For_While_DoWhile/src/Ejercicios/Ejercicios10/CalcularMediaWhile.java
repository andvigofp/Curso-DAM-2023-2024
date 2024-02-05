package Ejercicios.Ejercicios10;

import java.util.Scanner;

public class CalcularMediaWhile {
    public static void main(String[] args) {
        // Salida por teclado
        Scanner teclado = new Scanner(System.in);

        // Inicializamos variables
        int suma = 0, cantidadNumeros=0,numero=0;

        System.out.println("Introduce números positivos (termina con un número negativo):");

        // Bucle while para la entrada de datos y cálculo de la suma
        while (numero >= 0) {
            System.out.print("Introduce un número: ");
            numero = teclado.nextInt();

            // Verificamos si el número es positivo antes de incluirlo en la suma
            if (numero >= 0) {
                suma += numero;
                cantidadNumeros++;
            }
        }

        // Calculamos y mostramos la media
        if (cantidadNumeros > 0) {
            double media = (double) suma / cantidadNumeros;
            System.out.println("La media de los números positivos introducidos es: " + media);
        } else {
            System.out.println("No se introdujeron números positivos.");
        }

    }
}
