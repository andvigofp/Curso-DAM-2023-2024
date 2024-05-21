package Boletines.Boletin1.Ej3;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Realiza un programa servidor TCP que acepte 2 cliente. Mostrar para cada cliente conectados
 * sus puertos local y remoto. Implementar también el programa cliente, donde se muestren los
 * puertos lcoales y remotos a los que se enceuntre conectado, así como la IP de la máquina
 * remota a la que se conecta
 */
public class Servidor {
    public static void main(String[] args) throws IOException {
    int puerto =6000;
    System.out.println("Esperando al cliente....");

        ServerSocket servidor = new ServerSocket(puerto);
        System.out.println("Esuchando en " + servidor.getLocalPort());

        System.out.println("Esperando primer cliente: ");
        Socket cliente1 = servidor.accept(); //Esperando a un cliente
        System.out.println("primer cliente atendido");
        System.out.println("Puerto del cliente 1 getLocalPort(): " + cliente1.getLocalPort());
        System.out.println("Puerti de cliente 1 getPort(): " + cliente1.getPort());

        System.out.println("Esperando segundo cliente...");
        Socket clienete2 = servidor.accept(); //Esperando a un cliente
        System.out.println("Segundo cliente atendido");
        System.out.println("Puerto del cliente 2 getLocalPort(): " + clienete2.getLocalPort());
        System.out.println("Puerto del cliente 2 getPort(): " + clienete2.getPort());


        servidor.close(); //Cierro socket servidor
    }
}
