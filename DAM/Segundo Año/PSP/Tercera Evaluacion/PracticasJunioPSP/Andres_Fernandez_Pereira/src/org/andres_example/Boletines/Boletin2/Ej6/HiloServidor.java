package org.andres_example.Boletines.Boletin2.Ej6;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;

public class HiloServidor extends Thread{
    DataInputStream fentrada;
    Socket socket = null;
    DataOutputStream fsalida = null;

    public HiloServidor(Socket s) {
        this.socket = s;

        try {
            fentrada = new DataInputStream(s.getInputStream());
            fsalida = new DataOutputStream(s.getOutputStream());
        } catch (IOException e) {
            System.out.println("Error de E/S");
            e.printStackTrace();
        }
    }

    public void run() {
        InetAddress direccion = socket.getInetAddress();
        System.out.println("=> Conecta IP " + direccion +
                ", Puerto Remoto " + socket.getPort() + " " + socket.toString());

        while (true) {
            String cadena = "";

            try {
                cadena = fentrada.readUTF();

                if (cadena.trim().equals("*")) break;

                String mayuscula = cadena.toUpperCase();
                fsalida.writeUTF(mayuscula);
            } catch (IOException e) {
                e.printStackTrace();
                break;
            }
        }

        try {
            socket.close();
            System.out.println("\t=>Desconecta IP " + direccion +
                    ", Puerto Remoto " + socket.getPort());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    }
