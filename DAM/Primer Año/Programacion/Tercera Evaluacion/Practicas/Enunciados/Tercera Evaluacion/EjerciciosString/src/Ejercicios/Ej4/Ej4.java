package Ejercicios.Ej4;

import java.util.Scanner;

/**
 * Escribe un programa que recoja una cadena de caracteres por teclado y muestre el número de
 * veces que aparecerá un carácter también recogido por teclado
 */
public class Ej4 {
    public static void main(String[] args) {
        //Salida por teclado
        Scanner teclado = new Scanner(System.in);

        //Solcitar al usuario que ingrese una cadena
        String cadena = MEj4.solicitarCadena(teclado);

        //Solicitar al usuario que ingrese un caracter
        char caracter = MEj4.solicitarCaracter(teclado);

        //Contar el número de veces que aparece el carácter en una cadena
        int contador = MEj4.contarCaracter(cadena, caracter);

        //Mostrar el resultado
        System.out.println("El carácter " + caracter + "' aparece " + contador + " veces en la cadena");

        //Cerramos el scanner al finalizar
        teclado.close();
    }
}
