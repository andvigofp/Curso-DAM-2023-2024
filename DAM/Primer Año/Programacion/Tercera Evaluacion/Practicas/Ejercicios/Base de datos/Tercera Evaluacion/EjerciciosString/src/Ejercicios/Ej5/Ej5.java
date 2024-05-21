package Ejercicios.Ej5;

import Ejercicios.Ej4.MEj4;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Declarar e inicializar una cadena de caracteres. El programa debe pedir al usuario que
 * introduzca una posición (un número entero) y debe devolver el carácter situado en dicha
 * posición de la cadena de caracteres definida anteriormente. Si la posición introducida no
 * corresponde a ninguna letra debe indicarlo. Se sale del programa cuando el usuario mete una
 * posición que no existe en la cadena.
 */
public class Ej5 {
    public static void main(String[] args) throws InputMismatchException{
        //Salida por teclado
        Scanner teclado = new Scanner(System.in);

        //Declarar e  inicializar una cadena de caracteres
        String cadena= MEj5.solicitarCadena(teclado);

        //Se repite el bucle mientras se cumpla
        try {
            while (true) {
                MEj5.verificarPosicionMostar(teclado,cadena);
            }
        }catch (InputMismatchException e) {
            System.out.println("No se puede poner una letra " + e.getMessage());

        }finally {
            System.out.println("Siempre se inicia la excepción, es opcional");
        }

    }
}
