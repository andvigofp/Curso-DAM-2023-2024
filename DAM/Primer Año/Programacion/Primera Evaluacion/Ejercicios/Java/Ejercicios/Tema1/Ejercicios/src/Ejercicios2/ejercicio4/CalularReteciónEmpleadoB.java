package Ejercicios2.ejercicio4;

import java.util.Scanner;

public class CalularReteciónEmpleadoB {
    public static void RetecionEmpleadoB() {
        /**
         * Escribir un pseucódigo que calcule lo que tiene que cobrar un empleado sabiendo que se le tiene que
         * aplicar al sueldo una reteción del 20%
         */
        //Variables tipo double
        double sueldoBruto, retecion, sueldoNeto;
        //Salida por teclado
        Scanner teclado = new Scanner(System.in);
        //utilizamos el bucle Do while y se repite el ciclo hasta que pulsemos 0 para salir
        //Inicio
        do {
            System.out.println("Introduzca el sueldo bruto del empleado (Pulsa 0 para salir): ");
            sueldoBruto = teclado.nextDouble();
            if (sueldoBruto !=0) {
                //Operaciones para poder calcular la reteción del sueldo un 20%
                 retecion = 0.20;
                 sueldoNeto = sueldoBruto - (sueldoBruto * retecion);
                System.out.println("El sueldo neto del empleado despúes de la retención del 20% es: Euros " + sueldoNeto);
            }
        }while (sueldoBruto !=0);
        System.out.println("A saldio correctamente");
        teclado.close();
    }
    //Fin

    public static void main(String[] args) {
        //Para iniar la funcion del subprocesio
        RetecionEmpleadoB();
    }
}
