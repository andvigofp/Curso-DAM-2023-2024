package Ejercicios.Ejercicios7;

import java.util.Scanner;

public class ControlAccesoCajaFuerteFor {
    /**
     *Realiza el control de acceso a una caja fuerte. La combinación será un número de 4 cifras. El programa
     * nos pedirá la combinación para abrirla. Si no acertamos, se nos mostrará el mensaje “Lo siento, esa no
     * es la combinación” y si acertamos se nos dirá “La caja fuerte se ha abierto satisfactoriamente”.
     * Tendremos cuatro oportunidades para abrir la caja fuerte.
     */
    public static void main(String[] args) {
        // Establecemos la combinación de la caja fuerte
        int combinacionCorrecta = 123, intentos;

        //Salida por teclado
        Scanner teclado = new Scanner(System.in);

        // Bucle for para solicitar la combinación hasta que se aciertan o se agotan los intentos
        for (intentos = 4; intentos > 0; intentos--) {
            // Pedimos al usuario que ingrese la combinación
            System.out.print("Introduce la combinación de la caja fuerte (4 cifras): ");
            int intento = teclado.nextInt();

            // Verificamos si la combinación es correcta
            if (intento == combinacionCorrecta) {
                System.out.println("La caja fuerte se ha abierto satisfactoriamente");
                // Salimos del bucle si la combinación es correcta
                break;
            } else {
                // Mostramos pistas si el número ingresado está por encima o por debajo de la combinación correcta
                if (intento < combinacionCorrecta) {
                    System.out.println("Número demasiado bajo. Intenta con un número más alto.");
                } else {
                    System.out.println("Número demasiado alto. Intenta con un número más bajo.");
                }

                // Mostramos la cantidad de intentos restantes
                System.out.println("Te quedan " + (intentos - 1) + " intentos");
            }
        }

    }
}
