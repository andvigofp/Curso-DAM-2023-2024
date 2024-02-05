package Ejericicios.SumaV2;

import java.io.*;
import java.util.Scanner;

public class LeerNumeros {
    public static void main(String[] args) throws IOException {
            File file = new File("suma.txt");
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String salida;
            int numero1, numero2, suma, sumaTotal, contador;
            sumaTotal = 0;
            contador = 0;
            boolean continuar = true;

            do {
                System.out.print("Introduce el primer número (o 0 para terminar): ");
                if ((salida = br.readLine())!=null) {
                    numero1 = Integer.parseInt(salida);

                    if (numero1 == 0) {
                        break; // Sal del bucle si se ingresa 0
                    }

                    System.out.print("Introduce el segundo número: ");
                    if ((salida = br.readLine()) !=null) {
                        numero2 = Integer.parseInt(salida);

                        suma = numero1 + numero2;
                        sumaTotal += suma;
                        contador++;

                        System.out.println("Resultado de la suma: " + suma);

                        // Escribe el resultado en un archivo resultado.txt
                        try (PrintWriter writer = new PrintWriter(new FileWriter(file, true))) {
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