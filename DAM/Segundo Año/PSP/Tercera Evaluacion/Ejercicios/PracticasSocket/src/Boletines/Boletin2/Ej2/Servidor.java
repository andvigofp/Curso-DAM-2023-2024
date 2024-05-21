package Boletines.Boletin2.Ej2;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

/**
 * 2. Crea un programa cliente usando sockets UDP que envíe el texto escrito desde la entrada
 * estándar al servidor. El servidor le devolverá la cadena en mayúsculas. El proceso de entrada
 * de datos finalizará cuando el cliente introduzca un asterisco.
 * Crea un programa servidor que reciba cadenas de caracteres, las muestre en pantalla y se las
 * envíe al emisor en mayúscula. El proceso servidor finalizará cuando reciba un asterisco.
 * Establece un tiempo de espera de 5000ms con el método setSoTimeout para hacer que el
 * método receive() del programa cliente se bloquee. Pasado ese tiempo, controlar si no se
 * reciben datos lanzando la excepción InterruptedIOException, en cuyo caso visualiza un
 * mensaje indicando que el paquete se ha perdido.
 */
public class Servidor {
    public static void main(String[] args) throws IOException {
        byte[] buffer = new byte[1024];

        DatagramSocket socket = new DatagramSocket(12345);

        System.out.println("Servidor espeando Datagrama ....");
        DatagramPacket recibo;

        String paquete = "";

        do {
            buffer = new byte[1024];
            recibo = new DatagramPacket(buffer, buffer.length);

            socket.receive(recibo);

            paquete = new String(recibo.getData());
            System.out.println("Servidor Recibe: " + paquete);

            if (paquete.trim().equals("*")) break;

            InetAddress IPOrigen = recibo.getAddress();
            int puerto = recibo.getPort();

            String mayuscula = paquete.trim().toUpperCase();
            byte[] enviados = new byte[1024];
            enviados = mayuscula.getBytes();

            DatagramPacket envio = new DatagramPacket(enviados, enviados.length, IPOrigen, puerto);
            socket.send(envio);

        }while (!paquete.trim().equals("*"));

        System.out.println("Cerrando conexión...");
        socket.close();
    }
}
