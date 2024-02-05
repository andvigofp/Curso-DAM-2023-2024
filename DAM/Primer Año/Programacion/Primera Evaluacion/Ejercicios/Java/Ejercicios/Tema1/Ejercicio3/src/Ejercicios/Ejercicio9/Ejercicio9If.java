package Ejercicios.Ejercicio9;

import java.util.Scanner;

public class Ejercicio9If {
    /**
     *Realiza un programa que resuelva una ecuación de segundo grado (del tipo ax2 +
     * bx + c = 0).
     */
    public static void main(String[] args) {
        //Salida por teclado
        Scanner teclado = new Scanner(System.in);
        //Variable tipo entero
        double a,b,c,x1,x2,x,discriminante;
        //Variable tipo string
        String continuar;
        //Bucle do while se repite mientras se cumpla, sale cuando la condición sea falso
        do {
            //Imprima por pantalla
            System.out.print("Introduce el valor de 'a': ");
            //Leer por teclado
            a = teclado.nextDouble();
            //Imprima por pantalla
            System.out.print("Introduce el valor de 'b': ");
            //Lee por teclado
            b = teclado.nextDouble();
            //Imprima por pantalla
            System.out.print("Introduce el valor de 'c': ");
            //Leer por pantalla
            c = teclado.nextDouble();
            //Para coger los métodos de una funcón, hacer las operaciones
            discriminante = calcularDiscriminante(a, b, c);
            //Condición del si se cumple una de las condiciones, si no va a la siguiente condición
            //Operaciones
            if (discriminante > 0) {
                x1 = (-b + Math.sqrt(discriminante)) / (2 * a);
                x2 = (-b - Math.sqrt(discriminante)) / (2 * a);
                System.out.println("Las soluciones son: x1 = " + x1 + " y x2 = " + x2);
            } else if (discriminante == 0) {
                x = -b / (2 * a);
                System.out.println("La solución única es: x = " + x);
            } else {
                System.out.println("La ecuación no tiene soluciones reales.");
            }
            //Imprima por pantalla
            System.out.print("Pulsa 0 para salir o pulse otra tecla para continuar: ");
            //Leer por teclado
            continuar = teclado.next();
            //Utilzamos .equals para compación, para cuando pulsemos 0 salga por teclado
        } while (!continuar.equals("0"));
        //Imprima por pantalla
        System.out.println("A salido correctamente.");
        //Fin
    }
     //Función para calcular una ecuación de segundo grado
    private static double calcularDiscriminante(double a, double b, double c) {
        return b * b - 4 * a * c;
    }
}

