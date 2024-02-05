package Ejercicios.Ejercicio13;

import java.util.Scanner;

public class Ejercicio13If {
    /**
     *Escribe un programa que ordene tres números enteros introducidos por teclado.
     */
    public static void main(String[] args) {
        //Salida por teclado
        Scanner teclado = new Scanner(System.in);
        //Varioable tipo entero
        int num1, num2, num3;
        //Bucle do while se repite mientras se cumpla, sale cuando la condición sea falso
        do {
            //Inicio
            //Imprima por pantalla
            System.out.print("Introduce el primer número (0 para salir): ");
            //Leer por teclado
            num1 = teclado.nextInt();
            //Condición el if, si se cumple, la primera condición y si nó sale a la siguiente condición, Pulsamos 0 para salir
            if (num1 == 0) {
                System.out.println("A salido correctamente.");
                break;
            }
            //Imprima por pantalla
            System.out.print("Introduce el segundo número: ");
            //Leer por teclado
            num2 = teclado.nextInt();
            //Imprima por pantalla
            System.out.print("Introduce el tercer número: ");
            //Leer por teclado
            num3 = teclado.nextInt();
            //Para coger los métodos de una funcón, hacer las operaciones
            ordenarNumeros(num1, num2, num3);
            ordenarMayorAMenor(num1,num2,num3);
        } while (true);

    }
    //Fin
    //Función para ordenar números
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

