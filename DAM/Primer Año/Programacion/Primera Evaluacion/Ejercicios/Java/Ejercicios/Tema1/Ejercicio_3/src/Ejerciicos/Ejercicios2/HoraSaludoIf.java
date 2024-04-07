package Ejerciicos.Ejercicios2;

import java.util.Scanner;

public class HoraSaludoIf {
    /**
     * Realiza un programa que pida una hora por teclado y que muestre luego buenos
     * días, buenas tardes o buenas noches según la hora. Se utilizarán los tramos de 6 a
     * 12, de 13 a 20 y de 21 a 5. respectivamente. Sólo se tienen en cuenta las horas, los
     * minutos no se deben introducir por teclado.
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        //Variables tipo entero y String
        int hora;
        String saludo = "";
        //Imprime por pantalla
        //Iincio
        System.out.println("Por favor, introduce una hora: ");
        //Leer por pantalla
        hora = teclado.nextInt();
        //Condición del if
        if (hora >= 6 && hora <= 12) {
            saludo = "Buenos días";
        } else if (hora >= 13 && hora <= 20) {
            saludo = "Buenas tardes";
        } else if ((hora >= 21 && hora <= 24) || (hora >= 1 && hora <= 5)) {
            saludo = "Buenas noches";
        } else {
            saludo = "Datos no válidos";
        }
        System.out.println("Los saludos por hora son: " + saludo);
        //Fin
    }
}

    
