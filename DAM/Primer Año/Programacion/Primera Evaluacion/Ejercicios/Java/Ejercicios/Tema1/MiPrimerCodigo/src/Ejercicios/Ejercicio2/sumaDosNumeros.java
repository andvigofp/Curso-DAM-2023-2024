package Ejercicios.Ejercicio2;

import java.util.Scanner;

public class sumaDosNumeros {
    public static void sumaNumeros() {
        System.out.println("Programa para sumar dos números enteros");
        //Variable
        int num1, num2, resultado;
        //Salida por teclado
        Scanner teclado = new Scanner(System.in);
        //Inicio
        System.out.println("Introdce número 1");
            num1 = teclado.nextInt();
        System.out.println("Introuce número 2");
            num2 = teclado.nextInt();
            //Calcular la suma de dos números
            resultado = num1+num2;
        System.out.println("El resultado de la suma es: " + resultado);
        //Fin
    }
}
