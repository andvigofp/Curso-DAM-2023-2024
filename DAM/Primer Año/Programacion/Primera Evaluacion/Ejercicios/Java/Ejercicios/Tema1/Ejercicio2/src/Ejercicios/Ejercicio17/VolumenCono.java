package Ejercicios.Ejercicio17;

import java.util.Scanner;

public class VolumenCono {
    public static void main(String[] args) {
        /**
         * Escribe un programa que calcule el volumen de un cono según la fórmula.
         * V =1/3π r2h
         *
         */
        //Variable tipo double
        double volumen, radio, altura;
        //Salida por teclado
        Scanner teclado = new Scanner(System.in);
        //Bucle Do While, se repite hasta que pulsemos 0 para salir
        //Inicio
        do {
            //Imprime por pantlla
            System.out.println("Ingrese el radio del cono o pulse 0 para salir: ");
            //Leer por teclado
            radio = teclado.nextDouble();
            //La condición del si (radio==0), es cuando pulsemos 0 para poder salir
            if (radio == 0) {
                System.out.println("A salido correctamente");
                break;
            }
            //Imprime por pantlla
            System.out.println("Ingese la altura del cono: ");
            //Leer por teclado
            altura = teclado.nextDouble();
                //Operación para calcular el volumen de un cono
                volumen = (1.0 / 3.0) * Math.PI * Math.pow(radio, 2) * altura;
            //Imprime por pantalla el resultado por pantalla
            System.out.println("El volumen del cono es: " + volumen);
        }while (true);
        //Fin
    }
}