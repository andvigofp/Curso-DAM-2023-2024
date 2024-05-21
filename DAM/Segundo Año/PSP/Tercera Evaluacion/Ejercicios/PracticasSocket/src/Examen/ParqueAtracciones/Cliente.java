package Examen.ParqueAtracciones;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.*;
import java.util.Scanner;

public class Cliente {
    public static void main(String[] args) {
        try {
            DatagramSocket socket = new DatagramSocket();
            InetAddress direccioServidor = InetAddress.getByName("localhost");
            int puerto = 12345;

            Scanner teclado = new Scanner(System.in);

            System.out.println("Bienvenido al parque de atracciones:");
            System.out.println("Dime tu nombre completo:");
            String nombre = teclado.nextLine();

            System.out.println("Tipos de entradas disponibles:");
            System.out.println("1. Normal: 10€");
            System.out.println("2. Niños: 3€");
            System.out.println("3. Carnet Joven: 5€");
            System.out.println("4. Pensionista: 4€");
            System.out.println("Selecciona el tipo de entrada (1-4)");
            int tipoEntrda = teclado.nextInt();

            //Creamos elobject Ticket
            Ticket ticket = new Ticket(nombre, tipoEntrda);

            //Enviamos el object Ticket al servidor
            ByteArrayOutputStream salida = new ByteArrayOutputStream();
            ObjectOutputStream fsalida = new ObjectOutputStream(salida);
            fsalida.writeObject(ticket);

            byte[] datos = salida.toByteArray();
            DatagramPacket paquete = new DatagramPacket(datos, datos.length, direccioServidor,puerto);
            socket.send(paquete);

            //Esperamos la confirmación del servidor
            byte[] bufferConfirmacion = new byte[1024];
            DatagramPacket paqueteConfirmacion = new DatagramPacket(bufferConfirmacion, bufferConfirmacion.length);
            socket.receive(paqueteConfirmacion);
            String confirmacion = new String(paqueteConfirmacion.getData(), 0, paqueteConfirmacion.getLength());
            System.out.println("Corfirmación del servidor: " + confirmacion);

            //Cerramos el socket
            socket.close();
        } catch (SocketException | UnknownHostException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
