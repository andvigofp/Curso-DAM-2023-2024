package org.andres_example.Practicas.TCP.Calculadora;

import org.andres_example.Examenes.ExamenTerceraEva.Calculadora.Calculadora;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class HiloServidor extends Thread{
    private ObjectInputStream fentrada;
    private ObjectOutputStream fsalida;
    private Socket cliente;

    public HiloServidor(Socket cliente) {
        this.cliente = cliente;

        try {
            this.fentrada = new ObjectInputStream(cliente.getInputStream());
            this.fsalida = new ObjectOutputStream(cliente.getOutputStream());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void run() {
        System.out.println("Comienza la ejecucíon del hilo");
        Calculadora calculadora = null;

        try {
            calculadora = (Calculadora) fentrada.readObject();
            System.out.println("Recibe datos del cliente.");
            switch (calculadora.getOperacion()) {
                case "sumar":
                    calculadora.suma();
                    break;
                case "restar":
                    calculadora.resta();
                    break;
                case "multiplicar":
                    calculadora.multiplciacion();
                    break;
                case "division":
                    calculadora.division();
                    break;
                default:
                    System.out.println("Error: no elegiste la opción correcta: ");
                    break;
            }
            fsalida.reset();
            fsalida.writeObject(calculadora);
            System.out.println("Envia datos del cliente.");

            fentrada.close();
            fsalida.close();
            cliente.close();
            System.out.println("Fin del servidor al cliente....");
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
