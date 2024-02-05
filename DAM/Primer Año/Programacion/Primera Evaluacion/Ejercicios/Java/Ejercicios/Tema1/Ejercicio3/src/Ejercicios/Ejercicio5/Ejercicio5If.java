package Ejercicios.Ejercicio5;

import java.util.Scanner;

public class Ejercicio5If {
    /**
     *Realiza un programa que resuelva una ecuación de primer grado (del tipo ax+b =0).
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
        //Variable tipo String(Caracter)
        String continuar;
        //Variable tipo double
        double a,b,x;
        //Bucle do while se repite mientras se cumpla, sale cuando la condición sea falso
        do {
            //Inicio
            //Imprime por pantalla
            System.out.print("Por favor, introduce el valor de 'a': ");
            //Leer por teclado
            a = teclado.nextDouble();
            //Imprime por pantalla
            System.out.print("Por favor, introduce el valor de 'b': ");
            //Leer por teclado
            b = teclado.nextDouble();
            //Condición del si se cumple una de las condiciones, si no va a la siguiente condición
            //Operaciones
            if (a == 0) {
                if (b == 0) {
                    System.out.println("La ecuación tiene infinitas soluciones.");
                } else {
                    System.out.println("Esa ecuación no tiene solución real.");
                }
            } else {
                x = -b / a;
                System.out.println("La solución de la ecuación " + a + "x + " + b + " = 0 es x = " + x);
            }
            //Imprime por pantalla
            System.out.print("Pulsa 0 para salir o pulse otra tecla para continuar: ");
            //Leer por teclado
            continuar = teclado.next();
            //Utilzamos .equals para compación, para cuando pulsemos 0 salga por teclado
        } while (!continuar.equals("0"));
        //Imprime por pantalla
        System.out.println("A salido corretcamente");
        //Fin
    }
}