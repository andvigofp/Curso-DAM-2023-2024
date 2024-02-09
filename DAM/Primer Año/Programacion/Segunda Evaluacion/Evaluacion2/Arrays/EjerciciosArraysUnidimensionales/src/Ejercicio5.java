import java.util.Scanner;

public class Ejercicio5 {
    /**
     * Escribe un programa que pida 10 números por teclado y que luego muestre los números introducidos
     * junto con las palabras “máximo” y “mínimo” al lado del máximo y del mínimo respectivamente.
     */

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int numeros[] = new int[10];
        int tamanoNumero = numeros.length;
        int min, max;


        for (int i= 0; i<tamanoNumero; i++) {
            System.out.println("Introduce válores: ");
            numeros[i] = teclado.nextInt();
        }

        min = calcularMin(numeros);
        max = calcularMax(numeros);

        System.out.println("-----------------------------------");
        System.out.print("Minimo "+ min + " " + " Máximo " + max);


    }

    private static int calcularMin(int numMax[]) {
        int min;
        int auxiliar = numMax[0];

        for (int i = 0; i < numMax.length; i++) {
            for (int j = 1; j < numMax.length - 1; j++) {
                min = (numMax[i] < numMax[j]) ? numMax[i] : numMax[j];
                if (min < auxiliar) {
                    auxiliar = min;
                }
            }
        }
        return (auxiliar);
    }
    static int calcularMax(int numMax[]) {
        int max;
        int auxiliar = numMax[0];

        for (int i = 0; i < numMax.length; i++) {
            for (int j = 1; j < numMax.length - 1; j++) {
                max = (numMax[i] > numMax[j]) ? numMax[i] : numMax[j];
                if (max > auxiliar) {
                    auxiliar = max;
                }
            }
        }
        return (auxiliar);
    }
}
