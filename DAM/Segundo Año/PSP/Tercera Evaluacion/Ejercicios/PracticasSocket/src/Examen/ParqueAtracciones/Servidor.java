package Examen.ParqueAtracciones;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

/**
 * Diseña una aplicación donde, empleando datagram sockets, un proceso (que
 * actúa como cliente) le envía a otro (que actúa como servidor) el nombre del usuario
 * y el tipo de entrada al parque de atracciones. El servidor le devolverá un ticket en el
 * que figuren los datos del usuario y el importe.
 * Cliente:
 * - Se pide al usuario el nombre completo
 * - Se le muestran los tipos de entradas, para que indique la que le interesa.
 * ▪ Normal: 10 €
 * ▪ Niños: 3 €
 * ▪ Carnet joven: 5 €
 * ▪ Pensionista: 4 €
 * Servidor:
 * Una vez que tiene todos los datos, mostrará por su consola una entrada:
 * VISITANTE: Pepe Pérez
 *  TIPO DE ENTRADA: Carnet joven
 * A PAGAR: 5 €
 * El paso de datos entre procesos se hará a través de un objeto de la clase
 * Ticket.
 */
public class Servidor {
    public static void main(String[] args) {
        System.out.println("Servidor iniciado....");
        int puerto = 12345;
        try {
            DatagramSocket socket = new DatagramSocket(puerto);

            byte[] buffer = new byte[1024];
            DatagramPacket paquete = new DatagramPacket(buffer, buffer.length);

            //Esperamos a recibir datos del cliente
            socket.receive(paquete);

            //Convertimos los datos recibidos en un objecto Ticket
            ByteArrayInputStream entrada = new ByteArrayInputStream(paquete.getData());
            ObjectInputStream fentrda = new ObjectInputStream(entrada);
            Ticket ticket = (Ticket) fentrda.readObject();

            //Calculamos el importe según el tipo de entrada
            double importe =0;
            String tipo = "";

            switch (ticket.getTipoEntrada()) {
                case 1:
                    importe =10;
                    tipo = "Normal";
                    break;
                case 2:
                    importe = 3;
                    tipo = "Niños";
                    break;
                case 3:
                    importe = 5;
                    tipo = "Carnet Joven";
                    break;
                case 4:
                    importe = 4;
                    tipo = "Pensionista";
                    break;
                default:
                    System.out.println("Tipo de entrda no válido");
                    break;
            }
            //Mostramos la entrad por consola
            System.out.println("Una vez que tiene todos los datos, mostramos por consola una entrda:");
            System.out.println("VISITANTE: " + ticket.getNombre());
            System.out.println("TIPO DE ENTRDA: " + tipo);
            System.out.println("A PAGAR " +  importe + " €");

            //Enviamos el importe al cliente
            String respuesta = "\nVISITANTE: " + ticket.getNombre() + "\nTIPO DE ENTRADA: "
                    + "\nA PAGAR " + importe + " €";
            byte[] datosRespuesta = respuesta.getBytes();
            DatagramPacket paqueteRespuesta = new DatagramPacket(datosRespuesta, datosRespuesta.length, paquete.getAddress(), paquete.getPort());
            socket.send(paqueteRespuesta);

            //Cerramos el socket
            socket.close();
        } catch (SocketException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
