package Ejercicios.Menu;

import Ejercicios.Ejercicio1.NumerosPositivosNegativos;
import Ejercicios.Ejercicio2.sumaDosNumeros;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        //Salida por teclado
        Scanner teclado = new Scanner(System.in);
        //Variables
        int opciones;
        boolean salir = false;
        //Blucle Do While
        do {
            //Opciones que muestra por pantalla
            System.out.println("Pulsa 0 para volver a la pantalla");
            System.out.println("1: NumerosPostivos Negativos:");
            System.out.println("2: Suma Dos Números Enteros:");
            System.out.println("3: Salir del Menú\n");

            System.out.println("Introduce un número");
            opciones = teclado.nextInt();
            //Excepciones switch menú de opciones
            try {
                switch (opciones) {
                    case 1:
                        //Opbjetco NumerosPositivos hace la
                        NumerosPositivosNegativos.NumerosPositivos();
                        break;
                    case 2:
                        sumaDosNumeros.sumaNumeros();
                        break;
                    case 3:
                        salir = true;
                        break;
                    default:
                        System.out.println("Introduce un número entre 1 y 3");
                }
                //Excepciones
            }catch (InputMismatchException e) {
                System.out.println("Debes poner un número");
                teclado.next();
            }
            System.out.println("Salio correctamente\n");
        }while (!salir);
    }

}
