package Examenes.Ej2;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class Servidor {
    public static void main(String[] args) {
        System.out.println("Servidor iniciado.......");
        try {
            DatagramSocket socket = new DatagramSocket(12345);

            byte[] buffer = new byte[1024];
            DatagramPacket paquete = new DatagramPacket(buffer, buffer.length);

            // Esperamos a recibir datos del cliente
            socket.receive(paquete);

            // Convertimos los datos recibidos en un objeto Ticket
            ByteArrayInputStream bais = new ByteArrayInputStream(paquete.getData());
            ObjectInputStream ois = new ObjectInputStream(bais);
            Ticket ticket = (Ticket) ois.readObject();

            // Calculamos el importe según el tipo de entrada
            double importe = 0;
            String tipo = "";
            switch (ticket.getTipoEntrada()) {
                case 1:
                    importe = 10;
                    tipo = "Normal";
                    break;
                case 2:
                    importe = 3;
                    tipo = "Niños";
                    break;
                case 3:
                    importe = 5;
                    tipo = "Carnet joven";
                    break;
                case 4:
                    importe = 4;
                    tipo = "Pensionista";
                    break;
                default:
                    System.out.println("Tipo de entrada no válido");
                    break;
            }

            // Mostramos la entrada por consola
            System.out.println("Una vez que tiene todos los datos, mostrará por su consola una entrada:");
            System.out.println("VISITANTE: " + ticket.getNombre());
            System.out.println("TIPO DE ENTRADA: " + tipo);
            System.out.println("A PAGAR: " + importe + " €");

            // Enviamos el importe al cliente
            String respuesta = "\nVISITANTE: " + ticket.getNombre() + "\nTIPO DE ENTRADA: " + tipo + "\nA PAGAR: " + importe + " €";
            byte[] datosRespuesta = respuesta.getBytes();
            DatagramPacket paqueteRespuesta = new DatagramPacket(datosRespuesta, datosRespuesta.length, paquete.getAddress(), paquete.getPort());
            socket.send(paqueteRespuesta);

            // Cerramos el socket
            socket.close();

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}