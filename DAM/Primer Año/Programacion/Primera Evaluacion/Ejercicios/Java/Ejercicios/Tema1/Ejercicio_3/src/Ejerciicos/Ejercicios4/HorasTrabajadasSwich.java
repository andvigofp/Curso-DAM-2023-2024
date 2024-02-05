package Ejerciicos.Ejercicios4;

import java.util.Scanner;

public class HorasTrabajadasSwich {
    /**
     * Vamos a ampliar uno de los ejercicios de la relación anterior para considerar las
     * horas extras. Escribe un programa que calcule el salario semanal de un trabajador
     * teniendo en cuenta que las horas ordinarias (40 primeras horas de trabajo) se pagan
     * a 12 euros la hora. A partir de la hora 41, se pagan a 16 euros la hora.
     * Ejemplo 1:
     * Por favor, introduzca el número de horas trabajadas durante la semana: 36
     * El sueldo semanal que le corresponde es de 432 euros
     * Ejemplo 2:
     * Por favor, introduzca el número de horas trabajadas durante la semana: 40
     * El sueldo semanal que le corresponde es de 480 euros
     * Ejemplo 3:
     * Por favor, introduzca el número de horas trabajadas durante la semana: 55
     * El sueldo semanal que le corresponde es de 720 euros.
     */
    public static void main(String[] args) {
        //Salida por teclado
        Scanner teclado = new Scanner(System.in);
        //Variable tipo Entero
        int horasTrabajadas;
        //Variable tipo Double
        double salario;
        //Inicializamos la variable
        salario = 0.0;
        //Operaciones
        final int horasOrdinarias = 40; // Número de horas ordinarias a 12 euros por hora
        final double tarifaHoraOrdinaria = 12.0;
        final double tarifaHoraExtra = 16.0;
        //Imprime por pantalla
        //inicio
        System.out.println("\"Por favor, introduce el número de horas trabajadas esta semana: \");");
        //Leer por teclado
        horasTrabajadas = teclado.nextInt();
        //Condición del swich
        switch (horasTrabajadas) {
            case 0:
                salario = 0;
                break;
            case 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40:
                //Operaciones
                salario = horasTrabajadas * tarifaHoraOrdinaria;
                break;
            default:
                //Operaciones
                salario = horasOrdinarias * tarifaHoraOrdinaria + (horasTrabajadas - horasOrdinarias) * tarifaHoraExtra;
                break;
        }
        System.out.println("El salario semanal del trabajador es: " + salario + " euros.");
    }
    //Fin
}
