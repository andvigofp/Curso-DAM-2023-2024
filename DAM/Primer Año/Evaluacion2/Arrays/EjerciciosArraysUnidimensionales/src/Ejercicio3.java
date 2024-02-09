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

        //Para pedir al usaurio
        pedirnumero(numero);

        //Para mostar el resultado del array
        resultadoArray(numero);

    }

    //Método para pedir números
    public static void pedirnumero(int numeros[]) {
        Scanner teclado = new Scanner(System.in);

        for (int i =0; i<numeros.length; i++) {
            System.out.println("Introduce valores del array " + i + ": ");
            numeros[i] = teclado.nextInt();
        }

        System.out.println("------------------------------");

    }

    //Método para mosrar el resultado
    public static void resultadoArray(int numeros[]) {

        for (int i =numeros.length -1; i>0; i--) {

            System.out.println("Resultado: "+ "\t\t" + numeros[i]);
        }
    }
}
