package Ejerciicos.Ejercicios2;

import java.util.Scanner;

public class HoraSaludoSwich {
    /**
     * Realiza un programa que pida una hora por teclado y que muestre luego buenos
     * días, buenas tardes o buenas noches según la hora. Se utilizarán los tramos de 6 a
     * 12, de 13 a 20 y de 21 a 5. respectivamente. Sólo se tienen en cuenta las horas, los
     * minutos no se deben introducir por teclado.
     */
    public static void main(String[] args) {
        //Salida por teclado
        Scanner teclado = new Scanner(System.in);
        //variables tipo entero y String
        int hora;
        String saludo;
        //Imprime por pantalla
        //Inicio
        System.out.print("Por favor, introduce la hora: ");
        //Leer por teclado
        hora = teclado.nextInt();
        //Condición del swich, va caso por caso
        switch (hora) {
            case 6,7,8,9,10,11,12:
                saludo = "Buenos días";
                break;
            case 13,14,15,16,17,18,19,20:
                saludo = "Buenas tardes";
                break;
            case 21,22,1,2,3,4,5:
                saludo = "Buenas noches";
                break;
            default:
                saludo = "Datos no válidos";
                break;
        }
        System.out.println("Los saludos por hora son: " + saludo);
    }
    //Fin
}
