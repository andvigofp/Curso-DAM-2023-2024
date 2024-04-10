package Ejercicios.Ej3;

import java.util.Scanner;

/**
 * Dada una cadena invertir la misma y mostrar por pantalla. Ejemplo:
 * Entrada: "casa blanca"
 * Salida: "acnalb asac“
 */
public class Ej3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String caractres="";


        System.out.println("Introduzca una palabra");
        caractres=teclado.nextLine().toLowerCase();

        System.out.println(caractres);

        MEj3.invertido(caractres);
        /**for (int i= caractres.length() -1; i>0; i--) {
            System.out.println("Palabra " + i);
        }**/


    }
}
