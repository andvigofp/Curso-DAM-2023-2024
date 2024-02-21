package CalculadoraV2;

import javax.print.DocFlavor;
import java.util.Scanner;

public class Menu {
    static void menu() { //Función Menú de opciones
        Scanner teclado = new Scanner(System.in);
        int num1=0, num2=0,opc;

        do {

            Funciones.opciones();
            opc = teclado.nextInt();
            if ( opc>0 && opc<6) { //Se cumple mientras que sea un número mayor a 0 hasta número 5

            }
            switch (opc) {
                case 1:
                    num1 = Funciones.pedir("Dame número 1");
                    num2 = Funciones.pedir("Dame número 2");
                    Funciones.mostar("Sumar ", Funciones.sumar(num1, num2));
                    break;
                case 2:
                    num1 = Funciones.pedir("Dame número 1");
                    num2 = Funciones.pedir("Dame número 2");
                    Funciones.mostar("Restar ", Funciones.resta(num1, num2));
                    break;
                case 3:
                    num1 = Funciones.pedir("Dame número 1");
                    num2 = Funciones.pedir("Dame número 2");
                    Funciones.mostar("Multiplicar ", Funciones.multiplicar(num1, num2));
                    break;
                case 4:
                    num1 = Funciones.pedir("Dame número 1");
                    num2 = Funciones.pedir("Dame número 2");
                    Funciones.mostar("Dividir ", Funciones.dividir(num1, num2));
                    break;
                case 5:
                    num1 = Funciones.pedir("Dame número 1");
                    Funciones.mostar("RaizCuadrada ", Funciones.raizCuadrada(num1));
                    break;
                case 6:
                        System.out.println("A salido correctamente");
                    break;
                default:
                    System.out.println("Error, tienes que elegir una de las opciones entre 1 y 5");
            }
        }while (opc !=6);

    }
}
