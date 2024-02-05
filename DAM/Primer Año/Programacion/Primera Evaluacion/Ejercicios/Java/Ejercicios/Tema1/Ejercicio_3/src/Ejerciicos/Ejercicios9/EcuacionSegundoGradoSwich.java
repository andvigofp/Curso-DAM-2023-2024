package Ejerciicos.Ejercicios9;

import java.util.Scanner;

public class EcuacionSegundoGradoSwich {
    /**
     *Realiza un programa que resuelva una ecuación de segundo grado (del tipo ax2 +
     * bx + c = 0).
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //variables
        double a, b,c, discriminante,x1,x2,x;
        // Solicitar los coeficientes al usuario
        System.out.print("Introduce el coeficiente a: ");
        a = scanner.nextDouble();

        switch ((int) a) {
            case 0:
                System.out.println("Esta no es una ecuación de segundo grado.");
                break;
            case 1:
                // Solicitar otros coeficientes al usuario
                System.out.print("Introduce el coeficiente b: ");
                b = scanner.nextDouble();

                System.out.print("Introduce el coeficiente c: ");
                c = scanner.nextDouble();

                // Calcular el discriminante
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
                break;
            default:
                System.out.println("No se puede manejar este coeficiente a con un switch.");
                break;
        }
    }
}

