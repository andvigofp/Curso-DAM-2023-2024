package org.andres_example.Practicas.UDP.Curso;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.*;
import java.util.Scanner;

public class Cliente {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String idAlumno="";
        byte[] byteEnviar;
        byte[] byteRecibir;

        DatagramPacket paqueteEnviar;
        DatagramPacket paqueteRecibir;
        ObjectInputStream objectInputStream;
        Alumno alumno;

        try {
            DatagramSocket socket=new DatagramSocket();
            while (!idAlumno.equals("*")) {
                System.out.println("ID del alumno a consultar.");
                idAlumno = teclado.nextLine();
                byteEnviar=new byte[1024];
                byteEnviar=idAlumno.getBytes();
                InetAddress ipServidor=InetAddress.getLocalHost();
                int puerto=6000;

                paqueteEnviar = new DatagramPacket(byteEnviar, byteEnviar.length, ipServidor, puerto);
                socket.send(paqueteEnviar);

                if (!idAlumno.equals("*")) {
                    byteRecibir=new byte[1024];
                    paqueteRecibir=new DatagramPacket(byteRecibir, byteRecibir.length);
                    socket.receive(paqueteRecibir);
                    byteRecibir=paqueteRecibir.getData();
                    ByteArrayInputStream entrada = new ByteArrayInputStream(byteRecibir);
                    ObjectInputStream fentrada = new ObjectInputStream(entrada);
                    alumno = (Alumno) fentrada.readObject();
                    System.out.println(alumno);
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
