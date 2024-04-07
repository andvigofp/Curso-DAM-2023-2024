package Ejercicios1.Ejercicio4;

import java.util.Scanner;


public class NumeroCuadrado {
    public static void main(String[] args) {
        /**
         * Algoritmo que pide un número y escribe su cuadrado.
         */
        //Variables tipo entero
        int numero = 1;
        //Variable tipo entero
        double cuadrado;
        //Salida por teclado
        Scanner teclado = new Scanner(System.in);
        //Utilizamos un bucle while, se repetirá el ciclo hasta que pulsemos 0 para salir
        //Inicio
       while (true){
           System.out.println("Intrdoce un número (Pulsa 0 para salir: )");
           numero = teclado.nextInt();
           if (numero ==0) {
               System.out.println("Salio correctamente");
               break;
           }
           //Operacion para calcular un número por el cuadrado
            cuadrado = (int) Math.pow(numero, 2);
            System.out.println("El resultado del número por el cuadrado es: " + cuadrado);
            //Fin
        }
       teclado.close();
    }

}
