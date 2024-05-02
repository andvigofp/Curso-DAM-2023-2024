package Boletines.Boletin1.Ej6;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class Cliente {
    public static void main(String[] args) throws IOException {
        String host = "localhost";
        int puerto = 6000;

        Socket cliente = new Socket(host,puerto);

        DataOutputStream flujoSalida = null;
        DataInputStream flujoEntrada = null;

        Scanner teclado = new Scanner(System.in);
        String cadena="";
        int numeroCaracter;

        while (!cadena.equals("*")) {
            System.out.println("cadena: ");
            cadena = teclado.nextLine();

            flujoSalida = new DataOutputStream(cliente.getOutputStream());
            flujoSalida.writeUTF(cadena);
            flujoEntrada = new DataInputStream(cliente.getInputStream());
            numeroCaracter = flujoEntrada.readInt();

            if (!cadena.equals("*")) {
                System.out.println("La cadena tiene: " + numeroCaracter + " carcateres");
            }
        }

        flujoSalida.close();
        System.out.println("Fin del programa....");
        cliente.close();
    }
}
