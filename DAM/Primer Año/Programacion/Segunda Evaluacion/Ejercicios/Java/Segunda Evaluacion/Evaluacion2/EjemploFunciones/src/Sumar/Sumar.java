package Sumar;

import java.util.Scanner;

public class Sumar {
    static int suma(int numero1, int numero2) {
        int resultado;
        resultado = numero1 + numero2;
        return(resultado);
    }



    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num1, num2, resultadoFinal;
        System.out.println("Dime número1");
        num1 = teclado.nextInt();
        System.out.println("Dime número2");
        num2 = teclado.nextInt();
        resultadoFinal = suma(num1,num2);
        System.out.println(resultadoFinal);
    }
}
