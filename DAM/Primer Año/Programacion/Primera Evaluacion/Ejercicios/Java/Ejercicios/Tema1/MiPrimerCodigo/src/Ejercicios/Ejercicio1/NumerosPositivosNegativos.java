package Ejercicios.Ejercicio1;

import java.util.Scanner;

public class NumerosPositivosNegativos {
    /**
     * Construir un algoritmo que leido un número por teclado
     * nos diga si es un número positivo, negativo o nulo
     */
    public static void NumerosPositivos() {
        //Variable
        int numero;
        //Salida de datos
        Scanner teclado = new Scanner(System.in);
        //Inicio
        System.out.println("Introduce un número");
        numero = teclado.nextInt();
        if (numero>0) {
            System.out.println(" es posivo: " + numero);
        }else if (numero<0) {
            System.out.println(" es negativo: " + numero);
        }else {
            System.out.println(" es nulo: " + numero);
        }
        //Fin
    }
}
