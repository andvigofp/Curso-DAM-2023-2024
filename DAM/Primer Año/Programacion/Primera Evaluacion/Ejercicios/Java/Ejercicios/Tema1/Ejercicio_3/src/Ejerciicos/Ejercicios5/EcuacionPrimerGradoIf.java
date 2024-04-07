package Ejerciicos.Ejercicios5;

import java.util.Scanner;

public class EcuacionPrimerGradoIf {
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
        //Variables tipo double
        double a, b, x;
        //Imprime por pantalla
        //Inicio
        System.out.println("System.out.print(\"Por favor, introduce el valor de 'a': \");");
        //Leer por teclado
        a = teclado.nextDouble();
        //Imprime por pantalla
        System.out.println("System.out.print(\"Por favor, introduce el valor de 'b': \");");
        //Leer por teclado
        b = teclado.nextDouble();
        //Condición del Sí
        if (a == 0) {
            if (b==0) {
                System.out.println("La ecuación tiene infinitas soluciones.");
            }else {
                System.out.println("Esa ecuación no tiene solución real.");
            }
        }else {
            //Operaciones
            x = (-b)/a;
            System.out.println("La solución de la ecuación " + a + "x + " + b + " = 0 es x = " + x);
        }
        //Fin
    }
}
