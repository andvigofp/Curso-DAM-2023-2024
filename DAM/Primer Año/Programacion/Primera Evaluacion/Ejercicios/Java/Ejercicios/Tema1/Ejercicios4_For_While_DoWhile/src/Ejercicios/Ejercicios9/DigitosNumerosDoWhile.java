package Ejercicios.Ejercicios9;

import java.util.Scanner;

public class DigitosNumerosDoWhile {
    /**
     *Realiza un programa que nos diga cuántos dígitos tiene un número introducido por teclado. Este ejercicio
     * es equivalente a otro realizado anteriormente, con la salvedad de que el anterior estaba limitado a
     * números de 5 dígitos como máximo. En esta ocasión, hay que realizar el ejercicio utilizando bucles; de
     * esta manera, la única limitación en el número de dígitos la establece el tipo de dato que se utilice (int o
     * long)
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        boolean esLong, esNegativo;
        long numero;
        int contadorDigitos = 0;

        System.out.print("Ingresa un número: ");

        esLong = teclado.hasNextLong();

        if (!esLong) {
            teclado.next();
            System.out.println("El número ingresado es demasiado grande para un int. Introduce un número más pequeño.");
            return;
        }

        do {
            if (contadorDigitos == Integer.MAX_VALUE) {
                System.out.println("El número ingresado es demasiado grande para un int. Introduce un número más pequeño.");
                return;
            }

            if (contadorDigitos == Long.MAX_VALUE) {
                System.out.println("El número ingresado es demasiado grande para un long. Introduce un número más pequeño.");
                return;
            }

            contadorDigitos++;

        } while (teclado.hasNextLong());

        numero = teclado.nextLong();

        esNegativo = false;
        if (numero < 0) {
            esNegativo = true;
            numero = -numero;
        }

        while (numero > 0) {
            contadorDigitos++;
            numero /= 10;
        }

        if (esNegativo) {
            contadorDigitos--;
        }

        System.out.println("El número ingresado tiene " + contadorDigitos + " dígitos.");
    }
}