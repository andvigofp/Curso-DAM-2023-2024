package Ejercicios.Ej7;

import Ejercicios.Ej6.MEj6;

import java.util.Scanner;

/**
 * Programa que pida al usuario el número de veces que quiere comparar dos cadenas que el
 * usuario debe introducir cada una de las veces. Una vez introducidas, debe imprimir por
 * pantalla si son iguales o no. Hay que utilizar el método equals().
 */
public class Ej7 {


    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        //Pedir al usuario el número de veces que quiere comparar las cadenas
        System.out.println("Introduzca el  número de veces que quieres comprar las cadenas :");
        int veces = teclado.nextInt();
        teclado.nextLine(); //Consumir el salto de linea pendiente

        for (int i=1; i<=veces; i++) {
            //Pedir al usuario las dos cadenas
            System.out.println("\nComparación número " + i);
            String cadena1=MEj7.solictarCadena(teclado,"Introduce la primera cadena");
            String cadena2=MEj7.solictarCadena(teclado,"Introduce la primera cadena");

            //Comprar cadenas
            MEj7.compararCadenas(cadena1,cadena2);
        }
        teclado.close();
    }

}
