package Ejercicios.Ejercicio9;

import java.util.Scanner;

public class Ejercicio9 {
    /**
     *Realiza un programa que pida 8 números enteros y que luego muestre esos números junto con la
     * palabra “par” o “impar” según proceda.
     */
    public static void main(String[] args) {
        //Leer la entrada del usuario
        Scanner teclado = new Scanner(System.in);

        //Creamos un array para almacenar los 8 números enteros
        int numeros[] = new int[8];

        //Pedimos al usuario los 8 números enteros
        for (int i=0; i<numeros.length; i++) {
            System.out.print("Introduce el número " + (i + 1) + ": ");
            numeros[i] = teclado.nextInt();
        }

        //Mostramos los números junto con "par o "impar"
        System.out.println("Numeos y clasicación:");
        for (int i=0; i<numeros.length; i++) {
            System.out.print(numeros[i] + " es ");
            if (esPar(numeros[i])) {
                System.out.println("par");
            }else {
                System.out.println("impar");
            }
        }

    }

    //Método para verificar si un número es par
    public static boolean esPar(int numero) {
        return numero % 2 == 0;
    }
}
