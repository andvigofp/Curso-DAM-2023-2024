package Ejercicios2.Ejercicio5;

import java.util.Scanner;

public class ValoresX_Y {
    public static void Valoresx_YAuxiliar() {
        /**
         * Hacer un pseucódigo que pieda por teclado dos valores de tipo numérico que sehan de guardar
         * en la variable X e Y. ¿Qué instrucciones habría que utilizar para intercambiar su contenido?
         * (es necesario utilizar una variable auxiliar). Para comprobar que el algoritmo pensado es
         * correcto, escribir en pantalla el contendio de la variables X e Y una vez leídas, y volver a
         * escribir el contendio de las mismas una vez intercambiado su contenido.
         */
        //Variables tipo entero
        int x, i, aux;
        //Salida por teclado
        Scanner teclado = new Scanner(System.in);
        //Utilizamos el bucle Do While, se repite el ciclo hasta que pulsemos 0 para salir
        do {
            System.out.println("Introduce un número 1 (Pulsa 0 para salir): ");
            x = teclado.nextInt();
            if (x !=0) {
                System.out.println("Intrduce un número 2: ");
                i = teclado.nextInt();
                System.out.println("El valor de: " + x + " y de la " + i);
                    //Operaciones para intercambiar el contenido de x y i, utilizando una variable auxliar.
                    aux = x;
                    x = i;
                    i = aux;
                System.out.println("El intercambio de la variable " + x + " y de: " + i);
            }
        }while (x !=0);
        System.out.println("A salido correctamente");
        teclado.close();
    }
    //Fin
    public static void main(String[] args) {
        //Para iniar la funcion del subprocesio
        Valoresx_YAuxiliar();
    }
}
