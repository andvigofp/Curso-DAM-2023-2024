package Ejercicios.Ejercicio9;

import java.util.Scanner;

public class Ejercicio9 {
    /**
     * Realiza un programa que pida 8 números enteros y que luego muestre esos números junto con la
     * palabra “par” o “impar” según proceda.
     */
    public static void main(String[] args) {
        //Leer la entrada del usuario
        Scanner teclado = new Scanner(System.in);

            //Creamos un array para almacenar los 8 números enteros
            int[] numeros = MetodosEj9.pedirNumeros(teclado);
            //Mostrar el resultado de los números s son par o impar
            MetodosEj9.mostrarNumerosParImpar(numeros);

        }
    }
