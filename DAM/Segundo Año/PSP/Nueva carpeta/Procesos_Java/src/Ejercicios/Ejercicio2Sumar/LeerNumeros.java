package Ejercicios.Ejercicio2Sumar;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LeerNumeros {
    public static void main(String[] args) throws IOException {
        String line = "";

        while (true) {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            line = br.readLine();
            if ((line.equals("salir"))) {
                System.exit(0);
            }
            System.out.println("Dime Números " + line);
        }

    }
}
