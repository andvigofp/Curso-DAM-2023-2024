package Ejerciicos.Ejercicios10;

import java.util.Scanner;

public class HoroscopoFechaSwich {
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

        // Utilizar switch con rangos para determinar el horóscopo
        switch (mes) {
            case 3:
                if (dia >= 21) {
                    System.out.println("Aries");
                } else {
                    System.out.println("Piscis");
                }
                break;
            case 4:
                if (dia >= 20) {
                    System.out.println("Tauro");
                } else {
                    System.out.println("Aries");
                }
                break;
            case 5:
                if (dia >= 21) {
                    System.out.println("Géminis");
                } else {
                    System.out.println("Tauro");
                }
                break;
            case 6:
                if (dia >= 21) {
                    System.out.println("Cáncer");
                } else {
                    System.out.println("Géminis");
                }
                break;
            case 7:
                if (dia >= 23) {
                    System.out.println("Leo");
                } else {
                    System.out.println("Cáncer");
                }
                break;
            case 8:
                if (dia >= 23) {
                    System.out.println("Virgo");
                } else {
                    System.out.println("Leo");
                }
                break;
            case 9:
                if (dia >= 23) {
                    System.out.println("Libra");
                } else {
                    System.out.println("Virgo");
                }
                break;
            case 10:
                if (dia >= 23) {
                    System.out.println("Escorpio");
                } else {
                    System.out.println("Libra");
                }
                break;
            case 11:
                if (dia >= 22) {
                    System.out.println("Sagitario");
                } else {
                    System.out.println("Escorpio");
                }
                break;
            case 12:
                if (dia >= 22) {
                    System.out.println("Capricornio");
                } else {
                    System.out.println("Sagitario");
                }
                break;
            case 1:
                if (dia >= 20) {
                    System.out.println("Acuario");
                } else {
                    System.out.println("Capricornio");
                }
                break;
            case 2:
                if (dia >= 19) {
                    System.out.println("Piscis");
                } else {
                    System.out.println("Acuario");
                }
                break;
            default:
                System.out.println("Fecha de nacimiento no válida.");
                break;
        }
    }
}