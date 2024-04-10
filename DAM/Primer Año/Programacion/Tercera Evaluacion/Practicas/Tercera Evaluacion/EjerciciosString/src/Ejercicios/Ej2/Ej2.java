package Ejercicios.Ej2;

import java.util.Scanner;

/**
 * Escribe un programa que recoja una cadena de caracteres por teclado y muestre el número de
 * vocales que tiene.
 */
public class Ej2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String caractres="";
        int contVocales=0;

        System.out.println("Introduzca una palabra");
        caractres=teclado.nextLine().toLowerCase();


        for (int i=0; i<caractres.length(); i++) {
            if(caractres.charAt(i)=='a' || caractres.charAt(i)=='e' || caractres.charAt(i)=='i' || caractres.charAt(i)=='o' || caractres.charAt(i)=='u') {
                contVocales++;
            }

        }
        System.out.println("La palabra contiene "+contVocales+" vocales");
    }
}
