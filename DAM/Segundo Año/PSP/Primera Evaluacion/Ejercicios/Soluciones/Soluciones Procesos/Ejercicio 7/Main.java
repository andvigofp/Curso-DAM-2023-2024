package org.example;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {



        ProcessBuilder pb = new ProcessBuilder("java", "org.example.Ejercicio7_hijo");
        File directorio = new File("./target/classes/");
        pb.directory(directorio);
        Process p = pb.start();

        String cadena = "";
        Scanner sc = new Scanner(System.in);
        System.out.printf("Introduce una cadena a procesar: ");
        cadena = sc.nextLine();

        BufferedReader br = new BufferedReader(new InputStreamReader(p.getInputStream()));
        PrintStream ps = new PrintStream(p.getOutputStream());

        ps.println(cadena);
        ps.flush();

        String line;
        while((line = br.readLine()) != null){
            System.out.println(line);
        }


        // COMPROBACION DE ERROR - 0 bien - 1 mal
        int exitVal;
        try {
            exitVal = p.waitFor();
            System.out.println("Valor de Salida: " + exitVal);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        try {
            InputStream er = p.getErrorStream();
            BufferedReader brer = new BufferedReader(new InputStreamReader(er));
            String liner = null;
            while ((liner = brer.readLine()) != null)
                System.out.println("ERROR >" + liner);
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}