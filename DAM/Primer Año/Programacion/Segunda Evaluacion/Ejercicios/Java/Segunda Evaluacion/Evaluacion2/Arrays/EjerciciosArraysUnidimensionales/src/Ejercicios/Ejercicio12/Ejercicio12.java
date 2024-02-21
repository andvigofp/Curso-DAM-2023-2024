package Ejercicios.Ejercicio12;

import java.util.Scanner;

public class Ejercicio12 {


    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        //Definir el array inicial y pedir al usuario que ingrese los números
        int[] numeros = new int[10];

        //Variables de tipo entero
        int posInicial, posFinal;

        //Para pedir números al usuario
        //pedirNumeros(numeros, teclado);

        //Reusltado del array incial
        resultadoArrayInicial(numeros);

        pedirPosicionesArray(teclado);

        //Bucle do while para pedir al usuario las posciiones del array  incial y final
        do {
            System.out.print("Ingrese la posición inicial (0 - 9): ");
            posInicial = teclado.nextInt();
            System.out.print("Ingrese la posición final (0 - 9): ");
            posFinal = teclado.nextInt();
        } while (posInicial < 0 || posInicial > 9 || posFinal < 0 || posFinal > 9);



        // Crear el array final mediante el método desplazamiento
        int[] arrayFinal = rotacionArray(numeros, posInicial, posFinal);
        //Método para mostrar el resultado del array finañ
        resultadoArrayFinal(arrayFinal);


    }


    //Método para pedir al usuario las posiciones Incial y Final del array



    //Método  para pedir números al usuario
    public static void pedirNumeros(int num[], Scanner teclado) {
        //Leer por teclado
        for (int i = 0; i < num.length; i++) {
            System.out.print("Ingrese el número en la posición " + i + ": ");
            num[i] = teclado.nextInt();
        }
    }

    //Método para mostrar el resultado del array inicial
    public static void resultadoArrayInicial(int num[]) {
        //Mostrar el contenido del array junto al índice horizontalmente
        System.out.println("\nContenido del array junto al índice:");
        System.out.println("-------------------------------------");
        System.out.print("| Índice ");
        for (int i = 0; i < num.length; i++) {
            System.out.print("|   " + i + "   ");
        }
        System.out.println("|");
        System.out.println("-------------------------------------");
        System.out.print("| Número ");
        for (int i = 0; i < num.length; i++) {
            System.out.printf("|  %3d  ", num[i]);
        }
        System.out.println("|");
        System.out.println("-------------------------------------");
    }

    public static void pedirPosicionesArray(Scanner teclado){

        int poscionInicial, posicionFinal;

        do {
            System.out.print("Ingrese la posición inicial (0 - 9): ");
            poscionInicial = teclado.nextInt();
            System.out.print("Ingrese la posición final (0 - 9): ");
            posicionFinal = teclado.nextInt();
        } while (poscionInicial < 0 || poscionInicial > 9 || posicionFinal < 0 || posicionFinal > 9);

    }

    //Método para mostrar el resultado del array final
    public static void resultadoArrayFinal(int num[]) {
        //Mostrar el contenido del array junto al índice horizontalmente
        System.out.println("\nContenido del array junto al índice:");
        System.out.println("-------------------------------------");
        System.out.print("| Índice ");
        for (int i = 0; i < num.length; i++) {
            System.out.print("|   " + i + "   ");
        }
        System.out.println("|");
        System.out.println("-------------------------------------");
        System.out.print("| Número ");
        for (int i = 0; i < num.length; i++) {
            System.out.printf("|  %3d  ", num[i]);
        }
        System.out.println("|");
        System.out.println("-------------------------------------");
    }

    //Método de rotación de las posciones del array
    public static int[] rotacionArray(int[] numeros, int posInicial, int posFinal) {
        int[] auxliar = new int[numeros.length];

        // Hacer una copia del array original
        for (int i = 0; i < numeros.length; i++) {
            auxliar[i] = numeros[i];
        }

        // Condiciones del problema
        if (posInicial < posFinal) {
            int numInicial = numeros[posInicial];
            auxliar[posFinal] = numInicial; //Hacer el reemplazo del número inicial por el final
            for (int i = posFinal; i < numeros.length - 1; i++) { //Hacer los desplazamientos de la posición final a la derecha
                auxliar[i + 1] = numeros[i];
            }
            auxliar[0] = numeros[numeros.length - 1]; //Indicar la última posición del array original como la primera del nuevo array
            for (int i = 1; i <= posInicial; i++) { //Indicar los desplazamientos de la primera posición del array hasta la posición inicial
                auxliar[i] = numeros[i - 1];
            }
        }
        return auxliar;
    }
}
