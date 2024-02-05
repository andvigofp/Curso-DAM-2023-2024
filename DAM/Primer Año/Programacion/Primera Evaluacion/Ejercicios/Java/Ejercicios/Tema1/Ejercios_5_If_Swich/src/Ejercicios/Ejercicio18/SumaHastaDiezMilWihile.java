package Ejercicios.Ejercicio18;

import java.util.Scanner;

public class SumaHastaDiezMilWihile {
    /**
     * Escribe un programa que permita ir introduciendo una serie indeterminada de números mientras su
     * suma no supere el valor 10000. Cuando esto último ocurra, se debe mostrar el total acumulado, el
     * contador de los números introducidos y la media
     */

    public static void main(String[] args) {
        //Salida por teclado
        Scanner teclado = new Scanner(System.in);
        //Variables
        int suma=0, contador=0, numero;
        double media;

        System.out.println("Introduce números para sumar.La suma no debe superar 10000.");

        //Bucle para ingresar números hasta que la suma supere 1000
        while (suma <=1000) {
            System.out.println("Introduce un número: ");
            numero = teclado.nextInt();
            // Verificar si la suma superará 10000 con el nuevo número
            if (suma + numero > 1000) {
                break;
            }
            //Actualizar la suma y el contador
            suma += numero;
            contador++;

            media = (double) suma / contador;

            //Mostrar los resultados
            System.out.println("Total acumulado: " + suma);
            System.out.println("Número de elemntos introducidos: " + contador);
            System.out.println("Meia: " + media);
        }
    }
}
