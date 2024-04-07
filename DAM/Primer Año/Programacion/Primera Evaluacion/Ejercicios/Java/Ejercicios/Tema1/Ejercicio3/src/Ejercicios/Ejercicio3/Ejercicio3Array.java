package Ejercicios.Ejercicio3;

import java.util.Scanner;

public class Ejercicio3Array {
    /**
     * Escribe un programa en que dado un número del 1 a 7 escriba el correspondiente
     * nombre del día de la semana.
     */
    public static void main(String[] args) {
        //Salido por teclado
        Scanner teclado = new Scanner(System.in);
        //Array de tipo String, va de la posición del 0 al 6
        String[] diasSemana = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"};
        //Variable tipo String(Caracter)
        String continuar, nombreDia;
        //Variable tipo Entero
        int numeroDia;
        //Bucle do while se repite mientras se cumpla, sale cuando la condición sea falso
        do {
            //Inicio

            //Imprime por pantalla
            System.out.print("Por favor, introduce un número del 1 al 7:");
            //Leer por pantalla
            numeroDia = teclado.nextInt();
            //Condición del si se cumple una de las condiciones, si no va a la siguiente condición
            if (numeroDia >= 1 && numeroDia <= 7) {
                nombreDia = diasSemana[numeroDia - 1];  // Restamos 1 para acceder al índice correcto del array
                //Imprime el resultado
                System.out.println("El número " + numeroDia + " corresponde a " + nombreDia + ".");
            } else {
                //Imprime el resultado
                System.out.println("Número no válido. Debe ser un número del 1 al 7.");
            }
            //Imprime por pantalla
            System.out.print("Pulsa 0 para salir o pulse otra tecla continuar: ");
            //Leer por teclado
            continuar = teclado.next();
            //Utilzamos .equals para compación, para cuando pulsemos 0 salga por teclado
        } while (!continuar.equals("0"));
        //Imprime por pantalla
        System.out.println("A salido correctamente");
        //Fin
    }
}

