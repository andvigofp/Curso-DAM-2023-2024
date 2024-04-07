package Ejercicios.Ejercicio7;

import java.util.Scanner;

public class Ejercicio7If {
    /**
     *Realiza un programa que calcule la media de tres notas
     */
    public static void main(String[] args) {
        //Salida por teclado
        Scanner teclado = new Scanner(System.in);
        //Variables tipo double
        double nota1, nota2, nota3, media;
        //Variable tipo String
        String continuar;
        //Bucle do while se repite mientras se cumpla, sale cuando la condición sea falso
        do {
            //Inicio
            //Imprime por pantalla
            System.out.print("Por favor, introduce la primera nota: ");
            //Leer por teclado
            nota1 = teclado.nextDouble();
            //Imprime por pantalla
            System.out.print("Por favor, introduce la segunda nota: ");
            //Leer por teclado
            nota2 = teclado.nextDouble();
            //Imprima por pantalla
            System.out.print("Por favor, introduce la tercera nota: ");
            //leer por teclado
            nota3 = teclado.nextDouble();
            //Operaciones, para calcular la média de las notas
            media = (nota1 + nota2 + nota3) / 3;
            //Imprime el resultado por pantalla
            System.out.println("La media de las tres notas es: " + media);
            //Imprime por pantalla
            System.out.print("Pulsa 0 para salir o pulse otra tecla para continuar: ");
            //Leer por teclado
            continuar = teclado.next();
            //Utilzamos .equals para compación, para cuando pulsemos 0 salga por teclado
        } while (!continuar.equals("0"));
        //Imprima por pantalla
        System.out.println("A salido correctamente");
        //Fin
    }
}
