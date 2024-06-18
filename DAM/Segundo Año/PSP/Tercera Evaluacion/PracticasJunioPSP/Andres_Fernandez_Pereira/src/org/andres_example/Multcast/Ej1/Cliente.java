package org.andres_example.Multcast.Ej1;

import java.io.IOException;
import java.net.*;
import java.util.Scanner;

public class Cliente {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        //Se crea el socket Multiast
        int puerto = 12345; //Puerto Multicast
        MulticastSocket ms = null;

        try {
            ms = new MulticastSocket(puerto);

            InetAddress grupo = InetAddress.getByName("225.0.0.1"); //Grupo
            SocketAddress sock = new InetSocketAddress(grupo, puerto);
            ms.joinGroup(sock, NetworkInterface.getByInetAddress(grupo));

            System.out.println("!Bienvenido! ¿Cómo te llamas?: ");
            String cadena = "Se ha conectado " + teclado.nextLine();

            //Enviando al grupo
            DatagramPacket paquete = new DatagramPacket(cadena.getBytes(), cadena.length(), grupo, puerto);
            ms.send(paquete);

            String msg = "";

            while (!msg.trim().equals("*")) {
                byte[] buffer = new byte[1000];

                //recibe el paquete del servidor multicast
                paquete = new DatagramPacket(buffer, buffer.length);
                ms.receive(paquete);

                msg = new String(paquete.getData());
                System.out.println("Recibo: " + msg.trim());
            }
            //Mismos parámetros que join
            ms.leaveGroup(sock, NetworkInterface.getByInetAddress(grupo));
            ms.close(); //Cierra socket
            System.out.println("Socket cerrado...");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
