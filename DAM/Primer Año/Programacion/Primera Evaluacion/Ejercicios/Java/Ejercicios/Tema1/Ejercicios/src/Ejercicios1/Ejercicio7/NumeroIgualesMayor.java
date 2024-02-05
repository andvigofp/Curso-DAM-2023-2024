package Ejercicios1.Ejercicio7;

import java.util.Scanner;

public class NumeroIgualesMayor {
    public static void main(String[] args) {
        /**
         * Pedir dos valores y en caso de que no sean iguales indicar cuál es el mayor.
         */
        //Variables tipo entero
        int numero1, numero2;
        //Salida por teclado
        Scanner teclado = new Scanner(System.in);
        //Inicio
        System.out.println("Introduce el número 1");
        //Leemos por teclado
        numero1 = teclado.nextInt();
        System.out.println("Intrdoduce el número 2");
        //Leemos por teclado num2
        numero2 = teclado.nextInt();
        //utilizamos la variable Si, SiNo para saber si son iguales o mayor
        if (numero1==numero2) {
            System.out.println("Son iguales");
        }else if (numero1>numero2) {
            System.out.println("Es mayor: " + numero2);
        }else {
            System.out.println("Es mayor: " + numero1);
        }
        //Fin
    }
}
