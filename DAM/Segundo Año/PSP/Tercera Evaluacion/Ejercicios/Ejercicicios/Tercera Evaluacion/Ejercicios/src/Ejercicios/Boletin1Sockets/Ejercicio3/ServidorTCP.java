package Ejercicios.Boletin1Sockets.Ejercicio3;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Realiza un programa servidor TCP que acepte 2 cliente. Mostrar para cada cliente conectados
 * sus puertos local y remoto. Implementar también el programa cliente, donde se muestren los
 * puertos lcoales y remotos a los que se enceuntre conectado, así como la IP de la máquina
 * remota a la que se conecta
 */
public class ServidorTCP {
    public static void main(String[] args) throws IOException {
        int numeroPuerto = 6000;
        ServerSocket servidor = new ServerSocket(numeroPuerto);
        System.out.println("Escuchando en " + servidor.getLocalPort());

        System.out.println("Esperando primer cliente");
        Socket cliente1 = servidor.accept(); //Esperando a un cliente
        System.out.println("Primer cliente atendido");
        System.out.println("Puerto del clente 1 getLocalPort(): " + cliente1.getPort());
        System.out.println("Puerto del cliente 1 getPort(): " + cliente1.getPort());

        System.out.println("Esperando segundo cliente");
        Socket cliente2 = servidor.accept(); //Esperando a un cliente
        System.out.println("Segundo cliente atendido");
        System.out.println("Puerto del clente 2 getLocalPort(): " + cliente2.getPort());
        System.out.println("Puerto del cliente 2 getPort(): " + cliente2.getPort());

        //realizar acciones con cliente2
        servidor.close(); //Cierro soket servido


    }
}
