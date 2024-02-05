package Ejericicios.Ejercicio2Sumar;

import java.io.*;

public class LeerNumeros {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String linea;

        while (true) {
            System.out.println("Introduce el primer número (o escribe 'salir' para finalizar): ");
            linea = br.readLine();

            if (linea.equals("salir")) {
                System.exit(1);
            }
            try {
                int numero1 = Integer.parseInt(linea);

                System.out.println("Introduce el segundo número: ");
                linea = br.readLine();
                int numero2 = Integer.parseInt(linea);

                int resultado = numero1 + numero2;

                // Imprimir el resultado en la salida estándar
                System.out.println(resultado);
            } catch (NumberFormatException e) {
                // Imprimir un mensaje de error en la salida estándar
                System.out.println("Debes ingresar números válidos.");
            }
        }
    }
}
