package Ejercicios.Ejercicio3;

import java.util.Scanner;

public class Ejercicio3If {
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
        //Bucle do while se repite mientras se cumpla, sale cuando la condición sea falso
        do {
            //Imprime por pantalla
            System.out.print("Por favor, introduce un número del 1 al 7: ");
            //Leer por pantalla
            numeroDia = teclado.nextInt();
            //Dejamos ela variable vacío
            nombreDia = "";
            //Condición del si se cumple una de las condiciones, si no va a la siguiente condición
            if (numeroDia == 1) {
                nombreDia = "Lunes";
            } else if (numeroDia == 2) {
                nombreDia = "Martes";
            } else if (numeroDia == 3) {
                nombreDia = "Miércoles";
            } else if (numeroDia == 4) {
                nombreDia = "Jueves";
            } else if (numeroDia == 5) {
                nombreDia = "Viernes";
            } else if (numeroDia == 6) {
                nombreDia = "Sábado";
            } else if (numeroDia == 7) {
                nombreDia = "Domingo";
            } else {
                //imprime por pantalla
                System.out.println("Número no válido. Debe ser un número del 1 al 7.");
                break;
            }
            //Imprime por pantala el resultado
            System.out.println("El número " + numeroDia + " corresponde a " + nombreDia + ".");
            //Imprime por pantalla
            System.out.print("Pulsa 0 para salir o pulse otra tecla para continuar: ");
            //Leer por pantalla
            continuar = teclado.next();
            //Utilzamos .equals para compación, para cuando pulsemos 0 salga por teclado
        }while (!continuar.equals("0"));
        //Imprime por pantalla
        System.out.println("A salido correctamente");
        //Fin
    }
}

