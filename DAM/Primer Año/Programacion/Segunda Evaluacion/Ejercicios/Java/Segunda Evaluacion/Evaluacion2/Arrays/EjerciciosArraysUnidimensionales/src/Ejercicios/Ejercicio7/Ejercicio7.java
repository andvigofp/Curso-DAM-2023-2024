package Ejercicios.Ejercicio7;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio7 {
    /**
     * Escribe un programa que genere 100 números aleatorios del 0 al 20 y que los muestre por pantalla
     * separados por espacios. El programa pedirá entonces por teclado dos valores y a continuación
     * cambiará todas las ocurrencias del primer valor por el segundo en la lista generada anteriormente.
     * Los números que se han cambiado deben aparecer entrecomillados
     */

    public static void main(String[] args) {
        //Pedir valores por teclado
        Scanner teclado = new Scanner(System.in);

        int[] numeros = MetodosEj7.generarNumerosAleatorios(100, 0, 20);

        //Variables de tipo entero
        int valorAntiguo, valorNuevo;

        System.out.println("Números generados");
        MetodosEj7.mostrarNumeros(numeros);

        //Pedir dos valores por teclado
        System.out.print("Introduce el primer valor: ");
        valorAntiguo = teclado.nextInt();

        System.out.print("Introduce el segundo valor: ");
        valorNuevo = teclado.nextInt();

        //Cambiar las ocurrencias del primer valor por el segundo
        MetodosEj7.cambiarValores(numeros, valorAntiguo, valorNuevo);

        //Mostar la lista con los valores cambiados
        System.out.println("Números con cambios:");
        MetodosEj7.mostrarNumerosConCambios(numeros, valorAntiguo, valorNuevo);

    }
}