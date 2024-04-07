package Ejercicios.Ejercicio17;

import java.util.Scanner;

public class UltimaCifraNumeroEnteroSwich {
    /**
     * Escribe un programa que diga cuál es la última cifra de un número entero introducido por teclado.
     */

    public static void main(String[] args) {
        //Salida por teclado
        Scanner teclado = new Scanner(System.in);
        //Variables
        int numero, numeroAbsolucto, ultimaCifra;

        System.out.println("Ingresa un número entero: ");
        numero = teclado.nextInt();

        /// Obtener el valor absoluto del número para manejar correctamente los negativos
        numeroAbsolucto = Math.abs(numero);

        //Calcular la última cifra utilizando el operador de módulo (%)
        ultimaCifra = numeroAbsolucto %10;

        //Utilizar switch para el caso especial donde el número es 0
        switch (numeroAbsolucto) {
            case 0:
                ultimaCifra =0;
                break;
        }

        //Mostrar el resultado de la última cifra
        System.out.println("La última cifra del número " + numero + " es: " + ultimaCifra);
    }
}


