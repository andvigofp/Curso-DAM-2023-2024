package Ejericicios.Ejercicio3;

import java.io.IOException;
import java.io.InputStream;

public class Ejercicicio3 {
    public static void main(String[] args) {
        ProcessBuilder pb = new ProcessBuilder("notepad++.exe","C:\\ejercico2.txt");
        try {
            Process p2 = pb.start();

            InputStream is = p2.getInputStream();

            int c;
            while ((c=is.read())!=-1) {
                System.out.println((char) c);
            }
            int exitVal;
            try {
                exitVal = p2.waitFor();
                System.out.println("Valor de salida: " + exitVal);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
