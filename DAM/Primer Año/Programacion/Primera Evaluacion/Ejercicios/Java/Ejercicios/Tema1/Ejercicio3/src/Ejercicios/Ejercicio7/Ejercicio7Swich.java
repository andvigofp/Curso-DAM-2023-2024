package Ejercicios.Ejercicio7;

import java.util.Scanner;

public class Ejercicio7Swich {
    /**
     * Realiza un programa que calcule la media de tres notas
     */
    public static void main(String[] args) {
        //Salida por teclado
        Scanner teclado = new Scanner(System.in);
        //Variable tipo double
        double nota1, nota2, nota3, media;
        //Variable tipo String
        int operacion;
        String continuar;

        do {
            //Inicio
            //Bucle do while se repite mientras se cumpla, sale cuando la condición sea falso
            //Imprime por pantalla
            System.out.println("Por favor, introduce las notas de las tres asignaturas: ");
            //Imprima por pantalla
            System.out.print("Nota de la primera asignatura: ");
            //Leer por teclado
            nota1 = teclado.nextDouble();
            //Imprima por pantalla
            System.out.print("Nota de la segunda asignatura: ");
            //Leer por pantalla
            nota2 = teclado.nextDouble();
            //imprima por pantalla
            System.out.print("Nota de la tercera asignatura: ");
            //Leer por teclado
            nota3 = teclado.nextDouble();
            //Impor pantalla
            System.out.print("Por favor, selecciona la operación (1 para media): ");
            //Leer por pantalla
            operacion = teclado.nextInt();
            //Condición del Swich, va caso por caso, si se cumple uno de los casos salé imprime el resultado por pantalla
            switch (operacion) {
                case 1:
                    //Operaciones
                    media = (nota1 + nota2 + nota3) / 3;
                    System.out.println("La media de las tres notas es: " + media);
                    break;
                default:
                    System.out.println("Operación no válida.");
            }
            //Imprima por pantalla
            System.out.print("Pulsa 0 para salir o pulse otra tecla para continuar: ");
            //Leer por teclado
            continuar = teclado.next();
            //Utilzamos .equals para compación, para cuando pulsemos 0 salga por teclado
        } while (!continuar.equals("0"));
        //Imprima por pantalla
        System.out.println("A salido correctamente.");
        //Fin
    }
}