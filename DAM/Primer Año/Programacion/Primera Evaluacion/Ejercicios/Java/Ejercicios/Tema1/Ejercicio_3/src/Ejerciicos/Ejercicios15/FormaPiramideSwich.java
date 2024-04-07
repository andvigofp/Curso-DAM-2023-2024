package Ejerciicos.Ejercicios15;

import java.util.Scanner;

public class FormaPiramideSwich {
    /**
     * Escribe un programa que pinte una pirámide rellena con un carácter introducido por
     * teclado que podrá ser una letra, un número o un símbolo como *, +, -, $, &, etc. El
     * programa debe permitir al usuario mediante un menú elegir si el vértice de la pirámide
     * está apuntando hacia arriba, hacia abajo, hacia la izquierda o hacia la derecha
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        //Variables
        char caracter;
        int altura, opcion;
        do {


            // Solicitar un carácter al usuario
            System.out.println("Introduce un carácter para la pirámide:");
            caracter = teclado.next().charAt(0);

            // Solicitar la orientación de la pirámide al usuario
            System.out.println("Selecciona la dirección de la pirámide:");
            System.out.println("1. Vértice hacia arriba");
            System.out.println("2. Vértice hacia abajo");
            System.out.println("3. Vértice hacia la izquierda");
            System.out.println("4. Vértice hacia la derecha");
            System.out.println("5. Salir");
            System.out.print("Elige una opción: ");

            opcion = teclado.nextInt();

            if (opcion == 5) {
                // Salir del bucle si la opción es "Salir"
                System.out.println("Ha salido correctamente");
                break;
            }

            // Imprime por pantalla
            System.out.print("Introduce la altura de la pirámide: ");
            // Leer por teclado
            altura = teclado.nextInt();

            // Pintar la pirámide según la orientación seleccionada usando switch
            switch (opcion) {
                case 1:
                    for (int i = 1; i <= altura; i++) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print(caracter);
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    for (int i = altura; i >= 1; i--) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print(caracter);
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    for (int i = 1; i <= altura; i++) {
                        for (int j = altura; j > i; j--) {
                            System.out.print(" ");
                        }
                        for (int k = 1; k <= i; k++) {
                            System.out.print(caracter);
                        }
                        System.out.println();
                    }
                    break;
                case 4:
                    for (int i = 1; i <= altura; i++) {
                        for (int j = 1; j < i; j++) {
                            System.out.print(" ");
                        }
                        for (int k = i; k <= altura; k++) {
                            System.out.print(caracter);
                        }
                        System.out.println();
                    }
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        }while (opcion !=5);
    }
}

