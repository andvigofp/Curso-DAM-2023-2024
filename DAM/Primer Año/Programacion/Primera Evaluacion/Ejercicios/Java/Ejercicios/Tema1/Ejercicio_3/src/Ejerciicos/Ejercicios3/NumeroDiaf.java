package Ejerciicos.Ejercicios3;

import java.util.Scanner;

public class NumeroDiaf {
    /**
     *Escribe un programa en que dado un número del 1 a 7 escriba el correspondiente
     * nombre del día de la semana.
     */

    public static void main(String[] args) {
        //Salida por teclado
        Scanner teclado = new Scanner(System.in);
        //Variables tipo String y entero
        String nombreDia;
        int numeroDia;
        //Imprime por pantalla
        System.out.print("Por favor, introduce un número del 1 al 7: ");
        //Leer por teclado
        numeroDia = teclado.nextInt();
        //Dejamos la varaible vácio
        nombreDia ="";
        //Cóndición del sí
        if (numeroDia == 1) {
            nombreDia = "Lunes";
        } else if (numeroDia == 2) {
            nombreDia = "Martes";
        } else if (numeroDia == 3) {
            nombreDia = "Miercoles";
        } else if (numeroDia == 4) {
            nombreDia = "Jueves";
        } else if (numeroDia == 5) {
            nombreDia = "Viernes";
        } else if (numeroDia == 6) {
            nombreDia = "Sabado";
        } else if (numeroDia == 7) {
            nombreDia = "Domingo";
        } else {
            //imprime por pantalla
            System.out.println("Número no válido. Debe ser un número del 1 al 7.");
        }
        System.out.println("El número " + numeroDia + " corresponde a " + nombreDia + ".");
    }
}
