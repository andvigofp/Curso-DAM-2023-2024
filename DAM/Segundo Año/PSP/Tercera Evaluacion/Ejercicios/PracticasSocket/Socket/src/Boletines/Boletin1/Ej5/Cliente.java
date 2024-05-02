package Boletines.Boletin1.Ej5;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ConnectException;
import java.net.Socket;

public class Cliente {
    public static void main(String[] args) throws IOException {
        String host= "localhost";
        int puerto = 6000;
        System.out.println("Conecta con el servidor...");

        //Abrir Socket
        Socket cliente = null;

        try {
            cliente = new Socket(host,puerto);
        }catch (ConnectException c) {
            System.out.println("SERVIDOR CERRADO. ");
            return;
        }

        //Recibo saludo del cliente
        InputStream aux = cliente.getInputStream();
        DataInputStream flujoEntrada = new DataInputStream(aux);

        System.out.println("Recibiendo del servidor: " + flujoEntrada.readUTF());

        System.out.println("CLIENTE CERRADO. ");

        cliente.close(); //Cierra socket
    }
}
