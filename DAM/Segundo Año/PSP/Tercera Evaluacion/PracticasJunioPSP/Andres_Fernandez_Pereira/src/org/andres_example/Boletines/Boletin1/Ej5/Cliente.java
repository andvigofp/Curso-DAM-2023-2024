package org.andres_example.Boletines.Boletin1.Ej5;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ConnectException;
import java.net.Socket;

public class Cliente {
    public static void main(String[] args) throws IOException {
        String host = "localhost";
        int puerto = 6000;

        System.out.println("Conetando con el servidor...");

        Socket cliente = null;

        try {
            cliente = new Socket(host,puerto);
        } catch (ConnectException e) {
            System.out.println("SERVIDOR CERRADO...");
            return;
        }

        //Recibo saludo del servidor
        InputStream aux = cliente.getInputStream();
        DataInputStream flujo = new DataInputStream(aux);

        System.out.println("Recibiendo del servidor: " + flujo);

        System.out.println("CLIENTE CERRADO...");

        cliente.close();
    }
}
