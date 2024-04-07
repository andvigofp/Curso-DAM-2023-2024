package Ejercicios.Ejercicio6;

import java.util.Scanner;

import java.util.Scanner;

public class Ejercicio6Switch {
    /**
     *Realiza un programa que calcule el tiempo que tardará en caer un objeto desde una
     * altura h. Aplica la fórmula t = √2h g siendo g = 9.81m/s 2
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        //Variable tipo double
        double g = 9.81; // Aceleración debido a la gravedad en m/s^2
        //Variable tipo String
        String continuar;
        //Bucle do while se repite mientras se cumpla, sale cuando la condición sea falso
        do {
            //incio
            //Imprime por pantalla
            //Menú de opciones
            System.out.println("Seleccione una opción:");
            System.out.println("1. Calcular el tiempo de caída desde una altura de 10 metros.");
            System.out.println("2. Calcular el tiempo de caída desde una altura de 20 metros.");
            System.out.println("3. Calcular el tiempo de caída desde una altura de 30 metros.");
            System.out.print("Opción: ");
            int seleccion = teclado.nextInt();
            //Condición del Swich, va caso por caso, si se cumple uno de los casos salé imprime el resultado por pantalla
            switch (seleccion) {
                case 1:
                    calcularTiempoCaida(10, g);
                    break;
                case 2:
                    calcularTiempoCaida(20, g);
                    break;
                case 3:
                    calcularTiempoCaida(30, g);
                    break;
                case 0:
                    System.out.println("Saliendo del programa.");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
            //imprima por pantalla
            System.out.print("Pulsa 0 para salir o pulse otra tecla para continuar: ");
           //Leer por teclado
            continuar = teclado.next();
            //Utilzamos .equals para compación, para cuando pulsemos 0 salga por teclado
        } while (!continuar.equals("0"));
        System.out.println("A salido correctamente");
        //Fin
    }
    //Método para calcular el tiempo de caida
    private static void calcularTiempoCaida(double altura, double g) {
        double tiempo = Math.sqrt((2 * altura) / g);
        System.out.println("El tiempo de caída desde una altura de " + altura + " metros es de " + tiempo + " segundos.");
    }
}
