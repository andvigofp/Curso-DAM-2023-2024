package Ejercicios.Ejercicio2;

import java.util.Arrays;
import java.util.Scanner;

public class MetodoEj2_ArraySort {

    //Método para la longitud del array
    public static int longitud() {
        return 8;
    }

    //Método para ingresar el raking de un torneo de ajedrez

public static void ingresarRaking(Scanner teclado, int[] numero) {
        for (int i=0; i<longitud(); i++) {
            System.out.println("Dime rating: " + i + ": ");
            numero[i] = teclado.nextInt();
        }
}

//Método para ordenar el raking utilizando el Arrays.sort
public static void ordenarRaking(int[] numero) {
        //Ordenar el array
        Arrays.sort(numero);

        for (int i=0; i<longitud()/2; i++) {
            int auxiliar= numero[i];
            numero[i] = numero[longitud()-1-i];
            numero[longitud()-1-i] = auxiliar;
        }
}
//Método para mostrar el raking
public static void mostrarRaking(int[] numero) {
    System.out.println("Rating de los juegadores en orden descedente:");
    for (int n : numero) {
        System.out.println(n);
    }

}

}
