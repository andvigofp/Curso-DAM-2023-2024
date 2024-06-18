package org.andres_example.Boletines.Boletin2.Ej3;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Cliente {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        String host = "localhost";
        int puerto = 6000;

        Scanner teclado = new Scanner(System.in);

        Socket cliente = null;

        try {
            cliente = new Socket(host, puerto);
            System.out.println("Programa cliente iniciado...");
        } catch (IOException e) {
            System.out.println("ERROR AL ESTABLECER LA CONEXIÓN CON EL SERVIDOR...");
            System.exit(0);
        }

        //Flujo de entrada para objectos
        ObjectInputStream fentrada = new ObjectInputStream(cliente.getInputStream());

        //Flujo de salida para objectos
        ObjectOutputStream fsalida = new ObjectOutputStream(cliente.getOutputStream());

        int numero =0;

        do {
            System.out.println("Introduzca un número: ");

            try {
                numero = teclado.nextInt();
            }catch (InputMismatchException e) {
                numero = 1;
                System.out.println("\tNúmero incorrecto....\n");
                continue;
            }
            Numero n = new Numero();
            n.setNumero(numero);

            //Se recibe el objecto
            fsalida.writeObject(n);

            //Se recibe un objecto
            if (numero > 0) {
                Numero dato = (Numero) fentrada.readObject();
                System.out.println("\tCuadrado: " + dato.getCuadrado() + ", Cubo " + dato.getCubo());
            }
        }while (numero > 0);

        System.out.println("CLIENTE FINALIZADO...");

        //CERRAR STREAMS Y SCOKETS
        fentrada.close();
        fsalida.close();
        cliente.close();
    }
}
