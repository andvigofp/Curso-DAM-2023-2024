package Ejercicios.Boletin1Sockets.Ejercicio5;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ConnectException;
import java.net.Socket;

public class Cliente {
    public static void main(String[] args) throws IOException {
            String Host = "localhost";
            int Puerto = 6000;
            System.out.println("Conectando con el servidor...");

            // ABRIR SOCKET
            Socket Cliente = null;

            try {
                Cliente = new Socket(Host, Puerto);
            } catch (ConnectException c) {
                System.out.println("SERVIDOR CERRADO. ");
                return;
            }

            // RECIBO SALUDO DEL SERVIDOR
            InputStream aux = Cliente.getInputStream();
            DataInputStream flujo = new DataInputStream(aux);

            System.out.println("Recibiendo del servidor: " + flujo.readUTF());

            System.out.println("CLIENTE CERRADO. ");

            Cliente.close();// Cierra el socket
        }// main
    }//
