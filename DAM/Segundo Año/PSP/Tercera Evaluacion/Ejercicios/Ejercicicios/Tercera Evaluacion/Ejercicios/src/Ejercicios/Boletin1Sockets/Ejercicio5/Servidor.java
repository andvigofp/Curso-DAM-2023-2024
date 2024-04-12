package Ejercicios.Boletin1Sockets.Ejercicio5;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Crea un programa servidor que pueda antedner hasta 3 clientes. Debe enviar a cada cliente un
 * mensaje indicando el número de cliente que es. Este número será 1,2 o 3. El cliente mostrará
 * el mensaje recibido. cambia el programa para que lo haga para N clientes, siendo N un
 * parámetro que tendrás que definir en el programa.
 */

public class Servidor {
    public static void main(String[] args) throws IOException {
        int puerto=6000;//Puerto por el que escucha
        //Inicio del servidor
        ServerSocket servidor = new ServerSocket(puerto);
        System.out.println("Escuchando por el puerto " + puerto);

        //Acepto peticiones de 3 clientes
        for (int i=1; i<=3; i++) {
            Socket cliente = servidor.accept(); //Acepta Petición
            System.out.println("Servidor al cliente " + i);

            //Crei flujo de salida al cliente
            OutputStream aux = cliente.getOutputStream();
            DataOutputStream flujo = new DataOutputStream(aux);

            //Le envio un saludo
            flujo.writeUTF("Saludo al cliente " + i);
            cliente.close(); //Cierro el soket del cliente
        }
        servidor.close(); //Cierro soket servidor
        System.out.println("No hay clientes...");
    }//main
}//Fin
