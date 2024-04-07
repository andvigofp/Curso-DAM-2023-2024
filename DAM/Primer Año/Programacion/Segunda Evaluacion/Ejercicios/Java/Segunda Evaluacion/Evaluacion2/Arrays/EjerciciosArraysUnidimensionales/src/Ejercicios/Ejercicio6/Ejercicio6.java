package Ejercicios.Ejercicio6;


import java.util.Scanner;

public class Ejercicio6 {

    /**
     * Escribe un programa que lea 15 números por teclado y que los almacene en un array. Rota los
     * elementos de ese array, es decir, el elemento de la posición 0 debe pasar a la posición 1, el de la 1 a la
     * 2, etc. El número que se encuentra en la última posición debe pasar a la posición 0. Finalmente,
     * muestra el contenido del array.
     */

    public static void main(String[] args) {
        //Leer la entrada de un usuario
        Scanner teclado = new Scanner(System.in);
        //Arrays
        Object[] resultado = MetodosEj6.pedirNumeros(teclado, MetodosEj6.num_Max());

        int[] numeros = (int[]) resultado[0];
        int contadorPosicionesRestantes = (int) resultado[1];

        //Mostrar el contador de posiciones restantes
        System.out.println("Quedan " + (contadorPosicionesRestantes -1) + " posiciones por llenar.");


        System.out.println("Array Inicial:");
        MetodosEj6.mostrarArray(numeros);

        MetodosEj6.rotarArrayDerecha(numeros);

        System.out.println("\nArray rotado:");
        MetodosEj6.mostrarArray(numeros);

    }
}
