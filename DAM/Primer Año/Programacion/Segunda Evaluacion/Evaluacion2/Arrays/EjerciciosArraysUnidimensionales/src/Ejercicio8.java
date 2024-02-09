import java.util.Scanner;

public class Ejercicio8 {
    /**
     * Realiza un programa que pida la temperatura media que ha hecho en cada mes de un determinado
     * año y que muestre a continuación un diagrama de barras horizontales con esos datos. Las barras del
     * diagrama se pueden dibujar a base de asteriscos o cualquier otro carácter.
     */

    public static void main(String[] args) {
       //Leer la entrada del usuario
        Scanner teclado = new Scanner(System.in);

        //Creamos un array para almacenar las temperaturas de cada mes
        int temperaturas[] = new int[12];


        //Pedimos al usuario que ingrese la temperatura media de cada mes
        for (int i=0; i <temperaturas.length; i++) {
            System.out.println("Ingresa la temepratura media del mes "  + (i + 1) + ": ");
            temperaturas[i] = teclado.nextInt();
        }

        //Mostramos el diagrama barras horinzotales
        for (int i =0; i<temperaturas.length; i++) {
            System.out.print("Mes " + (i+1) + ": ");
            for (int j =0; j < temperaturas[i]; j++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }
}