package Ejercicios.Ejercicio4;

import java.util.Scanner;

public class Ejercicio4Swich {
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
            //Variable tipo String(Caracter)
            String continuar;
            //Variable tipo entero
            int horasTrabajadas;
            //Variable tipo double
            double salario;
        //Variable tipo entero, pero con la particualida que utilizamos final, para dejar ese inicio variable fijo
        final int horasOrdinarias = 40; // Número de horas ordinarias a 12 euros por hora
        final double tarifaHoraOrdinaria = 12.0;
        final double tarifaHoraExtra = 16.0;
        //Bucle do while se repite mientras se cumpla, sale cuando la condición sea falso
        do {
            //Inicio
            //Imprime por pantalla
            System.out.print("Por favor, introduce el número de horas trabajadas esta semana: ");
            //Leer por teclado
            horasTrabajadas = teclado.nextInt();
            //Dejamos la salario como 0.0
            salario = 0.0;
            //Condición del Swich, va caso por caso, si se cumple uno de los casos salé imprime el resultado por pantalla
            switch (horasTrabajadas) {
                case 0:
                    salario = 0;
                    break;
                case 1:
                case 2:
                case 3:
                    // ... (hasta el caso 40)
                case 40:
                    //Operaciones
                    salario = horasTrabajadas * tarifaHoraOrdinaria;
                    break;
                default:
                    //Operaciones
                    salario = horasOrdinarias * tarifaHoraOrdinaria + (horasTrabajadas - horasOrdinarias) * tarifaHoraExtra;
                    break;
            }
            //Imprime el resultado por pantalla
            System.out.println("El salario semanal del trabajador es: " + salario + " euros.");
            //imprime por pantalla
            System.out.print("Pulsa 0 para salir o pulse otra tecla para continuar: ");
            //Leer por teclado
            continuar = teclado.next();
            //Utilzamos .equals para compación, para cuando pulsemos 0 salga por teclado
        } while (!continuar.equals("0"));
        //Imprime por pantalla
        System.out.println("A salido correctamente");
        //Fin
    }
}

