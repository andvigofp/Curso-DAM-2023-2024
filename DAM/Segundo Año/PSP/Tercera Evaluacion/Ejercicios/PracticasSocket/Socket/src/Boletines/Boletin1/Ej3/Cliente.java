package Boletines.Boletin1.Ej3;

import Boletines.Boletin1.Ej1.InetAdrees;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;

public class Cliente {
    public static void main(String[] args) throws IOException {
        String host = "localhost";
        int puerto = 6000;

        //Abrir Socket
        Socket cliente = new Socket(host,puerto);

        InetAddress i = cliente.getInetAddress();
        System.out.println("Puerto Local: " + cliente.getLocalAddress());
        System.out.println("Puerto Remoto: " + cliente.getPort());
        System.out.println("Nombre Host/IP: " + cliente.getLocalAddress());
        System.out.println("Host Remoto: " + i.getHostName().toString());
        System.out.println("IP Host Remoto: " + i.getHostAddress().toString());

        cliente.close();
    }
}
