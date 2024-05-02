package Boletines.Boletin1.Ej5;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Servidor_mod {
    public static void main(String[] args) throws IOException {
        Scanner teclado = new Scanner(System.in);
        int puerto = 6000, numero = 0;
        boolean numeroValido = false;

        //Inicio el servidor
        ServerSocket servidor = new ServerSocket(puerto);

        while (!numeroValido) {
            System.out.println("Introduzca el número de clientes que se van a conectar.");

            try {
                numero = teclado.nextInt();
                if (numero < 0) numeroValido=false;
                else  numeroValido=true;
            }catch (Exception e) {
                System.out.println("Formato númerico incorrecto..");
                numeroValido = false;
            }

        }
        System.out.println("Escuchando en el puerto " + puerto);

        //Acepto peticiones de 3 clientes
        for (int i=1; i<=numero; i++) {
            Socket cliente = servidor.accept(); //Acepta Petición
            System.out.println("Servidor al cliente " + i);

            //Crea flujo de salida al cliente
            OutputStream aux = cliente.getOutputStream();
            DataOutputStream flujoSalida = new DataOutputStream(aux);

            //Le envio un saludo al cliente
            flujoSalida.writeUTF("Saludo al cliente " + i);
            cliente.close(); //Cierro el soket del cliente
        }
        servidor.close(); //Cierro soket servidor
        System.out.println("No hay clientes....");
    }
}
