package Ejercicios1.Ejercicio2;

import java.util.Scanner;

public class SumarDosNúmeros {
    public static void main(String[] args) {
        /**
         * Pedir dos números y mostrar la suma de ambos.
         */
        //Variables tipo entero
        int numero1, numero2, resultado;
        //Salida por teclado
        Scanner teclado = new Scanner(System.in);
        //Recorremos con un bucle while, se repite hasta que puslemos 0 pra salir
        //Inicio
        do {
            System.out.println("Introduce el primer número (Pulsa 0 para salir): ");
            numero1 = teclado.nextInt();
            if (numero1 !=0) {
                System.out.println("Introduceel segundo número: ");
                numero2 = teclado.nextInt();
                resultado = numero1+ numero2;
                System.out.println("El resultado de la suma es: " + resultado);
            }
        }while (numero1 !=0);
        System.out.println("Salio correctamente");
        teclado.close();
        //Fin
    }
}
