package Ejercicios.Ejercicios8;

import java.util.Scanner;

public class TablaMultiplicacionTecladoFor {
    /**
     * Muestra la tabla de multiplicar de un número introducido por teclado
     */
    public static void main(String[] args) {
        //Salida por teclado
        Scanner teclado = new Scanner(System.in);
        //Variables tipo entero
        int numero,i,resultado;

        System.out.println("Ingresa un número");
        numero = teclado.nextInt();
        //Bucle for para iterar desde 1 hasta 10, para que genere la tabla de multipicar con los 10 números
        for (i =1; i<=10;i++) {
            //Operaciones
            resultado = numero*i;
            //Imprimir el resultado
            System.out.println(numero + " x " + i + " = " + resultado);
        }
    }
}
