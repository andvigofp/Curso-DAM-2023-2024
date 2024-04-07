package Ejercicios.Ejercicio15;

import java.util.Scanner;

public class Ejercicio15If {
    /**
     *Escribe un programa que pinte una pirámide rellena con un carácter introducido por
     * teclado que podrá ser una letra, un número o un símbolo como *, +, -, $, &, etc. El
     * programa debe permitir al usuario mediante un menú elegir si el vértice de la pirámide
     * está apuntando hacia arriba, hacia abajo, hacia la izquierda o hacia la derecha
     */
    public static void main(String[] args) {
        //Salida por teclado
        Scanner teclado = new Scanner(System.in);
        //Variable de tipo caracter
        char caracter;
        //variable tipo caracter
        int altura, opcion;

        //Bucle do while se repite mientras se cumpla, sale cuando la condición sea falso
        do {
            //Incio
            //Imprime por pantalla
            System.out.print("Introduce un carácter para la pirámide: ");
            //Leer por teclado
            caracter = teclado.next().charAt(0);
            //Imprime por pantalla
            System.out.print("Introduce la altura de la pirámide: ");
            //Leer por teclado
            altura = teclado.nextInt();

            //Imprime por pantalla
            //Menú de opciones
            System.out.println("Selecciona la dirección de la pirámide:");
            System.out.println("1. Vértice hacia arriba");
            System.out.println("2. Vértice hacia abajo");
            System.out.println("3. Vértice hacia la izquierda");
            System.out.println("4. Vértice hacia la derecha");
            System.out.print("Elige una opción: ");
            //Leer Por teclado
            opcion = teclado.nextInt();

            //Condición del sí, si se cumple una de las opciones para, si nó pasa al siguiente que sea cierta
            if (opcion == 1) {
                piramideArriba(caracter, altura);
            } else if (opcion == 2) {
                piramideAbajo(caracter, altura);
            } else if (opcion == 3) {
                piramideIzquierda(caracter, altura);
            } else if (opcion == 4) {
                piramideDerecha(caracter, altura);
            } else {
                System.out.println("Opción no válida.");
            }
            //Imprime por pantalla, si quieres continuar pulsa cualquier tecla, si nó pulsa 0 para salir del bucle
            System.out.print("¿Deseas pintar otra pirámide? (0 para salir, cualquier otro número para continuar): ");
            //Leer por teclado
            opcion = teclado.nextInt();
            //Para salir del bucle cuando pulsamos 0
        } while (opcion != 0);
        //Imprime por pantalla
        System.out.println("A salido correctamente.");
        //Cerramos el scnanner, al terminar todos los ciclos del bucle
        teclado.close();
    }
    //Fin

    // Funciónes para pintar la pirámide en diferentes direcciones
    private static void piramideArriba(char caracter, int altura) {
        //Bucle for el ciclo se repite por un número específico que le pusieras, en el ciclo
        for (int i = 1; i <= altura; i++) {
            for (int j = 1; j <= i; j++) {
                //Imprime el resultado por pantalla
                System.out.print(caracter);
            }
            //Imprime por pantalla
            System.out.println();
        }
    }

    private static void piramideAbajo(char caracter, int altura) {
        //Bucle for el ciclo se repite por un número específico que le pusieras, en el ciclo
        for (int i = altura; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                //Imprime el resultado por pantalla
                System.out.print(caracter);
            }
            //Imprime por pantalla
            System.out.println();
        }
    }

    private static void piramideIzquierda(char caracter, int altura) {
        //Bucle for el ciclo se repite por un número específico que le pusieras, en el ciclo
        for (int i = 1; i <= altura; i++) {
            for (int j = altura; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                //Imprime el resultado por pantalla
                System.out.print(caracter);
            }
            //Imprime por pantalla
            System.out.println();
        }
    }

    private static void piramideDerecha(char caracter, int altura) {
        //Bucle for el ciclo se repite por un número específico que le pusieras, en el ciclo
        for (int i = 1; i <= altura; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = i; k <= altura; k++) {
                //Imprime el resultado por pantalla
                System.out.print(caracter);
            }
            //Imprime por pnatlla
            System.out.println();
        }
    }
}

