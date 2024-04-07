package Ejercicios.Ejercicio18;

import java.util.Scanner;

public class PasarMegasKb {
    public static void main(String[] args) {
        /**
         * Realiza un conversor de Mb a Kb
         */
        //variable tipo enteros
        int megabytes, kilobytes;
        //Salida por teclado
        Scanner teclado = new Scanner(System.in);
        //Bucle While se repite hasta que pulse 0 para salir
        while (true) {
            //Imprime por pantalla
            //Inicio
            System.out.print("Ingrese la cantidad en megabytes (MB): o pulse 0 para salir ");
            //Leer por teclado
            megabytes = teclado.nextInt();
            //La condición del si (megabytes==0), es cuando pulsemos 0 para poder salir
            if (megabytes ==0) {
                System.out.println("A salido correctamente");
                break;
            }
            //Operacion para hacer que conversor de MB a Kilobytes
            kilobytes = megabytes * 1024;
            //Imprime el resultado de la operación por pantalla
            System.out.println("MB equivalen a " + kilobytes + " KB");
        }
        //Fin
    }
}
