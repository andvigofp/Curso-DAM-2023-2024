package Ejercicios.Ejercicio6;

import java.util.Scanner;

public class OperacionesMatematicas {
    public static void main(String[] args) {
        /**
         * Escribe un programa en el que se declaren las variables enteras x e y. Asígnales
         * los valores 144 y 999 respectivamente. A continuación, muestra por pantalla el
         * valor de cada variable, la suma, la resta, la división y la multiplicación.
         */
            //Variables tipo entero más pequeño
            int x = 144;
            int y = 999;
            // Mostrar el valor de las variables
            System.out.println("El valor de x es: " + x);
            System.out.println("El valor de y es: " + y+ "\n");
            // Realizar operaciones matemáticas
            int suma, resta, multiplicacion;
            float division;
            suma = x+y;
            resta = x-1;
            //Casteamos de short o int a float de las variables x e y para que no den valor 0 en la división
            division = (float) x/y;
            multiplicacion = x*y;


            // Mostrar los resultados de las operaciones
            System.out.println("La suma de x e y es: " + suma);
            System.out.println("La resta de x e y es: " + resta);
            System.out.println("La división de x entre y es: "+ division);
            System.out.println("La multiplicación de x e y es: " + multiplicacion);
        }
    }