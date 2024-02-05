package Ejercicios.Ejercicio1;

import java.util.Scanner;

public class Ejemplo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un número");
        int numero = teclado.nextInt();
        if (numero>0)
            System.out.println(numero + " es positivo");
        else
            if (numero<0)
                System.out.println(numero + " es negativo");
            else
                System.out.println(numero + " es nulo");

    }
}