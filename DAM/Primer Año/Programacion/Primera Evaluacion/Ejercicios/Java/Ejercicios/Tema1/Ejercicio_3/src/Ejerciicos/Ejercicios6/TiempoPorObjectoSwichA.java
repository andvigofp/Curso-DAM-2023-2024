package Ejerciicos.Ejercicios6;

import java.util.Scanner;

public class TiempoPorObjectoSwichA {
    /**
     *Realiza un programa que calcule el tiempo que tardará en caer un objeto desde una
     * altura h. Aplica la fórmula t = √2h g siendo g = 9.81m/s 2
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // Constante de gravedad
        final double g = 9.81;

        // Variables
        double altura, tiempo;

        // Solicitar la altura al usuario
        System.out.print("Introduce la altura desde la que cae el objeto (en metros): ");
        altura = teclado.nextDouble();

        // Verificar que la altura sea no negativa
        if (altura >= 0) {
            // Calcular el tiempo de caída
            tiempo = Math.sqrt((2 * altura) / g);

            // Redondear el tiempo para utilizar en el switch
            int tiempoRedondeado = (int) Math.round(tiempo);

            // Utilizar un switch para mostrar mensajes según el tiempo redondeado
            switch (tiempoRedondeado) {
                case 0:
                    System.out.println("El objeto cae instantáneamente.");
                    break;
                case 1:
                    System.out.println("El tiempo de caída es de aproximadamente 1 segundo.");
                    break;
                case 2:
                    System.out.println("El tiempo de caída es de aproximadamente 2 segundos.");
                    break;
                // Agregar más casos según sea necesario
                default:
                    System.out.println("El tiempo de caída es de aproximadamente " + tiempoRedondeado + " segundos.");
                    break;
            }
        } else {
            // Mensaje en caso de altura negativa
            System.out.println("Datos no válidos. Por favor, introduce una altura no negativa.");
        }


    }
}