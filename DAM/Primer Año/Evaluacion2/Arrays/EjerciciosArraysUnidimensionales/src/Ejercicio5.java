import java.util.Scanner;

public class Ejercicio5 {
    /**
     * Escribe un programa que pida 10 números por teclado y que luego muestre los números introducidos
     * junto con las palabras “máximo” y “mínimo” al lado del máximo y del mínimo respectivamente.
     */

    public static void main(String[] args) {
        //Leer por teclado
        Scanner teclado = new Scanner(System.in);

        //Arrays
        int numeros[] = new int[10];
        int tamanoNumero = numeros.length;
        int maximo = Integer.MIN_VALUE;
        int minimo = Integer.MAX_VALUE;


        for (int i= 0; i<tamanoNumero; i++) {
            System.out.println("Introduce válores: ");
            numeros[i] = teclado.nextInt();


        }

        minimo = calcularMin(numeros);
        maximo = calcularMax(numeros);
        resultado(numeros,maximo,minimo);

        /**System.out.println("-----------------------------------");
        System.out.print("Minimo "+ minimo + " " + " Máximo " + maximo); **/


    }

    //Método para calcular el mínimo
    public static int calcularMin(int numMax[]) {
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
    //Método para calcular el Máximo
   public static int calcularMax(int numMax[]) {
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

    public static void resultado(int numeros[], int minimo, int maximo) {
        System.out.println("\t\t\tNúmero\n" +
                "----------------------------");
        for (int i=0; i<numeros.length; i++) {
            System.out.printf("%6d\t\n", numeros[i]);


        }
        System.out.println("--------------------------------\n");
        System.out.print("Minimo "+ minimo + " " + " Máximo " + maximo);
    }

}
