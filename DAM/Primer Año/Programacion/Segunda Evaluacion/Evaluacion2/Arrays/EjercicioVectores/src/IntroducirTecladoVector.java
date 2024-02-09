import java.util.Scanner;

public class IntroducirTecladoVector {
    /**
     * Meter datos en el vector desde teclado utilizando un bucle
     */

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        //Obtener la longitud de un vector desde un usuario
        System.out.println("Ingrese la longitud de un vector: ");
        int longitud = teclado.nextInt();

        //crear un vector con la longitud especifica
        int vector[] = new int[longitud];

        //Ingresar datos de un vector desde el teclado usando un bucle
        for (int i=0; i<longitud; i++) {
            System.out.println("Ingese el valor para la posición " + i + ": ");
            vector[i] = teclado.nextInt();
        }

        System.out.println("-----------------------------");
        //Imprimir el vector
        System.out.print("Vector ingesado: ");
        imprimirVector(vector);
    }

    //Método auxiliar para imprimir un vector
    private static void imprimirVector(int[] vector) {
        for (int i: vector) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}