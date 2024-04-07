package Ejercicios.Ejercicios12;

import java.util.Scanner;

public class FibonacciDoWhile {
    /**
     *Escribe un programa que muestre los n primeros términos de la serie de Fibonacci. El primer término de
     * la serie de Fibonacci es 0, el segundo es 1 y el resto se calcula sumando los dos anteriores, por lo que
     * tendríamos que los términos son 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144… El número n se debe introducir
     * por teclado.
     */
    public static void main(String[] args) {
        // Salida por teclado
        Scanner scanner = new Scanner(System.in);
        // Inicializamos la variable de control del bucle
        int n, primero=0,i=0, segundo=1,siguiente;
        // Pedimos al usuario que ingrese el número n
        System.out.print("Ingresa el número de términos (n) para la serie de Fibonacci: ");
        n = scanner.nextInt();

        // Mostramos los primeros n términos de la serie de Fibonacci
        System.out.println("Serie de Fibonacci con " + n + " términos:");
        //se utiliza un bucle Do-while para generar los primeros n términos de la serie de Fibonacci.
        do {
            System.out.print(primero + " ");

            siguiente = primero + segundo;
            primero = segundo;
            segundo = siguiente;
            i++;

        } while (i < n);
    }
}