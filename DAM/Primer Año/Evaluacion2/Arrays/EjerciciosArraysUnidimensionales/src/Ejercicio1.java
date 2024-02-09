import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio1 {
    /**
     * Define un array de 12 números enteros con nombre num y asigna los valores según la tabla que se
     * muestra a continuación. Muestra el contenido de todos los elementos del array. ¿Qué sucede con los
     * valores de los elementos que no han sido inicializados?
     */

    public static void main(String[] args) {

        //Creamos un array para almacenar los 12 números enteros
        int num[] = new int[12];
        num[0] = 39;
        num[1] = -2;
        num[4] = 0;
        num[6] = 14;
        num[8] = 5;
        num[9] = 120;

        resultadoNum(num);

      /**for (int i=0; i<num.length; i++) {
           System.out.println(num[i]);
       }**/

    }
    //Método para mostrar el resultado del array
    public static void resultadoNum(int nummero[]) {
        for (int i =0; i<nummero.length; i++) {
            System.out.println(nummero[i]);
        }
    }

    /**
     * ¿Qué sucede con los
     * valores de los elementos que no han sido inicializados?
     *
     * //Los elemntos que no están inicializado te ponen en valor 0
     */


}
