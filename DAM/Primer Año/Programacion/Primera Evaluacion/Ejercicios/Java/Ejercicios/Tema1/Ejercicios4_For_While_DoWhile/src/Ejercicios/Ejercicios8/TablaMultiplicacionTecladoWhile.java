package Ejercicios.Ejercicios8;

import java.util.Scanner;

public class TablaMultiplicacionTecladoWhile {
    /**
     * Muestra la tabla de multiplicar de un número introducido por teclado
     */
    public static void main(String[] args) {
        ////Inicializamos en 1 variable i
        int numero,i=1, resultado;
        //Salida por teclado
        Scanner tecldo = new Scanner(System.in);
        System.out.println("Ingresa un número");
        numero = tecldo.nextInt();
        //Inicializamos en 1

        //Bucle while para iterar desde 1 hasta 10, para que genere la tabla de multipicar con los 10 números
        while (i<=10) {
            //Operaciones
            resultado = numero*i;
            //Imprime el resultado
            System.out.println(numero + " x " + i + " = " + resultado);
            //Incrementamos la variable de control
            i++;
        }
    }
}
