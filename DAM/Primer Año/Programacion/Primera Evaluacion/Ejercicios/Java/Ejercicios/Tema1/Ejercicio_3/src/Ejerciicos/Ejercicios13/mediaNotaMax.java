package Ejerciicos.Ejercicios13;

import java.util.Scanner;

public class mediaNotaMax {
    public static void main(String[] args) {
        int num1, num2, num3, mayor, menor, medio;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dame número 1");
        num1 = teclado.nextInt();
        System.out.println("Deme el número 2 ");
        num2 = teclado.nextInt();
        System.out.println("Dame el número 3");
        num3 = teclado.nextInt();
        //Operaciones (la funcíon max y min Librería max )
        mayor = (num1>num2) ? Math.max(num1,num3) : Math.max(num2,num3); //Para hayar el mayor de 2
        menor = (num1<num2) ? Math.max(num1,num3) : Math.max(num2,num3); //Para hayar el menor de 2

        if (num1==mayor) {
             medio=Math.max(num2,num3);

            }else if (num2==menor) {
            medio = Math.max(num1,num3);

        }else {
            medio = Math.max(num1,num3);

        }
        System.out.println(mayor +" > " + medio + " > " + menor);
        }

    }
