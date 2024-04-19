package Ejercicios.Boletin2Sockets.Ejercicio6;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;

/**
 * Realiza un programa servidor que escuche en el puerto 12345. Cada vez que se conecte un
 * cliente se creará un nuevo hilo para atenderlo. Se mostrará en la consola del servidor la
 * dirección IP y el puerto remoto del cliente que se conecta. Se deberá notificar también cuando
 * un cliente se desconecte.
 * En el hilo que atiende al cliente, se reciben cadenas de caracteres que, mientras sean distintas
 * de “*”, se devolverán al cliente transformadas a mayúsculas.
 */
public class Servidor {

    static ServerSocket servidor;
    static final int PUERTO = 12345;// puerto por el que escucho

    public static void main(String args[]) throws IOException {

        servidor = new ServerSocket(PUERTO);
        System.out.println("Servidor iniciado...");

        while (true) {
            Socket s;
            try {
                s = servidor.accept();// esperando cliente
            } catch (SocketException ns) {
                break;
            }// sale cuando

            HiloServidor hilo = new HiloServidor(s);
            hilo.start();
        }

        System.out.println("Servidor finalizado...");
    }
}// ..


