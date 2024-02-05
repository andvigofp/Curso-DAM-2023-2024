package Ejerciicos.Ejercicios9;

import java.util.Scanner;

public class EcuacionSegundoGradoIf {
    /**
     *Realiza un programa que resuelva una ecuación de segundo grado (del tipo ax2 +
     * bx + c = 0).
     */
    public static void main(String[] args) {
        //Salida por teclado
        Scanner teclado = new Scanner(System.in);
        //Variable
        double a,b,c,discriminante,x1,x2,x;

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
        //Operaciones
        discriminante = b * b - 4 * a * c;
        // Verificar el valor del discriminante para determinar las soluciones
        if (discriminante > 0) {
            // Dos soluciones reales distintas
            x1 = (-b + Math.sqrt(discriminante)) / (2 * a);
            x2 = (-b - Math.sqrt(discriminante)) / (2 * a);
            System.out.println("Las soluciones son x1 = " + x1 + " y x2 = " + x2);
        } else if (discriminante == 0) {
            // Una solución real (doble)
            x = -b / (2 * a);
            System.out.println("La solución doble es x = " + x);
        } else {
            // No hay soluciones reales
            System.out.println("La ecuación no tiene soluciones reales.");
        }
    }
    }

