import java.util.Arrays;

public class Ejercicio1 {
    /**
     * Define un array de 12 números enteros con nombre num y asigna los valores según la tabla que se
     * muestra a continuación. Muestra el contenido de todos los elementos del array. ¿Qué sucede con los
     * valores de los elementos que no han sido inicializados?
     */

    public static void main(String[] args) {

        int num[] = new int[12];


       for (int i=0; i<num.length; i++) {
           num[i] = i+1;
       }

        System.out.println("Valores de num: ");
        imprimirNum(num);

    }

    private static void imprimirNum(int[] num) {
        for (int i : num) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
