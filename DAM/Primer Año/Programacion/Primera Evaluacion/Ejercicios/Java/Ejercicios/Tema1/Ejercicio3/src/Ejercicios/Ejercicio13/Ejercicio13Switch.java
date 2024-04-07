package Ejercicios.Ejercicio13;

import java.util.Scanner;

public class Ejercicio13Switch {
    /**
     *Escribe un programa que ordene tres números enteros introducidos por teclado.
     */
    public static void main(String[] args) {
        //Salida por teclado
        Scanner teclado = new Scanner(System.in);
        //Variable tipo entero
        int num1, num2, num3, opcion;
        //Bucle do while se repite mientras se cumpla, sale cuando la condición sea falso
        do {
            //Incio
            //Imprima por pantalla
            System.out.print("Introduce el primer número (0 para salir): ");
            //Leer por teclado
            num1 = teclado.nextInt();
            //Condición el if, si se cumple, la primera condición y si nó sale a la siguiente condición, pulsamos 0 para salir
            if (num1 == 0) {
                System.out.println("Programa finalizado.");
                break;
            }
            //Imprima por pantalla
            System.out.print("Introduce el segundo número: ");
            //Leer por teclado
            num2 = teclado.nextInt();
            //Imprima por teclado
            System.out.print("Introduce el tercer número: ");
            //Leer por teclado
            num3 = teclado.nextInt();
            //Imprima por pantalla
            //Menú de opciones
            System.out.println("Selecciona cómo quieres ordenar los números:");
            System.out.println("1. De menor a mayor.");
            System.out.println("2. De mayor a menor.");
            System.out.println("0. Salir");
            //Leer por teclado
            opcion = teclado.nextInt();
            //Condición del Swich, va caso por caso, si se cumple uno de los casos salé imprime el resultado por pantalla
            switch (opcion) {
                case 1:
                    ordenarNumeros(num1, num2, num3);
                    break;
                case 2:
                    ordenarMayorAMenor(num1, num2, num3);
                    break;
                case 0:
                    System.out.println("A salido correctamente.");
                    break;
                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        } while (opcion != 0);

    }
    //Fin
    ////Función para ordenar números
    public static void ordenarNumeros(int a, int b, int c) {
        int temp;

        if (a > b) {
            temp = a;
            a = b;
            b = temp;
        }

        if (b > c) {
            temp = b;
            b = c;
            c = temp;
        }

        if (a > b) {
            temp = a;
            a = b;
            b = temp;
        }

        System.out.println("Los números ordenados son: " + a + ", " + b + ", " + c);
    }


    public static void ordenarMayorAMenor(int a, int b, int c) {
        int temp;
        if (a < b) {
            temp = a;
            a = b;
            b = temp;
        }
        if (b < c) {
            temp = b;
            b = c;
            c = temp;
        }
        if (a < b) {
            temp = a;
            a = b;
            b = temp;
        }
        System.out.println("Los números ordenados de mayor a menor son: " + a + ", " + b + ", " + c);
    }
}