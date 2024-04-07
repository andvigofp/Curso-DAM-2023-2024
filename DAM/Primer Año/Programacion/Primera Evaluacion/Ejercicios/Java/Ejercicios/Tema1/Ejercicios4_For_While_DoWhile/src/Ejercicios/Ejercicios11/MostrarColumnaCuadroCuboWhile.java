package Ejercicios.Ejercicios11;

import java.util.Scanner;

public class MostrarColumnaCuadroCuboWhile {
    /**
     * Escribe un programa que muestre en tres columnas, el cuadrado y el cubo de los 5 primeros números
     * enteros a partir de uno que se introduce por teclado.
     */
    public static void main(String[] args) {
        // Salida por teclado
        Scanner scanner = new Scanner(System.in);
        //Inicializamos la variable de control del bucle
        int numeroInicial, i=0,numero, cuadrado,cubo;
        // Pedimos al usuario que ingrese un número
        System.out.print("Ingresa un número entero: ");
        numeroInicial = scanner.nextInt();

        // Mostramos encabezados de las columnas
        System.out.println("Número\tCuadrado\tCubo");

        // Bucle while para mostrar los cuadrados y cubos de los 5 primeros números a partir del ingresado
        while (i < 5) {
            numero = numeroInicial + i;
            cuadrado = numero * numero;
            cubo = numero * numero * numero;

            // Mostramos los resultados en tres columnas
            System.out.println(numero + "\t" + cuadrado + "\t" + cubo);

            // Incrementamos la variable de control del bucle
            i++;
        }

    }
}

