package org.andres_example.Practicas.UDP.Jugador;

import java.io.*;
import java.net.*;
import java.util.Scanner;

public class Cliente {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        byte[] byteEnviar;
        byte[] byteRecibir;

        DataOutputStream salida;
        ObjectInputStream fsalida;

        DatagramPacket paqueteEnviar;
        DatagramPacket paqueteRecibir;
        String id="";
        Jugador jugador;

        try {
            DatagramSocket socket = new DatagramSocket();
            while (!id.equals("*")) {
                System.out.println("ID del Jugador a consultar...");
                id=teclado.nextLine();
                InetAddress ipServidor=InetAddress.getLocalHost();
                int puerto=12345;
                byteEnviar=id.getBytes();
                paqueteEnviar=new DatagramPacket(byteEnviar, byteEnviar.length, ipServidor,puerto);
                socket.send(paqueteEnviar);

                if (!id.equals("*")) {
                    byteRecibir=new byte[1024];
                    paqueteRecibir=new DatagramPacket(byteRecibir, byteRecibir.length);
                    socket.receive(paqueteRecibir);

                    ByteArrayInputStream byteArrayInputStream=new ByteArrayInputStream(byteRecibir);
                    fsalida=new ObjectInputStream(byteArrayInputStream);
                    jugador =(Jugador) fsalida.readObject();
                    System.out.println(jugador);
                }else {
                    System.out.println("El cliente ha solicitado salir");
                }
            }
        } catch (SocketException e) {
            throw new RuntimeException(e);
        } catch (UnknownHostException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}
