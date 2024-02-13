package org.example;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        ProcessBuilder pb = new ProcessBuilder("java", "org.example.Ejercicio6_hijo");
        pb.directory(new File("./target/classes/"));
        Process p = pb.start();

        BufferedReader br = new BufferedReader(new InputStreamReader(p.getInputStream()));
        PrintStream ps = new PrintStream(p.getOutputStream());
        Scanner sc = new Scanner(System.in);
        String line;
        String send  = "";

        while((line = br.readLine()) != null && (!send.equals("*"))){
            System.out.println(line);
            send = sc.nextLine();
            ps.println(send);
            ps.flush();
        }

        System.out.println("El proceso hijo ha finalizado con el estado: " + p.waitFor());

    }
}