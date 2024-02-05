package Ejercicios1.Ejercicio6;

import java.util.Scanner;

public class NumeroOrdenCreciente {
    public static void main(String[] args) {
        /**
         * Leer tres números y deducir si se han introducido en orden creciente.
         */
        //Variables tipo entero
        int numero1, numero2, numero3;
        //Salida por teclado
        Scanner teclado = new Scanner(System.in);
        //Inicio
        System.out.println("Ingrese el número 1");
        //Leemos por teclado num1
        numero1 = teclado.nextInt();
        System.out.println("Ingese el número 2");
        //Leemos por teclado num2
        numero2 = teclado.nextInt();
        System.out.println("Ingese el número 2");
        //Leemos por teclado num3
        numero3 = teclado.nextInt();
        //Utilizar variable Si, Sino (Para saber el orden creciente)
        if (numero1>numero2 && numero2<numero3) {
            System.out.println("En orden creciente");//Verdadero
        }else {
            System.out.println("En orden no creciente");//Falso
        }
        //FIN
    }
}
