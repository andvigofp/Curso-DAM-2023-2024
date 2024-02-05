package Ejerciicos.Ejercicios6;

import java.util.Scanner;

public class TiempoPorObjectoIf {
    /**
     *Realiza un programa que calcule el tiempo que tardará en caer un objeto desde una
     * altura h. Aplica la fórmula t = √2h g siendo g = 9.81m/s 2
     */

    public static void main(String[] args) {
        //Salida por teclado
        Scanner teclado = new Scanner(System.in);
        //Variable tipo double
        double g,altura, tiempo;
        //Operaciones
        g = 9.81; //Aceleración debido a la gravedad en m/s^2


        System.out.println("Introduzca la altura desde la que caerá el objeto (en metros): ");
        altura = teclado.nextDouble();

        // Verificar que la altura sea no negativa
        if (altura >= 0) {
            // Calcular el tiempo de caída
            tiempo = Math.sqrt((2 * altura) / g);

            // Mostrar el resultado
            System.out.println("El tiempo de caída es: " + tiempo + " segundos.");
        } else {
            // Mensaje en caso de altura negativa
            System.out.println("Datos no válidos. Por favor, introduce una altura no negativa.");
        }
    }
}
