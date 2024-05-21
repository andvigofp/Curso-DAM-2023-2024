package Boletines.Boletin2.Ej3;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Crea una clase Java llamada Numeros que defina 3 atributos , uno de ellos entero, y los otros
 * 2 de tipo long:
 * int numero;
 * long cuadrado;
 * long cubo;
 * Define un constructor con parámetros y otro sin parámetros. Define los métodos get y set de
 * los atributos. Crea un programa cliente que introduzca por teclado un número e inicialice un
 * objeto Numeros, el atributo numero debe contener el número introducido por teclado. Debe
 * enviar ese objeto al programa servidor. El proceso se repetirá mientras el número introducido
 * por teclado sea mayor que 0.
 * Crea un programa servidor que reciba un objeto Numeros. Debe calcular el cuadrado y el cubo
 * del atributo numero y debe enviar el objeto al cliente con los cálculos realizados, el cuadrado
 * y el cubo en sus atributos respectivos. El cliente recibirá el objeto y visualizará el cuadrado y
 * el cubo del número introducido por teclado. El programa servidor finalizará cuando el número
 * recibido en el objeto Numeros sea menor o igual que 0.
 * Controlar posibles errores, por ejemplo si ejecutamos el cliente y el servidor no está iniciado,
 * o si estando el servidor ejecutándose ocurre algún error en el cliente, o este finaliza
 * inesperadamente, etc.
 */

public class Servidor {
    public static void main(String[] args) throws IOException {
        int numeroPuerto=6000;
        ServerSocket servidor = new ServerSocket(numeroPuerto);

        System.out.println("Esperando cliente...");
        Socket cliente = servidor.accept();

        ObjectOutputStream outputStream = new ObjectOutputStream(cliente.getOutputStream());

        ObjectInputStream inObjecto = new ObjectInputStream(cliente.getInputStream());

        Numero dato = new Numero();

        try {
            dato = (Numero) inObjecto.readObject();
        } catch (ClassNotFoundException e) {
            System.out.println("ERROR AL RECIBIR DATOS DEL CLIENTE..." + e.getMessage());
            System.exit(0);
        }
        while (dato.getNumero() > 0) {
            long cuadrado = dato.getNumero() * dato.getNumero();
            long cubo = cuadrado * dato.getNumero();

            dato.setCubo(cubo);
            dato.setCuadrado(cuadrado);

            System.out.println("recibido: " + dato.getNumero());
            outputStream.writeObject(dato);

            try {
                dato = (Numero) inObjecto.readObject();
            }catch (ClassNotFoundException e) {
                System.out.println("ERROR AL RECIBIR DATOS DEL CLIENTE..." + e.getMessage());
                System.exit(0);
            }
        }
        System.out.println("Servidor finalizado...");

        outputStream.close();
        inObjecto.close();
        cliente.close();
        servidor.close();
    }
}
