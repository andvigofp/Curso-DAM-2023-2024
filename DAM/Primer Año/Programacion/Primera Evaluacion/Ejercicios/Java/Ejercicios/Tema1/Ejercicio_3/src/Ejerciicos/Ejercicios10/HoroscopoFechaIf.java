package Ejerciicos.Ejercicios10;

import java.util.Scanner;

public class HoroscopoFechaIf {
    /**
     *Escribe un programa que nos diga el horóscopo a partir del día y el mes de
     * nacimiento.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //variables
        int dia, mes;
        // Solicitar día y mes de nacimiento al usuario
        System.out.print("Introduce el día de nacimiento: ");
        dia = scanner.nextInt();

        System.out.print("Introduce el mes de nacimiento (en número): ");
        mes = scanner.nextInt();

        // Verificar el mes y el día para determinar el horóscopo
        if ((mes == 3 && dia >= 21) || (mes == 4 && dia <= 19)) {
            System.out.println("Aries");
        } else if ((mes == 4 && dia >= 20) || (mes == 5 && dia <= 20)) {
            System.out.println("Tauro");
        } else if ((mes == 5 && dia >= 21) || (mes == 6 && dia <= 20)) {
            System.out.println("Géminis");
        } else if ((mes == 6 && dia >= 21) || (mes == 7 && dia <= 22)) {
            System.out.println("Cáncer");
        } else if ((mes == 7 && dia >= 23) || (mes == 8 && dia <= 22)) {
            System.out.println("Leo");
        } else if ((mes == 8 && dia >= 23) || (mes == 9 && dia <= 22)) {
            System.out.println("Virgo");
        } else if ((mes == 9 && dia >= 23) || (mes == 10 && dia <= 22)) {
            System.out.println("Libra");
        } else if ((mes == 10 && dia >= 23) || (mes == 11 && dia <= 21)) {
            System.out.println("Escorpio");
        } else if ((mes == 11 && dia >= 22) || (mes == 12 && dia <= 21)) {
            System.out.println("Sagitario");
        } else if ((mes == 12 && dia >= 22) || (mes == 1 && dia <= 19)) {
            System.out.println("Capricornio");
        } else if ((mes == 1 && dia >= 20) || (mes == 2 && dia <= 18)) {
            System.out.println("Acuario");
        } else if ((mes == 2 && dia >= 19) || (mes == 3 && dia <= 20)) {
            System.out.println("Piscis");
        } else {
            System.out.println("Fecha de nacimiento no válida.");
        }
    }
}

