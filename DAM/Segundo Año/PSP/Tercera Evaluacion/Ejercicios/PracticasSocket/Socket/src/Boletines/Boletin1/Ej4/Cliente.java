package Boletines.Boletin1.Ej4;

import java.io.*;
import java.net.Socket;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Cliente {
    public static void main(String[] args) throws IOException {
        String host = "localhost";
        int puerto = 6000;
        Socket cliente = new Socket(host,puerto);

        //Creo flujo de salida al servidor
        OutputStream salida = null;
        salida = cliente.getOutputStream();
        DataOutputStream flujoSalida = new DataOutputStream(salida);

        //Creo flujo de entrada al servidor
        InputStream entrada = null;
        entrada = cliente.getInputStream();
        DataInputStream flujoEntrada = new DataInputStream(entrada);

        //Entrada estandar
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduzca un número: ");
        Integer numero;

        try {
            numero = teclado.nextInt();
        }catch (InputMismatchException e) {
            System.out.println("Número Incorrecto.");
            cliente.close();
            return;
        }
        flujoSalida.writeInt(numero);

        int cuadrado = flujoEntrada.readInt();

        System.out.println("El cuadrado ES => " + cuadrado);
        flujoSalida.close();
        flujoEntrada.close();
        System.out.println("Fin de proceso...");

        cliente.close();

    }
}
