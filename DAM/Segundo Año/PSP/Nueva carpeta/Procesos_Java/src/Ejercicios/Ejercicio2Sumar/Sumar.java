package Ejercicios.Ejercicio2Sumar;

import java.io.*;
import java.util.Scanner;

public class Sumar {
    public static void main(String[] args) throws IOException, InterruptedException {
        ProcessBuilder pr = new ProcessBuilder("java", "Ejercicios.EjercicioSumar.LeerNumeros");
        pr.directory(new File(".\\out\\production\\Procesos_java"));
        Process p = pr.start();
        String line;
        PrintStream ps = new PrintStream(p.getOutputStream());
        BufferedReader br = new BufferedReader(new InputStreamReader(p.getInputStream()));


        Scanner teclado = new Scanner(System.in);
        int numero1, numero2, resultado;
        System.out.println("Introduce un número1: ");
        numero1 = teclado.nextInt();
        System.out.println("Intrdouce un número 2: ");
        numero2 = teclado.nextInt();
        String numeroCadena1 = String.valueOf(numero1);
        String numeroCadena2 = String.valueOf(numero2);
        while (!numeroCadena1.equals("salir") && numeroCadena2.equals("salir")) {
            ps.println(numero1);
            ps.println(numero2);
            ps.flush();

            if ((line = br.readLine()) != null) {
                System.out.println(line);

                System.out.println("Numero 1: ");
                numero1 = teclado.nextInt();
                System.out.println("Numero 2:");
                numero2 = teclado.nextInt();
                resultado = numero1 + numero2;
                System.out.println(resultado);
            }
            System.out.println(p.waitFor());

        }
    }
}
