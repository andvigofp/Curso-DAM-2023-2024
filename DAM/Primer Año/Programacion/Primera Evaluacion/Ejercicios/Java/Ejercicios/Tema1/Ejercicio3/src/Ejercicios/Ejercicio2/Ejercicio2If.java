package Ejercicios.Ejercicio2;

import java.util.Scanner;

public class  Ejercicio2If{
    /**
     * Realiza un programa que pida una hora por teclado y que muestre luego buenos
     * días, buenas tardes o buenas noches según la hora. Se utilizarán los tramos de 6 a
     * 12, de 13 a 20 y de 21 a 5. respectivamente. Sólo se tienen en cuenta las horas, los
     * minutos no se deben introducir por teclado.
     *
     */
    public static void main(String[] args) {
            //Salida por pantalla
            Scanner teclado = new Scanner(System.in);
            //Variable tipo entero
            int hora;
            //Variable tipo String(Carácter)
            String continuar, saludo;
            //Bucle do while se repite mientras se cumpla, sale cuando la condición sea falso
            do {
                //Fin

                //Imprime por pantalla
                System.out.print("Por favor, introduce la hora (solo la parte de la hora, sin minutos): ");
                //Leer por teclado
                hora = teclado.nextInt();
                //Condición del si se cumple una de las condiciones, si no va a la siguiente condición
                //Operaciones
                if (hora >= 6 && hora <= 12) {
                    saludo ="Buenos días";
                } else if (hora >= 13 && hora <= 20) {
                    saludo ="Buenas tardes";
                } else {
                    saludo ="Buenas noches";
                }

                System.out.println("Los saludos por hora son: " + saludo);
                //Imprime por pantalla
                System.out.print("Pulsa 0 para salir o pulse una hora para continuar: ");
                //Leer por teclado
                continuar = teclado.next();
                //Utilzamos .equals para compación, para cuando pulsemos 0 salga por teclado
            } while (!continuar.equals("0"));
            //Imprime por pantalla
        System.out.println("Ha salido correctamente");
        //Fin
        }
    }
