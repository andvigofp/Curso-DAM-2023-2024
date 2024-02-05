package Ejerciicos.Ejercicios11;

import java.util.Scanner;

public class HoraMinutosSegundosIf {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            //Variables
            int horas, minutos, segundosActuales, segundosHastaMedianoche;
            // Solicitar la hora y minutos al usuario
            System.out.print("Introduce la hora (formato de 24 horas): ");
            horas = scanner.nextInt();

            System.out.print("Introduce los minutos: ");
            minutos = scanner.nextInt();

            // Verificar que la hora y los minutos estén en rangos válidos
            if (horas >= 0 && horas <= 23 && minutos >= 0 && minutos <= 59) {
                // Calcular los segundos hasta la medianoche
                segundosActuales = horas * 3600 + minutos * 60;
                segundosHastaMedianoche = 86400 - segundosActuales;

                // Mostrar el resultado
                System.out.println("Segundos hasta medianoche: " + segundosHastaMedianoche + " segundos.");
            } else {
                System.out.println("Hora o minutos no válidos. Por favor, introduce valores en rangos válidos.");
            }
        }
    }

