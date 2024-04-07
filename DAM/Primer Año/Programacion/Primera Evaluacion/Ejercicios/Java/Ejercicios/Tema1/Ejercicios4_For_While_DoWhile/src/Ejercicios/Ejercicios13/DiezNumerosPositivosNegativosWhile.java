package Ejercicios.Ejercicios13;

import java.util.Scanner;

public class DiezNumerosPositivosNegativosWhile {
    /**
     * Escribe un programa que lea una lista de diez números y determine cuántos son positivos, y cuántos son
     * negativos.
     */
    public static void main(String[] args) {
        // Salida por tecclado
        Scanner teclado = new Scanner(System.in);

        // Inicializamos contadores
        int positivos = 0, negativos=0, numero, i=1;// Inicializamos el índice del bucle


        // Pedimos al usuario que ingrese diez números usando un bucle while
        while (i <= 10) {
            System.out.print("Ingresa el número " + i + ": ");
            numero = teclado.nextInt();

            // Verificamos si el número es positivo, negativo o cero
            if (numero > 0) {
                positivos++;
            } else if (numero < 0) {
                negativos++;
            }
            // Si el número es cero, no se cuenta en ninguna categoría específica

            // Incrementamos el índice del bucle
            i++;
        }

        // Mostramos el resultado
        System.out.println("Cantidad de números positivos: " + positivos);
        System.out.println("Cantidad de números negativos: " + negativos);

    }
}

