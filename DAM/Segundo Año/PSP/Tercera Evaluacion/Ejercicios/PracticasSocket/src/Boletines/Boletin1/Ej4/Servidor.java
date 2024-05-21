package Boletines.Boletin1.Ej4;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Crea un programa cliente que introduzca por teclado un númerop entero y se lo envié al
 * servidor. El servidor le devolverá el cuadrado del número.
 */
public class Servidor {
    public static void main(String[] args) throws IOException {
        int puerto = 6000;
        ServerSocket servidor = null;

        servidor = new ServerSocket(puerto);

        Socket clienteConectado = null;
        System.out.println("Esperando al cliente....");
        clienteConectado = servidor.accept();

        //Creo flujo de salida al cliente
        OutputStream salida = null;
        salida = clienteConectado.getOutputStream();
        DataOutputStream flujoSalida = new DataOutputStream(salida);

        //Creo flujo de entrada del cliente
        InputStream entrada = null;
        entrada = clienteConectado.getInputStream();
        DataInputStream flujoEntrada = new DataInputStream(entrada);

        //Cliente me envia el mensaje
        int numero = flujoEntrada.readInt();
        System.out.println("Número enviado por elcliente: " + numero);

        numero = numero*numero;
        flujoSalida.writeInt(numero);

        //Cerrar streams y sockets
        entrada.close();
        flujoEntrada.close();
        salida.close();
        flujoSalida.close();
        clienteConectado.close();
        servidor.close();
    }
}
