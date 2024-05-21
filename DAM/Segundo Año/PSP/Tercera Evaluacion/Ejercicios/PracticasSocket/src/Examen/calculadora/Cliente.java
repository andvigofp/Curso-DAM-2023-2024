package Examen.calculadora;

import java.io.*;
import java.net.Socket;

public class Cliente {
    public static void main(String[] args) {
        System.out.println("Cliente Iniciado....");
        String host = "localhost";
        int puerto = 12345;

        try {
            Socket socket = new Socket(host,puerto);
            BufferedReader entrada = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter salida = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()),true);
            BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Intrduce la operación a realizar (suma, resta, multiplicación, división):");
            String opracion = teclado.readLine().toLowerCase();
            System.out.println("Introduce el primer oprando:");
            double op1 = Double.parseDouble(teclado.readLine());
            System.out.println("Introduce el segundo operando: ");
            double opc2 = Double.parseDouble(teclado.readLine());

            //Enviamos la operación y los operamos al servidor
            salida.println(opracion);
            salida.println(op1);
            salida.println(opc2);

            //Leemos la respuesta del servidor y la mostramos por pantalla
            String resultado = entrada.readLine();
            System.out.println("Resultado: " + resultado);

            //Cerramos los flujos y el socket
            entrada.close();
            salida.close();
            socket.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

