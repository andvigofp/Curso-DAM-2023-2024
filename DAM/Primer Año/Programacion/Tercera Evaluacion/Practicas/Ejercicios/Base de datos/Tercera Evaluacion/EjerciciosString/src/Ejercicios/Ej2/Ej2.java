package Ejercicios.Ej2;

import java.util.Scanner;

/**
 * Escribe un programa que recoja una cadena de caracteres por teclado y muestre el número de
 * vocales que tiene.
 */
public class Ej2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        //Variables tipo caracter y entero
        String caractres="";
        int contVocales=0;
        //Pedir datos al usuario
        System.out.println("Introduzca una palabra");
        caractres=teclado.nextLine().toLowerCase();

        //Recorremos el bucle for
        for (int i=0; i<caractres.length(); i++) {
            //Hacemos una condicón para todos los vocales
            if(caractres.charAt(i)=='a' || caractres.charAt(i)=='e' || caractres.charAt(i)=='i' || caractres.charAt(i)=='o' || caractres.charAt(i)=='u') {
                contVocales++;
            }

        }
        //Mostramos el resultado
        System.out.println("La palabra contiene "+contVocales+" vocales");
    }
}
