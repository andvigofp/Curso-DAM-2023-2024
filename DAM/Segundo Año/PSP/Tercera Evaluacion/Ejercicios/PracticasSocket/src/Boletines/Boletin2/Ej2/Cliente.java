package Boletines.Boletin2.Ej2;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.*;
import java.util.Scanner;

public class Cliente {
    public static void main(String[] args) throws IOException {
        InetAddress destino = InetAddress.getLocalHost();
        int puerto = 12345;
        byte[] mensaje = new byte[1024];

        DatagramPacket envio;
        DatagramPacket recibo;
        DatagramSocket socket = new DatagramSocket();

        String cadena="";
        socket.setSoTimeout(5000);

        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca una cadena (Pulse * para salir): ");
        cadena = teclado.nextLine();

        while (!cadena.equals("*")) {
            mensaje = new byte[1024];
            mensaje = cadena.getBytes();
            envio = new DatagramPacket(mensaje, mensaje.length, destino, puerto);
            socket.send(envio);

            byte[] bufferRec = new byte[1024];
            recibo = new DatagramPacket(bufferRec, bufferRec.length);

            try {
                socket.receive(recibo);
                String mayuscula = new String(recibo.getData()).trim();
                System.out.println("\tMayúsculas: " + mayuscula);
            }catch (InterruptedIOException e) {
                System.out.println("\tPaquete perdido, sin maysuculas.");
            }
            System.out.println("\nIntroduce una cadena: ");
            cadena = teclado.nextLine();
        }

        envio = new DatagramPacket("*".getBytes(), "*".getBytes().length, destino, puerto);
        socket.send(envio);
        socket.close();
        System.out.println("Fin del programa...");
        teclado.close();
    }
}
