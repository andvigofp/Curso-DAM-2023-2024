package Ejercicios.Ejercicios11;

import java.util.Scanner;

public class MostrarColumnaCuadroCuboFor {
    /**
     * Escribe un programa que muestre en tres columnas, el cuadrado y el cubo de los 5 primeros números
     * enteros a partir de uno que se introduce por teclado.
     */
    public static void main(String[] args) {
        // Salida por teclado
        Scanner teclado = new Scanner(System.in);
        //Variables tipo Entero
        int numeroInicial,i,numero,cuadrado,cubo;
        // Pedimos al usuario que ingrese un número
        System.out.print("Ingresa un número entero: ");
        numeroInicial = teclado.nextInt();

        // Mostramos encabezados de las columnas
        System.out.println("Número\tCuadrado\tCubo");

        // Bucle for para mostrar los cuadrados y cubos de los 5 primeros números a partir del ingresado
        for (i = 0; i < 5; i++) {
            numero = numeroInicial + i;
            cuadrado = numero * numero;
            cubo = numero * numero * numero;

            // Mostramos los resultados en tres columnas
            System.out.println(numero + "\t" + cuadrado + "\t" + cubo);
        }

    }
}

