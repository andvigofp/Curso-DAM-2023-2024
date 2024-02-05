package Ejercicios.Ejercicio11;

import java.util.Scanner;

public class Ejercicio11Switch {
    /**
     *Escribe un programa que dada una hora determinada (horas y minutos), calcule los
     * segundos que faltan para llegar a la medianoche.
     */
    public static void main(String[] args) {
        //Imprima por pantalla
        Scanner teclado = new Scanner(System.in);
        //Variable tipo entero
        int zonaHoraria, segundosHastaMedianoche;
        //Variable tipo Strin
        String continuar;
        //Bucle do while se repite mientras se cumpla, sale cuando la condición sea falso
        do {
            //Inicio
            //Imprima por pantalla
            //Menú de opciones
            System.out.print("Selecciona una zona horaria (1-4):\n" +
                    "1. GMT\n" +
                    "2. UTC-3\n" +
                    "3. CET\n" +
                    "4. PST\n" +
                    "Introduce el número de la zona horaria: ");
            //Leer por teclado
            zonaHoraria = teclado.nextInt();
            //Para coger los métodos de una funcón, hacer las operaciones
            segundosHastaMedianoche = calcularSegundosHastaMedianoche(zonaHoraria);
            //Imprima el resultado
            System.out.println("Faltan " + segundosHastaMedianoche + " segundos para llegar a medianoche en la zona horaria seleccionada.");
            //Imprima por pantalla
            System.out.print("Pulsa 0 para salir o pulse otra tecla para continuar: ");
            //Leer por teclado
            continuar = teclado.next();
            //Utilzamos .equals para compación, para cuando pulsemos 0 salga por teclado
        } while (!continuar.equals("0"));
        //Imprima por pantalla
        System.out.println("A salido correctamente.");
        //Fin
    }
    //Función para calcular los segundos por hora, minutos hasta medianote, con la condición del Swich
    private static int calcularSegundosHastaMedianoche(int zonaHoraria) {
        int segundosHastaMedianoche = 0;

        switch (zonaHoraria) {
            case 1: // GMT
                segundosHastaMedianoche = 0; // Medianoche en GMT
                break;
            case 2: // UTC-3
                segundosHastaMedianoche = 10800; // 3 horas hasta medianoche en UTC-3
                break;
            case 3: // CET
                segundosHastaMedianoche = 7200; // 2 horas hasta medianoche en CET
                break;
            case 4: // PST
                segundosHastaMedianoche = 43200; // 12 horas hasta medianoche en PST
                break;
            default:
                System.out.println("Zona horaria no válida.");
                break;
        }

        return segundosHastaMedianoche;
    }
}

