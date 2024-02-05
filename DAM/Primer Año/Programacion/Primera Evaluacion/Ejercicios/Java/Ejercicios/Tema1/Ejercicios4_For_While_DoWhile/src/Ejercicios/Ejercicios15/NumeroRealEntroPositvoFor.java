package Ejercicios.Ejercicios15;

import java.util.Scanner;

public class NumeroRealEntroPositvoFor {
    /**
     * Escribe un programa que dados dos números, uno real (base) y un entero positivo (exponente), saque
     * por pantalla todas las potencias con base el numero dado y exponentes entre uno y el exponente
     * introducido. No se deben utilizar funciones de exponenciación. Por ejemplo, si introducimos el 2 y el 5,
     * se deberán mostrar 21 , 22 , 23 , 24 y 25 .
     */
    public static void main(String[] args) {
        // Salida por teclado
        Scanner teclado = new Scanner(System.in);
        // Variables
        double base;
        int exponente,i, resultado;
        System.out.print("Ingresa la base (número real): ");
        base = teclado.nextDouble();

        // Pedimos al usuario que ingrese el exponente (entero positivo)
        System.out.print("Ingresa el exponente (entero positivo): ");
        exponente = teclado.nextInt();

        // Validamos que el exponente sea un número positivo
        if (exponente < 0) {
            System.out.println("El exponente debe ser un número entero positivo.");
            return;
        }

        // Mostramos todas las potencias con la base y exponentes dados
        System.out.print("Potencias de " + base + " con exponentes del 1 al " + exponente + ": ");

        for (i = 1; i <= exponente; i++) {
            // Calculamos los resultados consecutivos a partir de 21
            resultado = 20 + i;

            // Mostramos el resultado
            System.out.print(resultado);

            // Mostramos la coma solo si no es el último término
            if (i < exponente) {
                System.out.print(", ");
            }
        }
    }
}