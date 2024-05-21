package Boletines.Boletin2.Ej6;

import java.io.*;
import java.net.ConnectException;
import java.net.Socket;
import java.util.Scanner;

public class Cliente {
    public static void main(String[] args) throws IOException {

        String host = "localhost";
        int puerto = 12345;
        BufferedReader ln = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("PROGRAMA CLIENTE INICIADO...");
        Socket cliente= null;

        try {
            cliente = new Socket(host,puerto);
        }catch (ConnectException s) {
            System.out.println("Servidor Conectado...");
            System.exit(1);
        }

        DataOutputStream flujoSalida = new DataOutputStream(cliente.getOutputStream());

        DataInputStream flujoEntrada = new DataInputStream(cliente.getInputStream());

        Scanner teclado = new Scanner(System.in);
        String cadena;

        do {
            System.out.println("Introduzca uan cadena: ");
            cadena = teclado.nextLine();
            flujoSalida.writeUTF(cadena);

            if (!cadena.equals("*")) {
                System.out.println("Respuesta del servidor: " + flujoEntrada.readUTF());
            }
        }while (!cadena.equals("*"));

        flujoEntrada.close();
        flujoSalida.close();
        cliente.close();

        System.out.println("Fin de cliente...");
    }
}
