package Ejercicios.Ej10;

import java.util.Scanner;

/**
 * Crea un programa en Java que solicite al usuario dos cadenas de caracteres y que devuelva la
 * primera cadena, pero transformando en mayúsculas la parte que coincide con la segunda
 * cadena introducida. Por ejemplo, si se introducen las cadenas “Este es mi amigo Juan” y
 * “amigo”, devolverá “Este es mi AMIGO Juan
 */
public class Ej10 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        //Peir al usuario las dos veces
        String cadenaOrinal = MEj10.solictarCadena(teclado,"Introduce la primera cadena: ");
        String cadenaBuscada = MEj10.solictarCadena(teclado,"Introducir la segunda cadena: ");

        String resutado = MEj10.transformarCadena(cadenaOrinal,cadenaBuscada);

        //Mostrar el resultado
        System.out.println("La cadena transformada es: " + resutado);

        teclado.close();
    }
}
