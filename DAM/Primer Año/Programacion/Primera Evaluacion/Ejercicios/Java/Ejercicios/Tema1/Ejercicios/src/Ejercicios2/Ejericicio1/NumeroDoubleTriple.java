package Ejercicios2.Ejericicio1;

import java.util.Scanner;

public class NumeroDoubleTriple {
    public static void DoubleTriple() {
        /**
         * Escribir el pesucódigo que pida por teclado un número entero mostrando un mensaje
         * oportuno. A continuación escribir en pantalla el número leído, el doble del leído e el
         * triple del mismo
         */
        //Variable tipo entero
        int doble, triple, numero1;
        //Salida por teclado
        Scanner teclado = new Scanner(System.in);
        //Inicio
        //Utilizamos el bucle Do While, para que repita el ciclo hasta que pulsemos 0 para salir
        do {
            System.out.println("Introduce un número (Pulsa 0 para salir): ");
            numero1 = teclado.nextInt();
            if (numero1 !=0) {
                    //Operaciones para calcular el doble y triple de un número
                    doble = numero1 * 2;
                    triple = numero1 * 3;
                System.out.println("El doble de " + numero1 + " es: " + doble);
                System.out.println("El triple de " + numero1 + " es: " + triple);
            }
        }while (numero1 !=0);
        System.out.println("A salido correctamente");
        teclado.close();
    }

    public static void main(String[] args) {
        //Para iniar la funcion del subprocesio
        DoubleTriple();
    }


}
