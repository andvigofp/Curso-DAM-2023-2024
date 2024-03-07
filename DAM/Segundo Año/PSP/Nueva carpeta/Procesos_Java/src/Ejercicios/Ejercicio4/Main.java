package Ejercicios.Ejercicio4;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        ProcessBuilder pb = new ProcessBuilder("java", "Ejercicios.Ejercicio4.LeerNombre", "Pepe");
        pb.directory(new File(".\\out\\production\\Procesos_Java"));
        Process p = pb.start();
        String line;
        PrintStream ps = new PrintStream(p.getOutputStream());
        BufferedReader br = new BufferedReader(new InputStreamReader(p.getInputStream()));
        BufferedReader brError = new BufferedReader(new InputStreamReader(p.getInputStream()));

        Scanner teclado = new Scanner(System.in);
        System.out.println("Nombre: ");
        String nombre = teclado.nextLine();
        ps.println(nombre);
        ps.flush();

        while (!nombre.equals("salir")) {

            ps.println(nombre);
            ps.flush();

            if ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            if ((line = brError.readLine()) != null) {
                System.out.println(line);
            }
            System.out.println("Nombre: ");
            nombre = teclado.nextLine();

        }

        System.out.println(p.waitFor());

    }
}