package org.andres_example.Practicas.TCP.Calculadora;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Servidor {
    public static void main(String[] args) {
        ServerSocket servidor = null;

        try {
            servidor = new ServerSocket(6000);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        while (true) {
            try {
                System.out.println("Esperando la conexión del cliente....");
                Socket cliente = servidor.accept();
                System.out.println("Cliente conectado....");
                HiloServidor hiloServidor = new HiloServidor(cliente);
                hiloServidor.start();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
