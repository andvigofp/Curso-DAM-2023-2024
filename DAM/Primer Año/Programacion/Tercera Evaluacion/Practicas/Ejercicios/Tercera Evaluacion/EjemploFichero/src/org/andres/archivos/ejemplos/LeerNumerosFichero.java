package org.andres.archivos.ejemplos;

import java.io.*;
import java.nio.Buffer;
import java.util.Scanner;

public class LeerNumerosFichero {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca el nombre del archivo donde se encuentren los números. ");
        String nombreFichero = teclado.nextLine();


            try {
                BufferedReader br = new BufferedReader(new FileReader(nombreFichero));
                String line = "0";
                int i=0;
                double suma = 0;

                while (line !=null) {
                    i++;
                    suma += Double.parseDouble(line);
                    line = br.readLine();
                }
                i++;
                System.out.println("La media es " + suma /(double) i);
            } catch (IOException e) {
                System.out.printf("e.getMessagge " + e.getMessage());
            }

    }
}
