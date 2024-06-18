package org.andres_example.Boletines.Boletin2.Ej4;

import java.io.*;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

/**
 *Usando sockets UDP, realiza un programa servidor que espere un datagrama de un cliente. El
 * cliente le envía un objeto Persona que previamente había inicializado. El servidor modifica los
 * datos del objeto Persona y se lo envía de vuelta al cliente. Visualiza los datos del objeto
 * Persona tanto en el programa cliente cuando los envía y los recibe como en el programa
 * servidor cuando los recibe y los envía modificados.
 */
public class ServidorUDP {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        DatagramSocket socket = new DatagramSocket(12345);
        System.out.println("Servidor esperando Datagram...");
        DatagramPacket recibido;

        byte[] bufferRecibir = new byte[1024];
        byte[] bufferEnviar = new byte[1024];
        recibido = new DatagramPacket(bufferRecibir, bufferRecibir.length);
        socket.receive(recibido);
        bufferRecibir = recibido.getData();

        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bufferRecibir);
        ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
        Persona persona = (Persona) objectInputStream.readObject();
        System.out.println("Persona como nos lleva del cliente:\n " + persona.toString());

        persona.setDni("7691238C");
        persona.setNombre("Manuel Antonio");
        System.out.println("Persona modificada en el Servidor:\n " + persona.toString());

        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
        objectOutputStream.writeObject(persona);
        bufferEnviar = byteArrayOutputStream.toByteArray();

        InetAddress IPOrigen = recibido.getAddress();
        int puerto = recibido.getPort();
        DatagramPacket envio = new DatagramPacket(bufferEnviar, bufferEnviar.length, IPOrigen, puerto);
        socket.send(envio);

        System.out.println("Cerrando servidor...");
        socket.close();
    }
}
