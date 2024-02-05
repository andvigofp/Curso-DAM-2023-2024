package Ejercicios.Ejercicio10;

import java.util.Scanner;

public class Ejercicio10Switch {
    /**
     *Escribe un programa que nos diga el horóscopo a partir del día y el mes de
     * nacimiento.
     */
    public static void main(String[] args) {
        //Salida por teclado
        Scanner teclado = new Scanner(System.in);
        //Variable tipo entero
        int dia,mes;
        //Variable tipo string
        String continuar, horoscopo;
        //Bucle do while se repite mientras se cumpla, sale cuando la condición sea falso
        do {
            //Inciio
            //Imprima por pantalla
            System.out.print("Introduce el día de nacimiento: ");
            //Leer por teclado
            dia = teclado.nextInt();
            //Imprima por pantalla
            System.out.print("Introduce el mes de nacimiento (en número): ");
            //Leer por teclado
            mes = teclado.nextInt();
            //Para coger los métodos de una funcón, hacer las operaciones
            horoscopo = determinarHoroscopo(dia, mes);
            //Imprimir el resultado
            System.out.println("Tu horóscopo es: " + horoscopo);
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
    //Funcíon para saber cuál es Horóscopo por mes y día correspondiente, condición del Swich por cada caso
    private static String determinarHoroscopo(int dia, int mes) {
        String horoscopo = "";
        switch (mes) {
            case 1:
                if (dia >= 21) {
                    horoscopo = "Acuario";
                } else {
                    horoscopo = "Capricornio";
                }
                break;
            case 2:
                if (dia >= 20) {
                    horoscopo = "Piscis";
                } else {
                    horoscopo = "Acuario";
                }
                break;
            case 3:
                if (dia >= 21) {
                    horoscopo = "Aries";
                } else {
                    horoscopo = "Piscis";
                }
                break;
            case 4:
                if (dia >= 21) {
                    horoscopo = "Tauro";
                } else {
                    horoscopo = "Aries";
                }
                break;
            case 5:
                if (dia >= 22) {
                    horoscopo = "Géminis";
                } else {
                    horoscopo = "Tauro";
                }
                break;
            case 6:
                if (dia >= 22) {
                    horoscopo = "Cáncer";
                } else {
                    horoscopo = "Géminis";
                }
                break;
            case 7:
                if (dia >= 23) {
                    horoscopo = "Leo";
                } else {
                    horoscopo = "Cáncer";
                }
                break;
            case 8:
                if (dia >= 24) {
                    horoscopo = "Virgo";
                } else {
                    horoscopo = "Leo";
                }
                break;
            case 9:
                if (dia >= 24) {
                    horoscopo = "Libra";
                } else {
                    horoscopo = "Virgo";
                }
                break;
            case 10:
                if (dia >= 24) {
                    horoscopo = "Escorpio";
                } else {
                    horoscopo = "Libra";
                }
                break;
            case 11:
                if (dia >= 23) {
                    horoscopo = "Sagitario";
                } else {
                    horoscopo = "Escorpio";
                }
                break;
            case 12:
                if (dia >= 22) {
                    horoscopo = "Capricornio";
                } else {
                    horoscopo = "Sagitario";
                }
                break;
            default:
                horoscopo = "Fecha no válida";
                break;
        }

        return horoscopo;
    }

}
