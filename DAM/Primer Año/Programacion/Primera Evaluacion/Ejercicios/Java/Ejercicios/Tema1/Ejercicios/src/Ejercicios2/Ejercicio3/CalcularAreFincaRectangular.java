package Ejercicios2.Ejercicio3;

import java.util.Scanner;

public class CalcularAreFincaRectangular {
    public static void AreaFincaRectangular() {
        /**
         * Escricribir un pseucódigo que calcule una finca rectangular en metros cuadrados, así
         * como su perímetro exterior, tambíen en metros
         */
        //Variable tipo double
        double longitudMayor, longitudMenor, area, perimetro;
        //Salida por teclado
        Scanner teclado = new Scanner(System.in);
        //Utilizamos el bucle Do While para que recorra el bucle, solo salgamos cuando pulsemos 0 para salir
        //Inicio
        do {
            System.out.println("Ingrese la longitud lado mayor (en metros), (Pulsa 0 para salir): ");
            longitudMayor = teclado.nextDouble();
            if (longitudMayor!=0) {
                System.out.println("Imgrese la longitud del lado menor (en metros): ");
                longitudMenor = teclado.nextDouble();
                    //Operaciones para cancular ela aréa de una finca rectangular y su perímetro exterior
                    area = longitudMayor * longitudMenor;
                    perimetro = 2 * (longitudMayor * longitudMenor);
                System.out.println("El área de la finca rectangular es: " + area + " metros cuadrados");
                System.out.println("El perímetro de la finca rectangular es: " + perimetro + " mtetros");
            }
        }while (longitudMayor!=0);
        System.out.println("A salido correctamente");
        teclado.close();
    }
    //Fin

    public static void main(String[] args) {
        //Para iniar la funcion del subprocesio
        AreaFincaRectangular();
    }

}
