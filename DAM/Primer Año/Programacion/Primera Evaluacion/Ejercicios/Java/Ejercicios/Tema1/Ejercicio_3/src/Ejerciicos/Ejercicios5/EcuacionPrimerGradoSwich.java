package Ejerciicos.Ejercicios5;

import java.util.Scanner;

public class EcuacionPrimerGradoSwich {
    /**
     * Realiza un programa que resuelva una ecuación de primer grado (del tipo ax+b =0).
     * Ejemplo 1:
     * Este programa resuelve ecuaciones de primer grado del tipo ax + b = 0
     * Por favor, introduzca el valor de a: 2
     * Ahora introduzca el valor de b: 1
     * x = -0.5
     * Ejemplo 2:
     * Este programa resuelve ecuaciones de primer grado del tipo ax + b = 0
     * Por favor, introduzca el valor de a: 0
     * Ahora introduzca el valor de b: 7
     * Esa ecuación no tiene solución real
     */

    public static void main(String[] args) {
        //Salida por teclado
        Scanner teclado = new Scanner(System.in);
        //variable tipo entero
        int opcion;
        //Variable tipo double
        double a,b,x;

        //Incio
        //Imprime por pantalla
        //Menú de opciones
        System.out.print("Por favor, elige una opción:\n");
        System.out.println("1. Resolver ecuación");
        System.out.print("Opción: ");
        opcion = teclado.nextInt();

        switch (opcion) {
            case 1:
                System.out.print("Por favor, introduce el valor de 'a': ");
                a = teclado.nextDouble();

                System.out.print("Por favor, introduce el valor de 'b': ");
                b = teclado.nextDouble();
                //Utilizamos .equals para hacer una cmparaión, para cuando pulsemos 0 salga del bucle
                if (a == 0) {
                    if (b == 0) {
                        System.out.println("La ecuación tiene infinitas soluciones.");
                    } else {
                        System.out.println("Esa ecuación no tiene solución real.");
                    }
                } else {
                    //Operaciones
                    x = (-b) / a;
                    //Imprime el resultado
                    System.out.println("La solución de la ecuación " + a + "x + " + b + " = 0 es x = " + x);
                }
                break;
            default:
                System.out.println("Opción no válida.");
                break;
        }
    }
}
