package Ejericicios.SumaV2;

import java.io.*;
import java.util.Scanner;

public class Sumar {
    public static void main(String[] args) throws IOException, InterruptedException {
        //Creamos un número fichero que
        File file = new File("suma.txt");
        ProcessBuilder pb = new ProcessBuilder("java", "Ejercicios.SumaV2.LeerNumeros");
        pb.directory(new File(".\\out\\production\\Procesos_Java"));
        Process p = pb.start();
        String line;
        PrintStream ps = new PrintStream(p.getOutputStream());
        int resultado, contador;
        resultado = 0;
        contador = 0;

        ps.println(resultado);
        ps.flush();

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            while ((line = br.readLine()) != null) {
                System.out.println(line); // Mostrar el resultado de SumaDosNumeros
            }
        }

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            while ((line = br.readLine()) != null) {
                ps.println(resultado);
                ps.flush();
                if (line.startsWith("La suma total de los números es: ")) {
                    resultado += Integer.parseInt(line.split(":")[1].trim());
                    contador++;
                    if ((line = br.readLine()) !=null) {

                    }
                    System.out.println("Suma total acumulada de " + contador + " ejecuciones: " + resultado);
                }
                System.out.println("Los Procesos LeerNumeros " + p.waitFor());
            }
        }catch (IOException | InterruptedException e) {
            e.getMessage();
        }

        }

    }


