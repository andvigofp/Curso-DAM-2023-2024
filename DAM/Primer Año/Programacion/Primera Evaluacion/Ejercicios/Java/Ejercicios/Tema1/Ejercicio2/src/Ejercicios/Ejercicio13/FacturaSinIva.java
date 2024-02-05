package Ejercicios.Ejercicio13;

import java.util.Scanner;

public class FacturaSinIva {
    public static void main(String[] args) {
        /**
         * Escribe un programa que calcule el total de una factura a partir de la base
         * imponible (precio sin IVA). La base imponible estará almacenada en una variable.
         */
        //Guardamos la tasa del iva en una variable 0.21%
        var tasaIva = 0.21;
        //Variables tipo double
        double baseImponible, importeIva, totalFactura;
        //Salida por tecaldo
        Scanner teclado = new Scanner(System.in);
        //Bucle Do While se repite hasta que pulsemos 0 para salir
        do {
            //Imprime por pantalla
            //Inicio
            System.out.println("Ingrese una cantidad (Sin iva) o ingrese 0 para salir");
            //Leer por teclado
            baseImponible = teclado.nextDouble();
            if (baseImponible == 0) {
                //Imprime por pantalla
                System.out.println("A salido correctamente");
                break;
            }
            //Operaciones para calcular el precio y que den el importe del iva
            importeIva = baseImponible * tasaIva;
            //Para que calcule el total del importe a pagar
            totalFactura = baseImponible + importeIva;
            //Imprime por pantalla el resultado por pantalla
            System.out.println("Base Imponible: " + baseImponible + " euros");
            //Imprime por pantalla el resultado por pantalla
            System.out.println("Importe del Iva (" + (tasaIva * 100) + "%: " + importeIva + " euros");
            //Imprime por pantalla el resultado por pantalla
            System.out.println("Total de la factura: " + totalFactura + " euros");
        }while (true);
        //Fin

    }
}
