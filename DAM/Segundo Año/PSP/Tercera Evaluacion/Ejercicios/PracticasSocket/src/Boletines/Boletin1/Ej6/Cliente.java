package Boletines.Boletin1.Ej6;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class Cliente {
    public static void main(String[] args) throws IOException {
        String host ="localhost";
        int puerto = 6000;
        System.out.println("Conectando con el servidor...");

        Socket cliente = new Socket(host, puerto);

        DataOutputStream flujoSalida = null;
        DataInputStream flujoEntrada;

        Scanner teclado = teclado = new Scanner(System.in);
        String cadena = "";
        int numeroCaracteres;

        while (!cadena.equals("*")) {
            System.out.println("Cadena: ");
            cadena=teclado.nextLine();

            flujoSalida = new DataOutputStream(cliente.getOutputStream());
            flujoSalida.writeUTF(cadena);
            flujoEntrada = new DataInputStream(cliente.getInputStream());
            numeroCaracteres = flujoEntrada.readInt();

            if (!cadena.equalsIgnoreCase("*")) {
                System.out.println("La cadena tiene: " + numeroCaracteres + " caracteres");
            }
        }

        flujoSalida.close();
        System.out.println("Fin del programa....");
        cliente.close();

    }
}
