package Ejericicios.SumaV1;

import java.io.File;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;

public class SumaDosNumeros {
    public static void main(String[] args) {
        //Salida por teclado
        Scanner scanner = new Scanner(System.in);
        //Variables de tipo entero
        int numero1, numero2, suma, sumaTotal, contador;
        //Inicializmos las variables SumaTotal y contador en 0
        sumaTotal = 0;
        contador = 0;
        //Variable tipo boolean (Verdadero o Falso);
        boolean continuar = true;
        //Haremos tantas sumas que queramos, para despúes mostrar el resultado en otro Proceso Lanzador
        //Recoremos el bucle Do While, hasta que Pulsemos 0 para salir
        //Inicio
        do {
            System.out.print("Introduce el primer número (o 0 para terminar): ");
            if (scanner.hasNextInt()) {
                 numero1 = scanner.nextInt();

                if (numero1 == 0) {
                    break; // Sal del bucle si se ingresa 0
                }

                System.out.print("Introduce el segundo número: ");
                if (scanner.hasNextInt()) {
                    numero2 = scanner.nextInt();

                    suma = numero1 + numero2;
                    sumaTotal += suma;
                    contador++;

                    System.out.println("Resultado de la suma: " + suma);

                    // Escribe el resultado en un archivo resultado.txt
                    try (PrintWriter writer = new PrintWriter(new FileWriter("resultado.txt", true))) {
                        writer.println("Resultado de la suma: " + suma);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else {
                    System.out.println("El segundo valor no es un número válido.");
                }
            } else {
                System.out.println("El primer valor no es un número válido.");
            }
        } while (continuar);

        System.out.println("Suma total de " + contador + " ejecuciones: " + sumaTotal);
    }
    //Fin
}