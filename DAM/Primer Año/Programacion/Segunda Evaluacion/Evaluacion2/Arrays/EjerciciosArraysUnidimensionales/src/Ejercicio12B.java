import java.util.Scanner;

public class Ejercicio12B {
    /**
     * Realiza un programa que pida 10 números por teclado y que los almacene en un array. A continuación
     * se mostrará el contenido de ese array junto al índice (0 – 9). Seguidamente el programa pedirá dos
     * posiciones a las que llamaremos “inicial” y “final”. Se debe comprobar que inicial es menor que final y
     * que ambos números están entre 0 y 9. El programa deberá colocar el número de la posición inicial en
     * la posición final, rotando el resto de números, para que no se pierda ninguno. Al final se debe
     * mostrar el array resultante.
     * Por ejemplo, para inicial = 3 y final = 7:
     */

    public static void main(String[] args) {
        //Leer los 10 números del usuario
        Scanner teclado = new Scanner(System.in);

        //Crear un array para almacenar los 10 números
        int[] numeros = new int[10];

        //Pedir valores al usario almacenados en el array (0-9)
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingrese el número en la posición " + i + ": ");
            numeros[i] = teclado.nextInt();
        }

        //Mostrar el contenido del array junto al índice
        System.out.println("\nContenido del array junto al índice:");
        System.out.print("Índice: ");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(i + " ");
        }
        System.out.print("\nNúmero: ");
        for (int numero : numeros) {
            System.out.print(numero + " ");
        }
        System.out.println();

        //Pedir las posiciones inicial y final
        int inicial, fin;
        do {
            System.out.print("\nIngrese la posición inicial (entre 0 y 9): ");
            inicial = teclado.nextInt();
            System.out.print("Ingrese la posición final (entre 0 y 9): ");
            fin = teclado.nextInt();

            if (inicial < 0 || inicial >= numeros.length || fin < 0 || fin >= numeros.length || inicial >= fin) {
                System.out.println("Las posiciones ingresadas no son válidas. Por favor, intente de nuevo.");
            }
        } while (inicial < 0 || inicial >= numeros.length || fin < 0 || fin >= numeros.length || inicial >= fin);

        // Rotar los elementos del array dentro del rango dado
        rotateArray(numeros, inicial, fin);

        //Mostrar el array resultante
        System.out.println("\nArray resultante después de la rotación:");
        System.out.print("Índice: ");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(i + " ");
        }
        System.out.print("\nNúmero: ");
        for (int numero : numeros) {
            System.out.print(numero + " ");
        }
        System.out.println();
    }

    //Método para rotar los elementos del array dentro del rango dado
    private static void rotateArray(int[] arr, int start, int end) {
        int temp = arr[end];
        for (int i = end; i > start; i--) {
            arr[i] = arr[i - 1];
        }
        arr[start] = temp;
    }
}