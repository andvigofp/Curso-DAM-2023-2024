package Ejercicios.Ej3;

import java.util.Scanner;

/**
 * Dada una cadena invertir la misma y mostrar por pantalla. Ejemplo:
 * Entrada: "casa blanca"
 * Salida: "acnalb asac“
 */
public class Ej3 {
    public static void main(String[] args) {
        //Salida por teclado
        Scanner teclado = new Scanner(System.in);
        //variable tipo caracter
        String caractres="";

        //Pedir datos al usuario
        System.out.println("Introduzca una palabra");
        caractres=teclado.nextLine().toLowerCase();
        //Imprimos el resultado
        System.out.println(caractres);
        //Invertimos el caracter
        MEj3.invertido(caractres);
        /**for (int i= caractres.length() -1; i>0; i--) {
            System.out.println("Palabra " + i);
        }**/


    }
}
