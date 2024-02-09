package Ejercicios.Ejercicio8;

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
        String meses[] = { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
        int temperaraturasMeses [] = new int[12];
        int temperaturas = temperaraturasMeses.length;



        //Pedimos al usuario que ingrese la temperatura media de cada mes
        for (int i=0; i <temperaturas; i++) {
            System.out.println("Ingresa la temepratura media del mes "  + meses[i] + ": ");
            temperaraturasMeses[i] = teclado.nextInt();
        }



        //Mostramos el diagrama barras horinzotales
        for (int i =0; i<temperaturas; i++) {
            System.out.print(meses[i] + " "  + ": ");
            for (int j =0; j < temperaraturasMeses[i]; j++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }
}