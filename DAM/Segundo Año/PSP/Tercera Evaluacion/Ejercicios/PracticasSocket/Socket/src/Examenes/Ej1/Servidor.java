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

public class Servidor {
    public static void main(String[] args) {
        System.out.println("Servidor iniciado.....");
        try {
            ServerSocket serverSocket = new ServerSocket(12345); // Crear un ServerSocket en el puerto 12345

            while (true) {
                Socket socket = serverSocket.accept(); // Esperar a que un cliente se conecte
                System.out.println("Cliente conectado desde " + socket.getInetAddress());

                // Crear flujos de entrada y salida para comunicarse con el cliente
                BufferedReader entrada = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                PrintWriter salida = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()), true);

                // Leer la operación y los operandos enviados por el cliente
                String operacion = entrada.readLine();
                double op1 = Double.parseDouble(entrada.readLine());
                double op2 = Double.parseDouble(entrada.readLine());

                // Realizar la operación
                double resultado = 0;
                switch (operacion) {
                    case "suma":
                        resultado = op1 + op2;
                        break;
                    case "resta":
                        resultado = op1 - op2;
                        break;
                    case "multiplicación":
                        resultado = op1 * op2;
                        break;
                    case "división":
                        if (op2 != 0) {
                            resultado = op1 / op2;
                        } else {
                            salida.println("Error: No se puede dividir por cero");
                            socket.close();
                            continue;
                        }
                        break;
                    default:
                        salida.println("Error: Operación no válida");
                        socket.close();
                        continue;
                }

                // Enviar el resultado al cliente
                salida.println(resultado);

                // Cerrar flujos y socket
                entrada.close();
                salida.close();
                socket.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
