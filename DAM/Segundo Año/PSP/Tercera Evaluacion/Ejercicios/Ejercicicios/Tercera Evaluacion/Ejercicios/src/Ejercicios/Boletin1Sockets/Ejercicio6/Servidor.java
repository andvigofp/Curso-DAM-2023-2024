package Ejercicios.Boletin1Sockets.Ejercicio6;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 * Unsando Sokets TCP realiza un programa cliente que introduzca cadenas por teclaod hasta
 * introduzcir un asterisco. Las cadenas se enviarán a un programa servidor. El programa servidor
 * aceptará de caracteres de la misma. El programa servidor finalizará cuando reciba un asterisco
 * como cadena.
 */
public class Servidor {
    public static void main(String[] args) throws IOException {
        int puerto=6000;
        int cuentaCaracteres;

        ServerSocket servidor=new ServerSocket(puerto);
        System.out.println("Esperando al cliente...");
        Socket cliente=servidor.accept();
        String cadena = "";

        InputStream entrada=null;
        DataInputStream flujoEntrada=null;
        OutputStream salida=null;
        DataOutputStream flujoSalida=null;

        while(!cadena.equalsIgnoreCase("*")){
            entrada=cliente.getInputStream();
            flujoEntrada=new DataInputStream(entrada);
            cadena=flujoEntrada.readUTF();
            cuentaCaracteres=cadena.length();
            salida=cliente.getOutputStream();
            flujoSalida=new DataOutputStream(salida);
            flujoSalida.writeInt(cuentaCaracteres);

        }
        flujoSalida.close();
        salida.close();
        flujoEntrada.close();
        entrada.close();
        cliente.close();
        servidor.close();
    }
}

