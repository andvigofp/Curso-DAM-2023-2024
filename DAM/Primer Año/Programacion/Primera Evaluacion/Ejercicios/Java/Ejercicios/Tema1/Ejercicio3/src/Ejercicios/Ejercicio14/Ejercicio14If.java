package Ejercicios.Ejercicio14;

import java.util.Scanner;

public class Ejercicio14If {
    /**
     *Realiza un programa que diga si un número introducido por teclado es par y/o
     * divisible entre 5.
     */
    public static void main(String[] args) {
        //Salida por teclado
        Scanner teclado = new Scanner(System.in);
        //Variable tipo entero
        int numero;
        //Bucle do while se repite mientras se cumpla, sale cuando la condición sea falso
        //Se repitará en esta ocasón hasta que pulsemos 0 para salir
        do {
            //Inicio
            //Imprime por pantalla
            System.out.print("Introduce un número o pulse (0 para salir): ");
            //Leer por teclado
            numero = teclado.nextInt();
            //Condición del if igualamos la vraible número==0, para cuando pulsemos 0 salga del bucle

            //Condifición del bucle si se cumple la primera condición sale, si no pasa a la siguiente, condición hasta que uno se cumpla una condición
            if (esPar(numero) && esDivisibleEntre5(numero)) {
                System.out.println("El número " + numero + " es par y divisible entre 5.");
            } else if (esPar(numero)) {
                System.out.println("El número " + numero + " es par pero no divisible entre 5.");
            } else if (esDivisibleEntre5(numero)) {
                System.out.println("El número " + numero + " no es par pero es divisible entre 5.");
            } else {
                System.out.println("El número " + numero + " no es par, no es divisible entre 5.");
            }

        } while (numero !=0);
        System.out.println("A salido correctamnete");
        //Fin
    }
    //Funcíones si es "Par" o si es "divisibleentre 5", utilizamos la condición del boolean si es verdadero entonces me muestras el resultado
    //Si es falso, entonces no se cumple la condición
    public static boolean esPar(int num) {
        return num % 2 == 0;
    }

    public static boolean esDivisibleEntre5(int num) {
        return num % 5 == 0;
    }
}

