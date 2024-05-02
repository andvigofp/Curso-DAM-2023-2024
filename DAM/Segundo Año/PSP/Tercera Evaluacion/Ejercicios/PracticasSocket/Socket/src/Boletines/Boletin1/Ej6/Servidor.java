package Boletines.Boletin1.Ej6;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Usando Sockets TCP realiza un programa cliente que introduzca cadenas por teclado hasta
 * introducir un asterisco. Las cadenas se enviarán a un programa servidor. El programa servidor
 * aceptará la conexión de un único cliente y por cada cadena recibida le devolverá al cliente el
 * número de caracteres de la misma. El programa servidor finalizará cuando reciba un asterisco
 * como cadena.
 */
public class Servidor {
    public static void main(String[] args) throws IOException {
        int puerto = 6000;
        int cuentaCaracteres;

        //Inicio del servidor
        ServerSocket servidor = new ServerSocket(puerto);

        System.out.println("Esperando al cliente...");
        Socket cliente = servidor.accept();
        String cadena = "";

        InputStream entrada = null;
        DataInputStream flujoEntrada = null;
        OutputStream salida = null;
        DataOutputStream fujoSalida = null;

        //Bucle que repita hasta que pongamos un * para salir del buccle
        while (!cadena.equals("*")) {
            entrada=cliente.getInputStream();
            flujoEntrada = new DataInputStream(entrada);
            cadena = flujoEntrada.readUTF();
            cuentaCaracteres = cadena.length();
            salida= cliente.getOutputStream();
            fujoSalida = new DataOutputStream(salida);
            fujoSalida.writeInt(cuentaCaracteres);
        }

        //Cerrando servidor
        System.out.println("Cerrando conexión...");

        fujoSalida.close();
        salida.close();
        flujoEntrada.close();
        entrada.close();
        servidor.close();
    }
}
