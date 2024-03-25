package Ejercicios.Ejercicio2;

import java.util.Scanner;

public class MetodoEj2MetodoBurbuja {
    //Método para longitud del array
    public static int longitud() {
        return 8;
    }

    //Método para pedir el raking por teclado
    public static void ingresarRaking(Scanner teclado, int[] numero) {
        for (int i=0; i<longitud(); i++) {
            System.out.println("Dime rating: " + i + ": ");
            numero[i] = teclado.nextInt();
        }
    }
    //Método para ordenar el raking mediante Método Burbja
    public static void ordenarRakingBurbuja(int[] numero) {
        for (int i=0; i<longitud()-1; i++) {
            for (int j=0; j<longitud()-1-i; j++) {
                if (numero[j]< numero[j +1]) {
                    //intercambiamos los elementos si están en el orden incorrecto
                    int auxiliar = numero[j];
                    numero[j] = numero[j +1];
                    numero[j +1] = auxiliar;
                }
            }
        }
    }

    //Método para mostrar el raking
    public static void mostrarRaking(int[] numero) {
        System.out.println("Rating de los jugadores en orden descedente");
        for (int n : numero) {
            System.out.println(n);
        }
    }
}
