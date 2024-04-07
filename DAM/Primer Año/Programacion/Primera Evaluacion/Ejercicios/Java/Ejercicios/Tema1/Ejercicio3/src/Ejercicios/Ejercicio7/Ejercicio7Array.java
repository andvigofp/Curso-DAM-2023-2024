package Ejercicios.Ejercicio7;

import java.util.Scanner;

public class Ejercicio7Array {
    /**
     *Realiza un programa que calcule la media de tres notas
     */
    public static void main(String[] args) {
        //Salida por teclado
        Scanner teclado = new Scanner(System.in);
        //Variable tipo String
        String continuar;
        //Variable tipo dpuble
        double media;
        //Bucle do while se repite mientras se cumpla, sale cuando la condición sea falso
        do {
            //Imprime por pantalla
            System.out.println("Por favor, introduce las notas de las tres asignaturas: ");
            //Array tipo double, para gurdar tres notas, desde la posición 0 hasta la posición2
            double[] notas = new double[3];
            //Bucle for, para poder recorrer las tres notas del array
            for (int i = 0; i < 3; i++) {
                System.out.print("Nota de la asignatura " + (i + 1) + ": ");
                notas[i] = teclado.nextDouble();

            }
            //Para coger los métodos de una funcón, hacer las operaciones
            media = calcularMedia(notas);
            //Imprima por pantalla el resultado
            System.out.println("La media de las tres notas es: " + media);
            //Imprima por pantalla
            System.out.print("Pulsa 0 para salir o pulse otra tecla para continuar: ");
            //Leer por teclado
            continuar = teclado.next();
            //Utilzamos .equals para compación, para cuando pulsemos 0 salga por teclado
        } while (!continuar.equals("0"));
        //imprima por pantalla
        System.out.println("A saldio correctamente.");
    }
    //Función para calcular la media de las notas
    private static double calcularMedia(double[] notas) {
        double suma = 0.0;
        for (double nota : notas) {
            suma += nota;
        }
        return suma / notas.length;
    }
}

