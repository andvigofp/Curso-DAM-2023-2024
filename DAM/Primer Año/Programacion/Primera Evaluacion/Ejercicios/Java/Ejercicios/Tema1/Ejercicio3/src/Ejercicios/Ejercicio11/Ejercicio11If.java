package Ejercicios.Ejercicio11;

import java.util.Scanner;

public class Ejercicio11If {
    /**
     *Escribe un programa que dada una hora determinada (horas y minutos), calcule los
     * segundos que faltan para llegar a la medianoche.
     */
    public static void main(String[] args) {
        //Salida por teclado
        Scanner teclado = new Scanner(System.in);
        int horas, minutos, segundosHastaMedianoche;
        //Imprima por pantalla
        String continuar;
        //Bucle do while se repite mientras se cumpla, sale cuando la condición sea falso
        do {
            //Inicio
            //Imprima por pantalla
            System.out.print("Introduce la hora (0-23): ");
            //Leer por teclado
            horas = teclado.nextInt();
            //Imprima por pantalla
            System.out.print("Introduce los minutos (0-59): ");
            //Leer por teclado
            minutos = teclado.nextInt();
            //Para coger los métodos de una funcón, hacer las operaciones
            segundosHastaMedianoche = calcularSegundosHastaMedianoche(horas, minutos);
            //Imprima el resultado
            System.out.println("Faltan " + segundosHastaMedianoche + " segundos para llegar a medianoche.");
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
    //Función para calcular los segundos por hora, minutos hasta medianote, con la condición del Sí
    private static int calcularSegundosHastaMedianoche(int horas, int minutos) {
        if (horas >= 0 && horas <= 23 && minutos >= 0 && minutos <= 59) {
            int segundosEnUnaHora = 3600;
            int segundosEnUnMinuto = 60;
            int segundosHastaMedianoche = (24 - horas) * segundosEnUnaHora - minutos * segundosEnUnMinuto;
            return segundosHastaMedianoche;
        } else {
            System.out.println("Hora o minutos no válidos. Deben estar en el rango 0-23 para horas y 0-59 para minutos.");
            return 0; // Valor predeterminado en caso de entrada no válida
        }
    }
}

