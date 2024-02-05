package Ejercicios.Ejercicio14;

import java.util.Scanner;

import java.util.Scanner;

public class Ejercicio14Switch {
    /**
     *Realiza un programa que diga si un número introducido por teclado es par y/o
     * divisible entre 5.
     */
    public static void main(String[] args) {
        //Salida por teclado
        Scanner teclado = new Scanner(System.in);
        //Variable tipo entero
        int numero;
        //Varaible tipo boolean, true o falso
        boolean esPar, esDivisibleEntre5;

        //Bucle do while se repite mientras se cumpla, sale cuando la condición sea falso
        //Se repitará en esta ocasón hasta que pulsemos 0 para salir
        do {
            //Inicio

            //Imprime por pantalla
            System.out.print("Introduce un número o pulsemos (0 para salir): ");
            //Leer por teclado
            numero = teclado.nextInt();
            //Condición del if igualamos la vraible número==0, para cuando pulsemos 0 salga del bucle
            if (numero == 0) {
                //Imprime por pantalla
                System.out.println("Programa finalizado.");
                break;
            }
            //Para poder leer los métodos esPar o esDivisibleEntre5
            esPar = esPar(numero);
            esDivisibleEntre5 = esDivisibleEntre5(numero);
            //Variable tipo String
            String resultado = "";
            //La condición del swich, si el caso uno se cumple sale
            switch (esPar ? 1 : 0) {
                case 1:
                    resultado += "par ";
                case 0:
                    switch (esDivisibleEntre5 ? 1 : 0) {
                        case 1:
                            resultado += "divisible entre 5";
                            break;
                        case 0:
                            if (resultado.isEmpty()) {
                                resultado = "no es par, no es divisible entre 5";
                            }
                            break;
                    }
                    break;
            }
            //Imprime por pantalla
            System.out.println("El número " + numero + " es " + resultado + ".");

        } while (true);
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
