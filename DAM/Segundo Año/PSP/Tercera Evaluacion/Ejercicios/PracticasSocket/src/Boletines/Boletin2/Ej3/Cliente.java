package Boletines.Boletin2.Ej3;

import javax.imageio.IIOException;
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

        Socket cliente=null;
        try {
            cliente = new Socket(host,puerto);
            System.out.println("programa cliente iniciado....");
        } catch (IOException e) {
            System.out.println("ERROR AL ESTABLECER LA CONEXION CON EL SERVIDOR....");
            System.exit(0);
        }

        //Flujo de entrada para objectos
        ObjectInputStream fentrada = new ObjectInputStream(cliente.getInputStream());

        //flujo de salida para objectos
        ObjectOutputStream fsalida = new ObjectOutputStream(cliente.getOutputStream());

        int numero=0;

        do {
            System.out.println("Introduce un numero: ");

            try {
                numero= teclado.nextInt();
            }catch (InputMismatchException e) {
                //sc.nextLine();
                numero = 1;
                System.out.print("\tNumero incorrecto...\n");
                continue;
            }
            Numero n = new Numero();
            n.setNumero(numero);

            //Numeros n = new Numeros(numero);

            // Se envia el objeto
            fsalida.writeObject(n);

            //Se recibe un objeco
            if (numero > 0) {
                Numero dato = (Numero) fentrada.readObject(); //re
                System.out.println("\tCuadrado : " + dato.getCuadrado() + ", Cubo:  " + dato.getCubo());
            }

        }while (numero > 0);

        System.out.println("CLIENTE FINALIZADO....");

        // CERRAR STREAMS Y SOCKETS
        fentrada.close();
        fsalida.close();
        cliente.close();
    }
}
