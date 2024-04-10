package Ejercicios.Ej6;

import java.util.Scanner;

public class MEj6 {
    //Método para solicitar una cadena de caracteres al usuario
    public static String solicitarCadena(Scanner teclado) {
        System.out.println("Ingrese una cadena de carácetres");
        return teclado.nextLine();
    }

    //Método para remplazar punto por una coma
    public static String remplazarPuntosComas(String cadena) {
        return cadena.replace('.', ',');
    }
}
