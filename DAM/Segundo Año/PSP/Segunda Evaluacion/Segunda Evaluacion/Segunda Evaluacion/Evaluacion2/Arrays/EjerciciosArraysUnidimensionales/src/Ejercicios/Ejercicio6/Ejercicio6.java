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

        //Creamis un Array para alamecenar los números
        int numeros[] = new int[15];


        for (int i=0; i<numeros.length; i++) {
            //Leemos los 15 números del array
            System.out.println("Introduce " + i + " números:");
            numeros[i] = teclado.nextInt();
        }

        System.out.println("Array Inicial");
        for (int i=0; i<numeros.length; i++) {
            System.out.print(numeros[i]+ " ");
        }

        //Rotamos los elementos del array
        int ultimoNumero = numeros[numeros.length -1]; //Guardamos el último número antes de que se pierda

        for (int i = numeros.length -1; i>0; i--) {
            numeros[i] = numeros[i-1]; //Movemos cada elemento una posición hacia la derecha
        }

        numeros[0] = ultimoNumero; //Ponemos el último número en la primera posición

        System.out.println("\nArray rotado");
        for (int i=0; i<numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }

    }
}
