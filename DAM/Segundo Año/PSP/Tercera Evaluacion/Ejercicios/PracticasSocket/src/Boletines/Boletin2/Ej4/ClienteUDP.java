package Boletines.Boletin2.Ej4;

import java.io.*;
import java.net.*;

public class ClienteUDP {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Persona persona = new Persona(1, "Antonio", "Lorenzo", "Vizcaino", "00000000X");
        System.out.println("Persona en cliente, antes de enviar al servidor:\n" + persona.toString());

        DatagramSocket clienteSocket = new DatagramSocket();
        InetAddress ipServidor = InetAddress.getLocalHost();
        int puerto = 12345;
        byte[] enviar = new byte[1024];
        byte[] recibir = new byte[1024];

        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
        objectOutputStream.writeObject(persona);
        enviar = byteArrayOutputStream.toByteArray();

        DatagramPacket envio = new DatagramPacket(enviar, enviar.length, ipServidor, puerto);
        clienteSocket.send(envio);

        DatagramPacket recibo = new DatagramPacket(recibir, recibir.length);
        clienteSocket.receive(recibo);
        recibir = recibo.getData();

        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(recibir);
        ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
        persona = (Persona) objectInputStream.readObject();
        System.out.println("Persona en cliente, después de recibir del servidor:\n" + persona.toString());

        clienteSocket.close();
    }
}
