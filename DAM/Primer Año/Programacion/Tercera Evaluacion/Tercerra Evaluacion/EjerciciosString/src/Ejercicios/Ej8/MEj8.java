package Ejercicios.Ej8;

import java.util.Scanner;

public class MEj8 {
    //Método para pedir al usuario el número de veces que quiere comprar los nombres
    public static int solicitarNumeroCompraciones(Scanner teclado) {
        System.out.println("Introduce el número de veces que quires comprarar los nombres: ");
        return teclado.nextInt();
    }

    //Método para solicitar un nombre al usuario
    public static String solicitarNombre(Scanner teclado, String mensaje) {
        System.out.println(mensaje);
        return teclado.nextLine();
    }

    //Método para mostrar los nombres en orden alfabético
    public static void mostrarOrdenAlfabetico(String nombre1, String nombre2) {
        //Comparar los nombres utilizando el método compareTo() y mostrar en orden alfabético
        int compracion = nombre1.compareTo(nombre2);

        if (compracion < 0) {
            System.out.println(nombre1 + " / " + " están antes que " + nombre2);
        } else if (compracion > 0) {
            System.out.println(nombre2 + " / " + " están antes que "+ nombre1);
        }else {
            System.out.println("Los nombres son iguales " + nombre1);
        }
    }
}
