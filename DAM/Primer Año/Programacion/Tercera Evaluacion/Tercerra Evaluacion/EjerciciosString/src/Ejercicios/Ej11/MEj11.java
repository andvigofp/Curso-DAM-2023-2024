package Ejercicios.Ej11;

import java.util.Scanner;

public class MEj11 {
    //Método para solicitar la cadena de caratres
    public static String solicitarCadena(Scanner teclado, String mensaje) {
        System.out.print(mensaje);
        return teclado.nextLine();
    }

    //Método para obtener la cadena espejo de una cadena dada
    public static String obtnercadenaEspejo(String cadena) {
        //Invertir la cadena original
        String cadenaInvertida = new StringBuilder(cadena).reverse().toString();

        //Concatenar la cadena original en la cadena invertida, omitiendo la última letra de la cadena invertida
        return cadena + cadenaInvertida.substring(1);
    }
}
