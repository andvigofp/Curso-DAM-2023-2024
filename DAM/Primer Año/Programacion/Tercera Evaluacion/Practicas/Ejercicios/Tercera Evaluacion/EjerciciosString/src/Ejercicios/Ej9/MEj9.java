package Ejercicios.Ej9;

import java.util.Scanner;

public class MEj9 {
    //Método para solicitar una cadena al usuario
    public static String solicitarCadena(Scanner teclado, String mensaje) {
        System.out.println(mensaje);
        return teclado.nextLine();
    }

    //Método para contar cuántas veces aparece una cadena en otra
    public static int contarAparciones(String cadenaPrincipal, String cadenaBuscada) {
        int contador=0;
        int aux=0;

        while ((aux= cadenaPrincipal.indexOf(cadenaBuscada,aux)) !=-1) {
            contador++;
            aux +=cadenaBuscada.length();
        }
        return contador;
    }
}
