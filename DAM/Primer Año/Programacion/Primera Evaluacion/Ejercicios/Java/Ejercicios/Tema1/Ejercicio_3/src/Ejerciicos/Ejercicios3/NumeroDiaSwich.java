package Ejerciicos.Ejercicios3;

import java.util.Scanner;

public class NumeroDiaSwich {
    /**
     *Escribe un programa en que dado un número del 1 a 7 escriba el correspondiente
     * nombre del día de la semana.
     */
    public static void main(String[] args) {
        //Salida por teclado
        Scanner teclado = new Scanner(System.in);
        //Variable tipo String(Caracter)
        String continuar, nombreDia;
        //Variable tipo Entero
        int numeroDia;

        //Imprime por pantalla
        System.out.print("Por favor, introduce un número del 1 al 7: ");
        //Leer por pantalla
        numeroDia = teclado.nextInt();
        //Dejamos ela variable vacío
        nombreDia = "";

        switch (numeroDia) {
            case 1:
                nombreDia = "Lunes";
                break;
            case 2:
                nombreDia = "Martes";
                break;
            case 3:
                nombreDia = "Miércoles";
                break;
            case 4:
                nombreDia = "Jueves";
                break;
            case 5:
                nombreDia = "Viernes";
                break;
            case 6:
                nombreDia = "Sábado";
                break;
            case 7:
                nombreDia = "Domingo";
                break;
            default:
                //imprime por pantalla
                System.out.println("Número no válido. Debe ser un número del 1 al 7.");
                break;
        }
        //Imprime por pantalla el resultado
        System.out.println("El número " + numeroDia + " corresponde a " + nombreDia + ".");
    }
}
