package org.andres_example.Practicas.UDP.Jugador;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.util.ArrayList;

public class Servidor {
    public static ArrayList<Jugador> jugadores=new ArrayList<>();

    public static void main(String[] args) {
        crearJugadores();
        byte[] byteRecibir;
        byte[] byteEnviar;
        ObjectOutputStream fentrada;
        DatagramPacket paqueteRecibir;
        DatagramPacket paqueteEnviar;
        boolean exito =false;
        String id= "";
        Jugador jugador=null;

        try {
            DatagramSocket socket = new DatagramSocket(12345);
            while (!id.equals("*")) {
                exito = false;
                byteRecibir = new byte[1024];
                paqueteRecibir = new DatagramPacket(byteRecibir, byteRecibir.length);
                socket.receive(paqueteRecibir);

                id = new String(paqueteRecibir.getData()).trim();
                System.out.println(id);
                if (!id.equals("*")) {
                    for (Jugador j : jugadores) {
                        if (j.getId() == Integer.parseInt(id)) {
                            jugador = j;
                            exito = true;
                            break;
                        }
                    }
                    if (exito == false) {
                        jugador = new Jugador();
                    }


                    //Enviamos Jugador
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    fentrada = new ObjectOutputStream(byteArrayOutputStream);
                    fentrada.writeObject(jugador);
                    InetAddress ipOrigen = paqueteRecibir.getAddress();
                    int puertoOrigen = paqueteRecibir.getPort();
                    byteEnviar = new byte[1024];
                    byteEnviar = byteArrayOutputStream.toByteArray();
                    paqueteEnviar = new DatagramPacket(byteEnviar, byteEnviar.length, ipOrigen, puertoOrigen);
                    socket.send(paqueteEnviar);

                } else {
                    System.out.println("El cliente ha solicitado salir...");
                }
            }
        } catch (SocketException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        }

        private static void crearJugadores() {
            Jugador j1=new Jugador(1,"Lionel","Messi","Delantero",45);
            Jugador j2=new Jugador(2,"Gerard","Pique","Defensa",5);
            Jugador j3=new Jugador(3,"Andres","Iniesta","Centrocampista",15);
            Jugador j4=new Jugador(4,"Xavi","Hernandez","Centrocampista",14);
            Jugador j5=new Jugador(5,"Ter","Stegen","Portero",12);
            jugadores.add(j1);
            jugadores.add(j2);
            jugadores.add(j3);
            jugadores.add(j4);
            jugadores.add(j5);
    }
}
