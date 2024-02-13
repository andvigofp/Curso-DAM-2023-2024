package Ejercicios.Ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {
    /**
     * Escribe un programa que lea 10 números por teclado y que luego los muestre en orden inverso, es
     * decir, el primero que se introduce es el último en mostrarse y viceversa.
     */

    public static void main(String[] args) {
        //Leer la entrada del usuario
        Scanner teclado = new Scanner(System.in);


        //Para pedir al usaurio
        int numeros[]=MetodosEj3.pedirnumero(teclado);

        //Resulatdo de array
        MetodosEj3.resultadoArrayInicial(numeros);

        //Para mostar el resultado del array
        MetodosEj3.resultadoArray(numeros);

    }


}
