package CalculadoraV2;

import java.util.Scanner;

public class Funciones {
    static int sumar(int numero1, int numero2)  { //función que realiza la suma de dos números enteros

        return numero1+numero2;
    }

    static int resta (int numero1, int numero2) { //función que realiza la resta de dos números enteros

        return numero1-numero2;
    }

    static int multiplicar (int numero1, int numero2) { //función que realiza la multiplicación de dos números enteros

        return numero1*numero2;
    }

    static int dividir (int numero1, int numero2) { //función que realiza al dividir de dos números enteros

        return numero1/numero2;
    }

    static int raizCuadrada(double numero) {
        return (int) (Math.PI * Math.pow(numero,2));
    }

    static int pedir(String g){ //Función para pedir datos
        Scanner teclado = new Scanner(System.in);
        System.out.println(g);
        return teclado.nextInt();

    }

    static void mostar(String op, int solucion) { //Función mostar una operación y el resultado
        System.out.println(op + " = " + solucion);
    }

    static void opciones() { //Función Menú de opciones
        System.out.println("Elige una de las opciones");
        System.out.println("1- Sumar");
        System.out.println("2- Restar");
        System.out.println("3- Multiplicar");
        System.out.println("4- Dividir");
        System.out.println("5- RaizCuadrada");
        System.out.println("5- Salir");

    }
}
