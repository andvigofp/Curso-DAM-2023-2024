package Ejercicios.Boletin1Sockets.Ejercicio5;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

public class Cliente {
    public static void main(String[] args) throws IOException {
        String host="localhost";
        int puerto=6000;
        System.out.println("Conectado con el servidor...");

        //Array Socket
        Socket Cliente=null;

        try {
            Cliente=new Socket(host,puerto);
        } catch (IOException e) {
            System.out.println("SERVIDOR CERRADO.");
        }
        //Recibo  salida del servidor
        InputStream aux = Cliente.getInputStream();
        DataInputStream flujo = new DataInputStream(aux);

        System.out.println("Recibiendo del servidor " + flujo.readUTF());

        System.out.println("CLIENTE CERRADO.");

        Cliente.close();//Cierra el socket
    }//main
}
