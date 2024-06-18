package org.andres_example.Boletines.Boletin2.Ej1;

import java.io.*;
import java.net.ConnectException;
import java.net.Socket;
import java.net.SocketException;

public class ClienteTCP {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        String host = "localhost";
        int puerto = 6000;
        BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Programa cliente iniciado...");
        Socket cliente = null;

        try {
            cliente = new Socket(host,puerto);
        } catch (ConnectException e) {
            System.out.println("Servidor no conectado....");
            System.exit(1);
        }

        DataOutputStream flujoSalida = new DataOutputStream(cliente.getOutputStream());
        ObjectInputStream flujoEntrada = new ObjectInputStream(cliente.getInputStream());

        Integer idcliente = (Integer) flujoEntrada.readObject();
        System.out.println("Soy el cliente " + idcliente);

        String cadena = "";
        Profesor profe = new Profesor();

        while (true) {
            System.out.println("=======================================");
            System.out.println("Introduzca  teclado identificador a consultar");
            cadena = teclado.readLine();

            if (cadena.trim().equals("*"))
                break;
            try {
                Integer.parseInt(cadena);
            }catch (NumberFormatException e) {
                System.out.println("\tIdentificador incorrecto: ");
                continue;
            }

            try {
                flujoSalida.writeUTF(cadena);
            }catch (SocketException e) {
                System.out.println("Error al enviar al servidor (el proceso a finalizado...");
                break;
            }

            profe = (Profesor) flujoEntrada.readObject();

            System.out.printf("\tNombre: %s, Especializad: %d - %s %n ", profe.getNombre(), profe.getEspe().getId(),
                    profe.getEspe().getNombreEspe());

            Asignatura[] asig = profe.getAsignaturas();

            try {
                for (int j =0; j< asig.length; j++) {
                    System.out.printf("\t\tAsigantura: %d  -%s %n ", asig[j].getId(), asig[j].getNombreAsig());
                }
            }catch (java.lang.NullPointerException m) {
                    m.printStackTrace();
            }
        }
        flujoEntrada.close();
        flujoSalida.close();
        cliente.close();

        System.out.println("Fin del cliente....");
    }
}
