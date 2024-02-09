import java.util.Scanner;

public class Ejercicio5B {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner teclado = new Scanner(System.in);

        // Definir variables para almacenar el máximo, el mínimo y los números introducidos
        int maximo = Integer.MIN_VALUE;
        int minimo = Integer.MAX_VALUE;
        int[] numeros = new int[10];

        // Pedir al usuario que introduzca 10 números y almacenarlos en el array

        for (int i = 0; i < 10; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            System.out.println("Introduce 10 números:");
            numeros[i] = teclado.nextInt();

            // Actualizar el máximo y el mínimo según sea necesario
            if (numeros[i] > maximo) {
                maximo = numeros[i];
            }
            if (numeros[i] < minimo) {
                minimo = numeros[i];
            }
        }

        // Mostrar los números introducidos junto con "máximo" y "mínimo" al lado del máximo y el mínimo, respectivamente
        System.out.println("\nNúmeros introducidos:");
        for (int i = 0; i < 10; i++) {
            System.out.print(numeros[i]);
            if (numeros[i] == maximo) {
                System.out.print(" (máximo)");
            } else if (numeros[i] == minimo) {
                System.out.print(" (mínimo)");
            }
            System.out.println();
        }
        
    }
}
