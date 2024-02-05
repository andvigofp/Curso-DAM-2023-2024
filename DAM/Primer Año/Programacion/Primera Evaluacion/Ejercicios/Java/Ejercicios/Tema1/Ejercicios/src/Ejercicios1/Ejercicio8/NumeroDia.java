package Ejercicios1.Ejercicio8;

import java.util.Scanner;

public class NumeroDia {
    public static void main(String[] args) {
        /**
         * Pedir un número al usuario y mostrar el nombre del día al que corresponde (1=lunes)
         */
        //Variable tipo enetero
        int numero1;
        //Salido por teclado
        Scanner teclado =  new Scanner(System.in);
        //Inicio
        System.out.println("Ingresa un número (1-7) para obtener el nombre de día");
        numero1 = teclado.nextInt();
        //Variable tipo cadena (caracteres)
        String diaSemana;
        //Utilizamos la condición switch para evaluar cada caso para el número de los días del 1, hasta el 7
        switch (numero1) {
            case 1:
                diaSemana = "Lunes";
                break;
            case 2:
                diaSemana = "Martes";
                break;
            case 3:
                diaSemana = "Miercoles";
                break;
            case 4:
                diaSemana = "Jueves";
                break;
            case 5:
                diaSemana = "Viernes";
                break;
            case 6:
                diaSemana = "Sabado";
                break;
            case 7:
                diaSemana = "Domingo";
                break;
            default:
                diaSemana = "Error número fuera de rango";

        }
        System.out.println("El número: " + numero1 + " corresponde a: " + diaSemana);
        teclado.close();
        //Fin
    }
}
