package Ejercicios.Ejercicios7;

import java.util.Random;
import java.util.Scanner;

public class ControlAccesoCajaFuerteMatachrandom {
    /**
     *Realiza el control de acceso a una caja fuerte. La combinación será un número de 4 cifras. El programa
     * nos pedirá la combinación para abrirla. Si no acertamos, se nos mostrará el mensaje “Lo siento, esa no
     * es la combinación” y si acertamos se nos dirá “La caja fuerte se ha abierto satisfactoriamente”.
     * Tendremos cuatro oportunidades para abrir la caja fuerte.
     */
    public static void main(String[] args) {
        //variables tipo entero
        int combinacionCorrecta, intentos=4;// Inicializamos el contador de intentos

        //Generamos una combinación aleatoria de 4 dígitos
        combinacionCorrecta = new Random().nextInt(9000) + 1000;

        //Salida por teclado
        Scanner teclado = new Scanner(System.in);


        // Bucle do-while para solicitar la combinación hasta que se aciertan o se agotan los intentos
        do {
            // Pedimos al usuario que ingrese la combinación
            System.out.print("Introduce la combinación de la caja fuerte (4 cifras): ");
            int intento = teclado.nextInt();

            // Verificamos si la combinación es correcta
            if (intento == combinacionCorrecta) {
                System.out.println("La caja fuerte se ha abierto satisfactoriamente");
                break;
            }

            // Mostramos pistas si el número ingresado está por encima o por debajo de la combinación correcta
            String pista = (intento < combinacionCorrecta) ? "Número demasiado bajo. Intenta con un número más alto." :
                    "Número demasiado alto. Intenta con un número más bajo.";
            System.out.println(pista);

            // Decrementamos el contador de intentos
            System.out.println("Te quedan " + --intentos + " intentos");

        } while (intentos > 0);

        // Mensaje final si se agotaron los intentos
        if (intentos == 0) {
            System.out.println("Se agotaron los intentos. La combinación correcta era: " + combinacionCorrecta);
            System.out.println("La caja fuerte permanece cerrada.");
        }
    }
}
