package Ejercicios.Ejercicio16;

import java.util.Scanner;

public class SalarioSemanalEmpleado {
    public static void main(String[] args) {
        /**
         * Escribe un programa que calcule el salario semanal de un empleado en base a las
         * horas trabajadas, a razón de 12 euros la hora
         */
        //Variable tipo entero
        int horasTrabajo;
        //Variable tipo double
        double tarifaHora, salarioSemanal;
            //Para dejar fijo las 12€ a la hora
            tarifaHora = 12;
        //Salida por teclado
        Scanner teclado = new Scanner(System.in);
        //Inicio
        do {
            System.out.println("Ingrese las horas trabajadas o pulse 0 para salir: ");
            //Leer por teclado
            horasTrabajo = teclado.nextInt();
            //La condición del si (horasTrabajo==0), es cuando pulsemos 0 para poder salir
            if (horasTrabajo == 0) {
                //Imprime por panatalla
                System.out.println("Salió correctamente");
                break;
            }
                //Operación para calcular el salarioSemal de un empleado
                salarioSemanal = horasTrabajo * tarifaHora;
            //Imprime por pantalla el resultado por pantalla
            System.out.println("El salario semanal es de: " + salarioSemanal + " euros");
        }while (true);
        //Fin
    }
}
