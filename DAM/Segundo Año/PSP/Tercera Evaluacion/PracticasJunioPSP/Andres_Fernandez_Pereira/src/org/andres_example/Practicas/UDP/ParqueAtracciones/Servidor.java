package org.andres_example.Practicas.UDP.ParqueAtracciones;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class Servidor {
    public static void main(String[] args) {
        System.out.println("Servidor Iniciao....");
        int puerto = 12345;

        try {
            DatagramSocket servidor = new DatagramSocket(puerto);

            byte[] buffer = new byte[1024];
            DatagramPacket paquete = new DatagramPacket(buffer, buffer.length);
            servidor.receive(paquete);

            ByteArrayInputStream entrada = new ByteArrayInputStream(paquete.getData());
            ObjectInputStream fentrada = new ObjectInputStream(entrada);
            Ticket ticket = (Ticket) fentrada.readObject();

            double importe =0;
            String tipo = "";

            switch (ticket.getTipoEntrada()) {
                case 1:
                    importe=10;
                    tipo="Normal";
                    break;
                case 2:
                    importe=3;
                    tipo="Niños";
                    break;
                case 3:
                    importe=5;
                    tipo="Carnet Joven";
                    break;
                case 4:
                    importe=4;
                    tipo="Pensionista";
                    break;
                default:
                    tipo = "Entrada no Disponible";
                    break;
            }
            System.out.println("Enviando datos de entrada: ");
            System.out.println("Visitante: " + ticket.getNombre());
            System.out.println("Número Entradas: " + ticket.getNumeroEntradas());
            System.out.println("Tipo Entrada: " + tipo);
            System.out.println("A pagar: " + importe);

            double total = importe * ticket.getNumeroEntradas();

            String respuesta = "\nVisitante " + ticket.getNombre() + "\nNúmero Entradas: " + ticket.getNumeroEntradas() +
                    "\nTipo Entrada: " + tipo + "\nTotal: " + total + " €\n";

            byte[] datosRespuesta = respuesta.getBytes();

            DatagramPacket paqueteRespuesta = new DatagramPacket(datosRespuesta, datosRespuesta.length, paquete.getAddress(), paquete.getPort());
            servidor.send(paqueteRespuesta);
            servidor.close();
        } catch (SocketException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
