package Examenes.Ej1;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 1. Realiza un programa cliente-servidor que implemente una calculadora (suma,
 * resta, multiplicación y división). El servidor ha de poder atender a múltiples
 * clientes simultáneamente.
 *  El programa servidor creará un stream socket y aguardará conexiones.
 *  El programa cliente recogerá de teclado la operación a realizar y los operandos,
 * y se los enviará al servidor para que la resuelva. A continuación, leerá la
 * respuesta del servidor y la mostrará por pantalla.
 */

public class Cliente {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 12345); // Conexión al servidor en el puerto 12345
            BufferedReader entrada = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter salida = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()), true);
            BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Introduce la operación a realizar (suma, resta, multiplicación, división):");
            String operacion = teclado.readLine().toLowerCase();
            System.out.println("Introduce el primer operando:");
            double op1 = Double.parseDouble(teclado.readLine());
            System.out.println("Introduce el segundo operando:");
            double op2 = Double.parseDouble(teclado.readLine());

            // Enviamos la operación y los operandos al servidor
            salida.println(operacion);
            salida.println(op1);
            salida.println(op2);

            // Leemos la respuesta del servidor y la mostramos por pantalla
            String resultado = entrada.readLine();
            System.out.println("Resultado: " + resultado);

            // Cerramos los flujos y el socket
            entrada.close();
            salida.close();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}