package Ejercicios1.Ejercicio3;

import java.util.Scanner;

public class TripeNumero {
    public static void main(String[] args) {
        /**
         * Algoritmo que muestra por pantalla el triple de un número real introducido por el
         * usuario.
         */
        //Variables tipo double
        double numero1, multiplicacion, resultado;
        //Salida por teclado
        Scanner teclado = new Scanner(System.in);
        //Para sacar el triple de una multiplicación
        multiplicacion=3;
        //Recorremos bucle do while, se repite hasta que pulsemos 0
        //Inicio
        do {
            System.out.println("Introduce un número (0 para salir)");
            numero1 = teclado.nextInt();
            //Para poder sacar la multiplicación
            resultado = numero1*multiplicacion;
            if (numero1 !=0) {
                System.out.println("El resultado del triple de un número es; " +resultado);
            }
        }while (numero1 !=0);
        System.out.println("Salió correctamente");
        teclado.close();
        //Fin
    }
}
