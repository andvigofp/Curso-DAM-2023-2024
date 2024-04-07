package Ejericicios.Ejercicio2Sumar;

import java.io.*;
import java.util.Scanner;

public class Sumar {
    public static void main(String[] args) throws IOException, InterruptedException {
        ProcessBuilder pb = new ProcessBuilder("java", "Ejercicios.Ejercicio2Sumar.LeerNumeros", "Pepe");
        pb.directory(new File(".\\out\\production\\Procesos_Java"));
        Process p = pb.start();
        String line;
        PrintStream ps = new PrintStream(p.getOutputStream());
        BufferedReader br = new BufferedReader(new InputStreamReader(p.getInputStream()));
        BufferedReader brError = new BufferedReader(new InputStreamReader(p.getInputStream()));

        Scanner teclado = new Scanner(System.in);
        System.out.println("Intruduce Numero 1: ");
        int numero1 = teclado.nextInt();
        System.out.println("Intrdouce Numero 2: ");
        int numero2 = teclado.nextInt();
        System.out.println("Introduce numero2");
        ps.println(numero1);
        ps.println(numero2);
        ps.flush();

        while (true) {

            ps.println(numero1);
            ps.println(numero2);
            ps.flush();
            int resultado = numero1+ numero2;
            System.out.println(resultado);
            if ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            if ((line = brError.readLine()) != null) {
                System.out.println(line);
            }
            System.out.println("Introduce Numero 1: ");
            numero1 = teclado.nextInt();
            System.out.println("Introduce Numero 2: ");
            numero2 = teclado.nextInt();
            System.out.println(p.waitFor());
        }
    }
}