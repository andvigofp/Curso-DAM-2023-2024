package Ejercicios.Ej8;

import com.sun.tools.javac.Main;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Programa que pida al usuario el número de veces que quiere comparar dos
 * nombres que debe introducir también el usuario. Una vez introducidos, se deben visualizar por
 * pantalla en orden alfabético distinguiendo entre mayúsculas y minúsculas.
 * Pista: utilizar el método compareTo()
 */
public class Ej8 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        try {
        //Pedir al suario el número de veces que queire comparar los nombres
        int veces = MEj8.solicitarNumeroCompraciones(teclado);

        for (int i=1; i<=veces; i++) {
            //Pedir al usuario los dos nombres
            System.out.println("\nCompración número " + i);

            String nombre1 = MEj8.solicitarNombre(teclado, "Introduce el primer nombre: ");
            String nombre2 = MEj8.solicitarNombre(teclado, "Introduzca el segundo nombre: ");

            //Mostrar los nombres en orden alfabético distinguiendo entre mayúsculas y minúsculas
            MEj8.mostrarOrdenAlfabetico(nombre1, nombre2);
        }

        }catch (InputMismatchException e) {
            System.out.println("No se puede poner letras " + e.getMessage());
        }finally {
            System.out.println("Se ejucuta la expción es opcional");
        }
        System.out.println("Continua el programa: ");


    }



}
