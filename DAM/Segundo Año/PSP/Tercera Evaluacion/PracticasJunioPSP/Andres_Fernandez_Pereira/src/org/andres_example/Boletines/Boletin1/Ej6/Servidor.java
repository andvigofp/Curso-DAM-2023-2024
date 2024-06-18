package org.andres_example.Boletines.Boletin1.Ej6;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Unsando Sokets TCP realiza un programa cliente que introduzca cadenas por teclaod hasta
 * introduzcir un asterisco. Las cadenas se enviarán a un programa servidor. El programa servidor
 * aceptará de caracteres de la misma. El programa servidor finalizará cuando reciba un asterisco
 * como cadena.
 */

public class Servidor {
    public static void main(String[] args) throws IOException {
        System.out.println("Esperando al cliente...");
        int puerto = 6000, cuentraCaracteres;

        //Inicio del servidor
        ServerSocket servidor = new ServerSocket(puerto);
        Socket cliente = servidor.accept();
        String cadena = "";

        InputStream entrada = null;
        DataInputStream flujoEntrada = null;
        OutputStream salida = null;
        DataOutputStream flujoSalida = null;

        while (!cadena.equals("*")) {
            entrada = cliente.getInputStream();
            flujoEntrada = new DataInputStream(entrada);
            cadena = flujoEntrada.readUTF();
            cuentraCaracteres = cadena.length();
            salida = cliente.getOutputStream();
            flujoSalida = new DataOutputStream(salida);
            flujoSalida.writeInt(cuentraCaracteres);
        }

        System.out.println("Cerrando conexión....");

        flujoSalida.close();
        salida.close();
        flujoEntrada.close();
        entrada.close();
        cliente.close();
        servidor.close();
    }
}
