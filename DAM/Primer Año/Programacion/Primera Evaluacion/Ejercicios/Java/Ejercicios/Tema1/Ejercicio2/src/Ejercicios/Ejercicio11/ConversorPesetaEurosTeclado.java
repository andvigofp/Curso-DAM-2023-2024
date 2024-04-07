package Ejercicios.Ejercicio11;

import java.util.Scanner;

public class ConversorPesetaEurosTeclado {
    public static void main(String[] args) {
        /**
         * Realiza el ejercicio anterior pero pidiendo la cantidad en pesetas por teclado.
         */
        var valorEuroPesetas = 166.386;
        //Variable tipo entero
        int cantidadPesetas;
        //Variable tipo double (decimales)
        double  cantidadEuros;
        //Salida por teclado
        Scanner teclado = new Scanner(System.in);
        //Bucle Do while se repite el bucle hasta que pulse 0 para salir
        do {
            //Inicio
            System.out.println("Dime la cantidad de peseta que desea convertir a Euros o ingrese 0 para salir");
            cantidadPesetas = teclado.nextInt();
            if (cantidadPesetas==0) {
                System.out.println("A salido correctamente");
                break;
            }
            // Realizar la conversión
            cantidadEuros = cantidadPesetas / valorEuroPesetas;
            //Lo casteamos para quitar los decimales
            int euros = (int) cantidadEuros;
            // Mostrar el resultado
            System.out.println(cantidadPesetas + " pesetas equivalen a " + euros + " euros.");
            //Fin
        }while (true);
    }
}
