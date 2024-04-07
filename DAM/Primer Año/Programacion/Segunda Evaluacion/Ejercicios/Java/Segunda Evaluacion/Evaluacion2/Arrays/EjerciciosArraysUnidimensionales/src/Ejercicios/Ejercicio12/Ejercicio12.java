package Ejercicios.Ejercicio12;

import java.util.Scanner;

public class Ejercicio12 {

    /**
     *
     *Realiza un programa que pida 10 números por teclado y que los almacene en un array. A continuación
     * se mostrará el contenido de ese array junto al índice (0 – 9). Seguidamente el programa pedirá dos
     * posiciones a las que llamaremos “inicial” y “final”. Se debe comprobar que inicial es menor que final y
     * que ambos números están entre 0 y 9. El programa deberá colocar el número de la posición inicial en
     * la posición final, rotando el resto de números, para que no se pierda ninguno. Al final se debe
     * mostrar el array resultante.
     *
     * Por ejemplo, para inicial = 3 y final = 7:
     */
    public static void main(String[] args) {
        //Leer por teclado
        Scanner teclado = new Scanner(System.in);

        //Array de tipo entero mediante el tamaño de 10 posiciones
        int[] numeros = new int[10];
        //Pedir al suario números al usario
        MetodosEj12.pedirNumeros(numeros, teclado);
        //Mostrar el resultado ddel array incial
        MetodosEj12.resultadoArrayInicial(numeros);
        //variables de tipo entero
        int posInicial, posFinal;

        //Bucle do while para preguntar al usuario mediante posciones del arary
        do {
            System.out.print("Ingrese la posición inicial (0 - 9): ");
            posInicial = teclado.nextInt();
            System.out.print("Ingrese la posición final (0 - 9): ");
            posFinal = teclado.nextInt();
        } while (posInicial < 0 || posInicial > 9 || posFinal < 0 || posFinal > 9);

        int[] arrayFinal = MetodosEj12.rotacionArray(numeros, posInicial, posFinal);
        MetodosEj12.resultadoArrayFinal(arrayFinal);
    }
}