package org.andres_example.Boletines.Boletin1.Ej5;

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
 * */

public class Servidor {
    public static void main(String[] args) throws IOException {
        System.out.println("Esperando al cliente");
        int puerto = 6000;

        //Inicio del servidor
        ServerSocket servidor = new ServerSocket(puerto);

        //Acepto peticiones a 3 clientes
        for (int i=1; i<=3; i++) {
            Socket cliente = servidor.accept(); //Acepta la petición
            System.out.println("Servidor del cliente " + i);

            //Crea flujo de salida al cliente
            OutputStream aux = cliente.getOutputStream();
            DataOutputStream flujo = new DataOutputStream(aux);

            //Le envio un saludo
            flujo.writeUTF("Saludo al cliente " + i);
            cliente.close();
        }
        servidor.close();
        System.out.println("No hay cliente...");
    }
}
