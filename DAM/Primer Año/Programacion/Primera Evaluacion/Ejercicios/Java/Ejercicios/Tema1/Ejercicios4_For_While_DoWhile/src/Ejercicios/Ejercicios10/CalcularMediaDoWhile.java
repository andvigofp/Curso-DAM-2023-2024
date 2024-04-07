package Ejercicios.Ejercicios10;

import java.util.Scanner;

public class CalcularMediaDoWhile {
    /**
     *Escribe un programa que calcule la media de un conjunto de números positivos introducidos por teclado.
     * A priori, el programa no sabe cuántos números se introducirán. El usuario indicará que ha terminado de
     * introducir los datos cuando meta un número negativo.
     */
    public static void main(String[] args) {
        //Salidad por teclado
        Scanner teclado = new Scanner(System.in);

        // Inicializamos variables
        int suma = 0, cantidadNumeros=0,numero;

        System.out.println("Introduce números positivos (termina con un número negativo):");

        // Bucle para la entrada de datos y cálculo de la suma

        do {
            System.out.print("Introduce un número: ");
            numero = teclado.nextInt();

            //Verificamos si el número es positivo antes de incluirlo en la suma
            if (numero >= 0) {
                suma += numero;
                cantidadNumeros++;
            }

        } while (numero >= 0);

        // Calculamos y mostramos la media
        if (cantidadNumeros > 0) {
            double media = (double) suma / cantidadNumeros;
            System.out.println("La media de los números positivos introducidos es: " + media);
        } else {
            System.out.println("No se introdujeron números positivos.");
        }
    }
}
