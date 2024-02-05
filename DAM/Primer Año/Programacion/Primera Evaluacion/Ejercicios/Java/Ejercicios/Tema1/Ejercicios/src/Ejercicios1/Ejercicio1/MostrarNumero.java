package Ejercicios1.Ejercicio1;

import java.util.Scanner;

public class MostrarNumero {
    /**
     * Pedir un número y mostrarlo por pantalla.
     */
    public static void main(String[] args) {
        //variables tipo entero
        int numero1;
        //Salida por teclado
        Scanner teclado = new Scanner(System.in);
        //Inicio
        System.out.println("Introduce un número");
        numero1 = teclado.nextInt();
        System.out.println("El número a mostrar es: " + numero1);
        //Fin
    }
}
