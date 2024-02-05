package Ejercicios.Ejercicio19;

import java.util.Scanner;

public class PasarKbMegas {
    public static void main(String[] args) {
        /**
         * Realiza un conversor de KB a MB
         */
        //Variable tipo enteros
        int megabytes, kilobytes;
        //Salida por teclado
        Scanner teclado = new Scanner(System.in);
        //Bucle Do While se repite el bucle hasta que pulsemos 0 para salir
        do {
            //Imprime por pantalla
            //Inicio
            System.out.print("Ingrese la cantidad en Kiobytes (KB): o Pulse 0 para salir ");
            //Leer por teclado
            kilobytes = teclado.nextInt();
            //La condición del si (kilobytes==0), es cuando pulsemos 0 para poder salir
            if (kilobytes ==0) {
                //Imprime por pantalla
                System.out.println("A salido correctamente");
                break;
            }
                //Operacion para poder hacer el conversor KB a MB
                megabytes = kilobytes / 1024;
                //Imprime por pantlla el resultao de la operación por pantalla
                System.out.println("KB equivalen a " + megabytes + " MB");
        }while (true);
        //Fin
    }
}