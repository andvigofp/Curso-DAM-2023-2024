package Ejericicios.Suma;

import java.util.Scanner;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;

public class SumaDosNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double sumaTotal = 0.0;
        int contador = 0;
        boolean continuar = true;

        do {
            System.out.print("Introduce el primer número (o 0 para terminar): ");
            if (scanner.hasNextDouble()) {
                double numero1 = scanner.nextDouble();

                if (numero1 == 0) {
                    break; // Sal del bucle si se ingresa 0
                }

                System.out.print("Introduce el segundo número: ");
                if (scanner.hasNextDouble()) {
                    double numero2 = scanner.nextDouble();

                    double suma = numero1 + numero2;
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
}