package Ejercicios.Ejercicio17;

import java.util.Scanner;

public class UltimaCifraNumeroEnteroIf {
    /**
     * Escribe un programa que diga cuál es la última cifra de un número entero introducido por teclado.
     */

    public static void main(String[] args) {
        //Salida por teclado
        Scanner teclado = new Scanner(System.in);
        //Variables
        int numero, numeroAbsolucto, ultimaCifra=0;

        System.out.println("Ingresa un número entero: ");
        numero = teclado.nextInt();

        /// Obtener el valor absoluto del número para manejar correctamente los negativos
        numeroAbsolucto = Math.abs(numero);

        //verificar si el número es igual a 0
        if (numeroAbsolucto ==0) {
            ultimaCifra=0;
        }else {
            //Calcular la última cifra usando el operador del módulo (%)
            ultimaCifra = numeroAbsolucto %10;
        }
        //Mostrar el resultado de la última cifra
        System.out.println("La última cifra del número " + numero + " es: " + ultimaCifra);
    }
}
