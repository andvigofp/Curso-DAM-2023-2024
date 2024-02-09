import java.util.Scanner;

public class Ejercicio3 {
    /**
     * Escribe un programa que lea 10 números por teclado y que luego los muestre en orden inverso, es
     * decir, el primero que se introduce es el último en mostrarse y viceversa.
     */

    public static void main(String[] args) {
        //Leer la entrada del usuario
        Scanner teclado = new Scanner(System.in);

        //Creamos el array oara almacenar almacenar 10
        int[] numero = new int[10];
        int tamanoArray = numero.length;

        for (int i=0; i<tamanoArray; i++) {
            System.out.println("Introduce valores del Array: ");
            numero[i] = teclado.nextInt();
        }

        for (int j=tamanoArray -1; j>0; j--) {
            System.out.println(numero[j]);
        }

    }

}
