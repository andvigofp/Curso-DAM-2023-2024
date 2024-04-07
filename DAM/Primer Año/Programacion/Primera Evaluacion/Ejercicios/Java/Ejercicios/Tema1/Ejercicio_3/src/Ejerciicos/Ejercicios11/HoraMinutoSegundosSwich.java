package Ejerciicos.Ejercicios11;

import java.util.Scanner;

public class HoraMinutoSegundosSwich {
/**
 *Escribe un programa que dada una hora determinada (horas y minutos), calcule los
 * segundos que faltan para llegar a la medianoche.
 */
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Variables
        int horas, minutos, segundosEnUnaHora, segundosEnUnMinuto, segundosHastaMedianoche;

        // Solicitar la hora y minutos al usuario
        System.out.print("Introduce la hora (formato de 24 horas): ");
        horas = scanner.nextInt();

        System.out.print("Introduce los minutos: ");
        minutos = scanner.nextInt();

        // Utilizar switch para manejar diferentes casos basados en la hora
        switch (horas) {
            case 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23:
                segundosEnUnaHora = 3600;
                segundosEnUnMinuto = 60;
                segundosHastaMedianoche = (24 - horas) * segundosEnUnaHora - minutos * segundosEnUnMinuto;
                break;
            default:
                segundosHastaMedianoche = -1; // Valor de error para horas no válidas
                break;
        }

        // Verificar el resultado y mostrar el resultado
        if (segundosHastaMedianoche >= 0) {
            System.out.println("Segundos hasta medianoche: " + segundosHastaMedianoche + " segundos.");
        } else {
            System.out.println("Hora no válida. Por favor, introduce una hora en rango válido.");
        }
    }
}


