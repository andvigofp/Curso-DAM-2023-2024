package Ejercicios1.Ejercicio5;

import java.util.Scanner;

public class numeroMayor {
    public static void main(String[] args) {
        /**
         * Pedir dos números enteros y mostrar “verdadero” si el primero es mayor.
         */
        //Variables tipo entero
        int numero1, numero2;
        //Salida por teclado
        Scanner teclado = new Scanner(System.in);
        //Inicio
        System.out.println("Ingrese número 1");
        //Leemos por teclado num1
        numero1 = teclado.nextInt();
        System.out.println("Ingrese número 2");
        //Leemos por teclado num2
        numero2 = teclado.nextInt();
        //Utilizar variable Si, Sino (Para saber si un número es verdadero o falso entre dos números enteros)
        if (numero1>numero2) {
            System.out.println("El número Es verdadero: "); //Verdadero
        }else  {
            System.out.println("El número Es Falso"); //Falso
        }
        //FIn
    }
}
