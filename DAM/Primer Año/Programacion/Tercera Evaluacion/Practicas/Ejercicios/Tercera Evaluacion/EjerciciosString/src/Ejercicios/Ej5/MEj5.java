package Ejercicios.Ej5;

import java.util.Scanner;

public class MEj5 {
    //Método para solicitar una cadena de caracteres al usuario
    public static String solicitarCadena(Scanner teclado) {
        System.out.println("Ingrese una cadena de carácetres");
        return teclado.nextLine();
    }

    //Método para verificar la posición y mostrar el caracter en la posición especificada
    public static void verificarPosicionMostar(Scanner teclado, String cadena) {
        //Pedir al usuario que introduzca una posción
        int posicion = solicitarPosicion(teclado);

        posicion--;
        //Verificar si la posición está dentro del rango de la cadena
        if (esPosicionValida(posicion, cadena)) {
            //Mostrar el carácter en la posición indicada
            char caracter = obtenerCaracterPosicion(posicion, cadena);
            System.out.println("El carácter en la posición " + (posicion+1) + " es: " + caracter);
        }else {
            //Indicar que la posición está fuera del rango y salir del programa
            System.out.println("La posición introducida está fuera del rango de la cadena.");
            System.exit(0); //Salir del programa
        }
    }

    //Método para solicitar una posción al usuario
    public static int solicitarPosicion(Scanner teclado) {
        System.out.println("Introduce una posición (un número entero): ");
        return teclado.nextInt();
    }

    //Método para verificar si la posición está dentro del rango de la cadena
    public static boolean esPosicionValida(int psocion, String cadena) {
        return psocion >=0 && psocion <cadena.length();
    }

    //Método para obtener el carácter en una posición espeficicada de la cadena
    public static char obtenerCaracterPosicion(int poscion, String cadena) {
        return cadena.charAt(poscion);
    }
}
