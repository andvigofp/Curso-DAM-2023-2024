import java.util.Scanner;

public class VectorVariableB {
    /**
     *Crear el vector indicando el tamaño en una variable
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        //Obtener el tamaño del vector desde el usuario
        System.out.println("Ingrese  el tamaño del evctor: ");
        int tamanoVector = teclado.nextInt();

        //Crear un vector con el tamaño especificado por la variable
        int vector[] = new int[tamanoVector];

        //Inicializamos el vector con los valores ingresados por le usuario
        for (int i=0; i<tamanoVector; i++) {
            System.out.println("Ingrese el valor para la posición " + i + ": ");
            vector[i] = teclado.nextInt();
        }

        //Imprimir el vector
        System.out.println("Vector creado con variable: ");
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