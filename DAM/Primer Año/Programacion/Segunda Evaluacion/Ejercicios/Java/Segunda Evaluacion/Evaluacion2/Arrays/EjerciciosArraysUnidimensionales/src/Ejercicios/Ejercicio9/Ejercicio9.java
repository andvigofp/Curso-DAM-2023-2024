package Ejercicios.Ejercicio9;

import Ejercicios.Ejercicio3.MetodosEj3;

import java.util.Scanner;

public class Ejercicio9 {
    /**
     * Realiza un programa que pida 8 números enteros y que luego muestre esos números junto con la
     * palabra “par” o “impar” según proceda.
     */
    public static void main(String[] args) {
        //Leer la entrada del usuario
        Scanner teclado = new Scanner(System.in);

        //Pedir al usuario que ingrese los números y actualizar el contador
        Object[] resultado = MetodosEj9.pedirNumeros(teclado, MetodosEj9.num_MAX());
        int[] numeros = (int[]) resultado[0];
        int contadorPosicionesRestantes = (int) resultado[1];

            //Mostrar el resultado de los números s son par o impar
            MetodosEj9.mostrarNumerosParImpar(numeros);

        //Mostrar el contador de posiciones restantes
        System.out.println("Quedan " + (contadorPosicionesRestantes) + " posiciones por llenar.");

        }
    }
