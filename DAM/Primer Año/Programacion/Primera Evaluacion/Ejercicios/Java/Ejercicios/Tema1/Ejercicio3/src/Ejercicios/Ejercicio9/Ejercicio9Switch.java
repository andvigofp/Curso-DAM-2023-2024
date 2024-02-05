package Ejercicios.Ejercicio9;

import java.util.Scanner;

public class Ejercicio9Switch {
    /**
     *Realiza un programa que resuelva una ecuación de segundo grado (del tipo ax2 +
     * bx + c = 0).
     */
    public static void main(String[] args) {
        //Salida por teclado
        Scanner teclado = new Scanner(System.in);
        //Variables tipo double
        double a,b,c, discriminante,x1,x2,x;
        //Variables tipo string
        String continuar;
        //Bucle do while se repite mientras se cumpla, sale cuando la condición sea falso
        do {
            //Incio
            //Imprima por pantalla
            System.out.println("Elige los coeficientes de la ecuación:");
            //Imprima por pantalla
            System.out.print("a: ");
            //Leer por teclado
            a = teclado.nextDouble();
            //Imprima por pantalla
            System.out.print("b: ");
            //Leer por teclado
            b = teclado.nextDouble();
            //Imprima por pantalla
            System.out.print("c: ");
            //Leer por teclado
            c = teclado.nextDouble();
            //Para coger los métodos de una funcón, hacer las operaciones
            discriminante = calcularDiscriminante(a, b, c);
            //Condición del Swich, va caso por caso, si se cumple uno de los casos salé imprime el resultado por pantalla
            switch (obtenerTipoSolucion(discriminante)) {
                case 1:
                    x1 = (-b + Math.sqrt(discriminante)) / (2 * a);
                    x2 = (-b - Math.sqrt(discriminante)) / (2 * a);
                    System.out.println("Las soluciones son: x1 = " + x1 + " y x2 = " + x2);
                    break;
                case 0:
                    x = -b / (2 * a);
                    System.out.println("La solución única es: x = " + x);
                    break;
                case -1:
                    System.out.println("La ecuación no tiene soluciones reales.");
                    break;
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
    //Función para calcular, una de soluciones de la ecuación de segundo grado
    private static int obtenerTipoSolucion(double discriminante) {
        if (discriminante > 0) {
            return 1;
        } else if (discriminante == 0) {
            return 0;
        } else {
            return -1;
        }
    }
}

