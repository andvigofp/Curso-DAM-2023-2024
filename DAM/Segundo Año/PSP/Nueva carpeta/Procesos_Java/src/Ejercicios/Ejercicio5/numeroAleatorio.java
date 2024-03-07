package Ejercicios.Ejercicio5;


import java.util.Random;
import java.util.Scanner;


public class numeroAleatorio {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);


        int numAleatorio;
        int numintentos;
        int contador = 5;

        //Obtener número aleatorio
        numAleatorio = (int) (Math.random() * 100 + 1);
        System.out.println("Intenta adivinar un número aleatorio entre 1 y 100: " + " Tienes 5 intentos");

        // Realización del do-while


        do {
            System.out.println("Numero contandor " + contador);
            System.out.println("Introcuce el que creas posible : ");
            numintentos = sc.nextInt();

            if (numintentos > numAleatorio) {
                System.out.println("El número que buscas es menor, te quedan " + (contador - 1) + " intentos");


            } else if (numintentos < numAleatorio) {
                System.out.println("El número que buscas es mayor, te quedan " + (contador - 1) + " intentos");
            } else {
                System.out.print("!CORRECTO " + numAleatorio + " era el número que estabas " + " buscando, has necesitado " + (10 - (contador - 1)) + " intentos");
            }

            contador--;

        } while (numintentos != numAleatorio && contador > 0);
        if (contador == 0) {
            System.out.println("Has perdido. El número aleatorio era " + numAleatorio);
        }

    }
}

