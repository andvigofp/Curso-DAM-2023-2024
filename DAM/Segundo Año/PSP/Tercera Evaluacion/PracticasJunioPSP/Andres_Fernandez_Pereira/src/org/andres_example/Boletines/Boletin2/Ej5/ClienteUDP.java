package org.andres_example.Boletines.Boletin2.Ej5;

import java.io.*;
import java.net.*;

public class ClienteUDP {
    public static void main(String[] args) throws Exception {
        DatagramSocket clienteSocket = new DatagramSocket();

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        InetAddress IPServidor = InetAddress.getLocalHost();
        int puerto = 9876;

        while (true) {
            System.out.print("Introduce identificador a consultar: ");
            String cadena = in.readLine();

            if (cadena.trim().equals("*")) break;

            ByteArrayOutputStream bs = new ByteArrayOutputStream();
            ObjectOutputStream os = new ObjectOutputStream(bs);
            os.writeObject(cadena);
            os.close();

            byte[] enviados = bs.toByteArray();
            DatagramPacket envio = new DatagramPacket(enviados, enviados.length, IPServidor, puerto);
            os.writeObject(cadena);
            clienteSocket.send(envio);

            byte[] recibidos = new byte[1024];
            DatagramPacket recibido = new DatagramPacket(recibidos, recibidos.length);

            try {
                clienteSocket.setSoTimeout(5000);
                clienteSocket.receive(recibido);

                ByteArrayInputStream bais = new ByteArrayInputStream(recibidos);
                ObjectInputStream is = new ObjectInputStream(bais);
                Alumno alumno = (Alumno) is.readObject();
                is.close();

                System.out.printf("\tNombre: %s, Curso: %s - %s, Nota: %d %n",
                        alumno.getNombre(), alumno.getCurso().getId(),
                        alumno.getCurso().getDescripcion(),
                        alumno.getNota());
            }catch (InterruptedIOException ii) {
                System.out.println("\t2<<FINALIZADO TIEMPO DE ESPERA - PAQUETE PERDIDO>>");
            }
        }
        clienteSocket.close();
        System.out.println("Fin de cliente...");
    }
}
