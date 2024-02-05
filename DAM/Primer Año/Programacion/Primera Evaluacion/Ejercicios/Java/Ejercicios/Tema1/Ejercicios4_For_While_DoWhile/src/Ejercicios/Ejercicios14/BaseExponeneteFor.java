package Ejercicios.Ejercicios14;

import java.util.Scanner;

public class BaseExponeneteFor {
    /**
     * Escribe un programa que pida una base y un exponente (entero positivo) y que calcule la potencia.
     */
    public static void main(String[] args) {
        // Salida por teclado
        Scanner teclado = new Scanner(System.in);
        //Variables
        double base, resultado;
        int exponente,i;
        // Pedimos al usuario que ingrese la base
        System.out.print("Ingresa la base: ");
        base = teclado.nextDouble();

        // Validamos que la base sea un número positivo
        if (base < 0) {
            System.out.println("La base debe ser un número positivo.");
            return;
        }

        // Pedimos al usuario que ingrese el exponente (entero positivo)
        System.out.print("Ingresa el exponente (entero positivo): ");
        exponente = teclado.nextInt();

        // Validamos que el exponente sea un número positivo
        if (exponente < 0) {
            System.out.println("El exponente debe ser un número entero positivo.");
            return;
        }

        // Calculamos la potencia sin usar métodos
        resultado = 1;

        for (i = 0; i < exponente; i++) {
            resultado *= base;
        }

        // Mostramos el resultado
        System.out.println("El resultado de " + base + " elevado a la " + exponente + " es: " + resultado);

    }
}
