package org.andres_example.Boletines.Boletin1.Ej5;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 * Crea un programa servidor que pueda antedner hasta 3 clientes. Debe enviar a cada cliente un
 * mensaje indicando el número de cliente que es. Este número será 1,2 o 3. El cliente mostrará
 * el mensaje recibido. cambia el programa para que lo haga para N clientes, siendo N un
 * parámetro que tendrás que definir en el programa.
 */
public class ServidorMod {
    public static void main(String[] args) throws IOException {
        System.out.println("Esperando al cliente...");
        Scanner teclado = new Scanner(System.in);
        int puerto = 6000, N=0;
        boolean numeroValido = false;

        //Inicio el servidor
        ServerSocket servidor = new ServerSocket(puerto);

        while (!numeroValido) {
            System.out.println("Introuzca un número del clientes que se van a conectar");

            try {
                N = teclado.nextInt();
                if (N<0) numeroValido=false;
                else  numeroValido=true;
            }catch (Exception e) {
                System.out.println("Formato no correcto ");
                numeroValido = false;
            }
        }

        System.out.println("Escuchando por el puerto " + puerto);

        //Acepto peticiones de los clientes
        for (int i = 1; i<=N; i++) {
            Socket cliente = servidor.accept(); //Acepta la petición
            System.out.println("Sirviendo al cliente " + i);

            //Creo flujo de salida al cliente
            OutputStream aux = cliente.getOutputStream();
            DataOutputStream flujo = new DataOutputStream(aux);

            //Le envio un saludo
            flujo.writeUTF("Saludo al cliente " + i);
            cliente.close();
        }
        servidor.close(); //Cierro soket del servidor
        System.out.println("No hay más clientes...");
    }
}
