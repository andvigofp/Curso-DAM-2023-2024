package org.example;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {

        ProcessBuilder pb1 = new ProcessBuilder("java", "org.example.ProcesoEscritor");
        pb1.directory(new File("./target/classes"));
        Process p1 = pb1.start();

        System.out.println("El proceso Escritor ha finalizado con: " + p1.waitFor());


        ProcessBuilder pb2 = new ProcessBuilder("java", "org.example.ProcesoVigilante");
        pb2.directory(new File("./target/classes"));
        Process p2 = pb2.start();

        System.out.println("El proceso Vigilante ha finalizado: con: " + p2.waitFor());


        BufferedReader br = new BufferedReader(new InputStreamReader(p2.getInputStream()));
        FileWriter file = new FileWriter("./errors.txt");
        PrintWriter pw = new PrintWriter(file);
        int counter = 0;

        try{
            while ((br.readLine()) != null){
                counter++;
            }
        }catch (Exception e){
            System.out.println(e);
        }
        pw.println("Se ha detectado " + counter + " problemas");
        pw.close();

    }
}