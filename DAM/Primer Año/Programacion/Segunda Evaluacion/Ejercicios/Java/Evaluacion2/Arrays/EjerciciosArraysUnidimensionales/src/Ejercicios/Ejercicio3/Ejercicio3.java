package Ejercicios.Ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {
    /**
     * Escribe un programa que lea 10 números por teclado y que luego los muestre en orden inverso, es
     * decir, el primero que se introduce es el último en mostrarse y viceversa.
     */

    public static void main(String[] args) {
        // Leer la entrada del usuario
        Scanner teclado = new Scanner(System.in);

        //Pedir al usuario que ingrese los números y actualizar el contador
        Object[] resultado = MetodosEj3.pedirnumero(teclado, MetodosEj3.num_MAX());
        int[] numeros = (int[]) resultado[0];
        int contadorPosicionesRestantes = (int) resultado[1];

        // Resultado del array inicial
        MetodosEj3.resultadoArrayInicial(numeros);

        //Mostrar el contador de posiciones restantes
        System.out.println("Quedan " + (contadorPosicionesRestantes) + " posiciones por llenar.");

        //Para mostrar el resultado del array
        MetodosEj3.resultadoArray(numeros);


    }
}