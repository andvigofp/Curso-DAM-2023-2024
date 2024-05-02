package Examenes.Ej2;

import java.io.*;
import java.net.*;
import java.util.Scanner;

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

public class Cliente {
    public static void main(String[] args) {
        try {
            DatagramSocket socket = new DatagramSocket();
            InetAddress direccionServidor = InetAddress.getByName("localhost");

            Scanner scanner = new Scanner(System.in);

            System.out.println("Bienvenido al parque de atracciones");
            System.out.println("Por favor, introduce tu nombre completo:");
            String nombre = scanner.nextLine();

            // Mostramos los tipos de entradas
            System.out.println("Tipos de entradas disponibles:");
            System.out.println("1. Normal: 10 €");
            System.out.println("2. Niños: 3 €");
            System.out.println("3. Carnet joven: 5 €");
            System.out.println("4. Pensionista: 4 €");
            System.out.println("Selecciona el tipo de entrada (1-4):");
            int tipoEntrada = scanner.nextInt();

            // Creamos el objeto Ticket
            Ticket ticket = new Ticket(nombre, tipoEntrada);

            // Enviamos el objeto Ticket al servidor
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(baos);
            oos.writeObject(ticket);
            byte[] datos = baos.toByteArray();
            DatagramPacket paquete = new DatagramPacket(datos, datos.length, direccionServidor, 12345);
            socket.send(paquete);

            // Esperamos la confirmación del servidor
            byte[] bufferConfirmacion = new byte[1024];
            DatagramPacket paqueteConfirmacion = new DatagramPacket(bufferConfirmacion, bufferConfirmacion.length);
            socket.receive(paqueteConfirmacion);
            String confirmacion = new String(paqueteConfirmacion.getData(), 0, paqueteConfirmacion.getLength());
            System.out.println("Confirmación del servidor: " + confirmacion);

            // Cerramos el socket
            socket.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}