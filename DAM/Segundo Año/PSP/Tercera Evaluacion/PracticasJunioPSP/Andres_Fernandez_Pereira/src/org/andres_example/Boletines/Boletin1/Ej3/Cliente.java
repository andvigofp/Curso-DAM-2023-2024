package org.andres_example.Boletines.Boletin1.Ej3;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;

public class Cliente {
    public static void main(String[] args) throws IOException {
        String host = "localhost";
        int puerto = 6000;

        //Abrir el socket
        Socket cliente = new Socket(host,puerto);

        InetAddress i = cliente.getInetAddress();
        System.out.println("Puerto local: " + cliente.getLocalAddress());
        System.out.println("Puerto Remoto: " + cliente.getPort());
        System.out.println("Nombre Host/IP: " + cliente.getInetAddress());
        System.out.println("Host Remoto: " + i.getHostName().toString());
        System.out.println("IP Host remoto: " + i.getHostAddress().toString());

        cliente.close();

    }
}
