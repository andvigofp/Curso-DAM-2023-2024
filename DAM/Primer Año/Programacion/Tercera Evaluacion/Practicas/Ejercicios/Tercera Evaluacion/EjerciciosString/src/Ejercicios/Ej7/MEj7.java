package Ejercicios.Ej7;

import java.util.Scanner;

public class MEj7 {
    //Método para solicitar una cadena
    public static String solictarCadena(Scanner teclado, String mensaje) {
        System.out.println(mensaje);
        return teclado.nextLine();
    }

    //Método para comprar dos cadenas
    public static void compararCadenas(String cadena1, String cadena2) {
        if (cadena1.equals(cadena2)) {
            System.out.println("Las cadenas son iguales.");
        }else {
            System.out.println("Las cadenas son diferentes.");
        }
    }
}
