package Ejercicios.Ejercicio10;

import java.util.Scanner;

public class Ejercicio10If {
    /**
     *Escribe un programa que nos diga el horóscopo a partir del día y el mes de
     * nacimiento.
     */
    public static void main(String[] args) {
        //Salida por teclado
        Scanner teclado = new Scanner(System.in);
        //Variable tipo entero
        int dia, mes;
        //Variable tipo string
        String continuar, horoscopo;
        //Bucle do while se repite mientras se cumpla, sale cuando la condición sea falso
        do {
            //Inicio
            //Imprima por pantalla
            System.out.print("Introduce el día de nacimiento: ");
            //Leer por teclado
            dia = teclado.nextInt();
            //Imprima por teclao
            System.out.print("Introduce el mes de nacimiento (en número): ");
            //Leer por teclado
            mes = teclado.nextInt();
            //Para coger los métodos de una funcón, hacer las operaciones
            horoscopo = determinarHoroscopo(dia, mes);
            //Imprima el resultado
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
        //Funcíon para saber cuál es Horóscopo por mes y día correspondiente, condición del Sí
    private static String determinarHoroscopo(int dia, int mes) {
        String horoscopo = "";

        if ((mes == 1 && dia >= 21) || (mes == 2 && dia <= 19)) {
            horoscopo = "Acuario";
        } else if ((mes == 2 && dia >= 20) || (mes == 3 && dia <= 20)) {
            horoscopo = "Piscis";
        } else if ((mes == 3 && dia >= 21) || (mes == 4 && dia <= 20)) {
            horoscopo = "Aries";
        } else if ((mes == 4 && dia >= 21) || (mes == 5 && dia <= 21)) {
            horoscopo = "Tauro";
        } else if ((mes == 5 && dia >= 22) || (mes == 6 && dia <= 21)) {
            horoscopo = "Géminis";
        } else if ((mes == 6 && dia >= 22) || (mes == 7 && dia <= 22)) {
            horoscopo = "Cáncer";
        } else if ((mes == 7 && dia >= 23) || (mes == 8 && dia <= 23)) {
            horoscopo = "Leo";
        } else if ((mes == 8 && dia >= 24) || (mes == 9 && dia <= 23)) {
            horoscopo = "Virgo";
        } else if ((mes == 9 && dia >= 24) || (mes == 10 && dia <= 23)) {
            horoscopo = "Libra";
        } else if ((mes == 10 && dia >= 24) || (mes == 11 && dia <= 22)) {
            horoscopo = "Escorpio";
        } else if ((mes == 11 && dia >= 23) || (mes == 12 && dia <= 21)) {
            horoscopo = "Sagitario";
        } else if ((mes == 12 && dia >= 22) || (mes == 1 && dia <= 20)) {
            horoscopo = "Capricornio";
        } else {
            horoscopo = "Fecha no válida";
        }

        return horoscopo;
    }
}

