package Ejerciicos.Ejercicios13;

import java.util.Scanner;

public class OrdenarTresNumerosSwich {
    /**
     *Escribe un programa que ordene tres números enteros introducidos por teclado.
     */

    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            //variables
            int num1,num2,num3,temp;

            // Solicitar tres números al usuario
            System.out.println("Introduce el primer número:");
            num1 = scanner.nextInt();

            System.out.println("Introduce el segundo número:");
            num2 = scanner.nextInt();

            System.out.println("Introduce el tercer número:");
            num3 = scanner.nextInt();

            // Definir una variable para el caso de 'switch'
            // Ordenar los números de menor a mayor usando 'switch'
            switch (num1 > num2 ? 0 : num2 > num1 ? 1 : -1) {
                case 1:
                    temp = num1;
                    num1 = num2;
                    num2 = temp;
                case 0:
                    break;
                case -1:
                    temp = num2;
                    num2 = num1;
                    num1 = temp;
                    break;
            }

            switch (num2 > num3 ? 0 : num3 > num2 ? 1 : -1) {
                case 1:
                    temp = num2;
                    num2 = num3;
                    num3 = temp;
                case 0:
                    break;
                case -1:
                    temp = num3;
                    num3 = num2;
                    num2 = temp;
                    break;
            }

            switch (num1 > num2 ? 0 : num2 > num1 ? 1 : -1) {
                case 1:
                    temp = num1;
                    num1 = num2;
                    num2 = temp;
                case 0:
                    break;
                case -1:
                    temp = num2;
                    num2 = num1;
                    num1 = temp;
                    break;
            }

            // Mostrar los números ordenados
            System.out.println("Números ordenados: " + num1 + ", " + num2 + ", " + num3);
        }
    }
