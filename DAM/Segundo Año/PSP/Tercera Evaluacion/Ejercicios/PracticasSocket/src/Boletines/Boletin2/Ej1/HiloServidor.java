package Boletines.Boletin2.Ej1;

import javax.imageio.IIOException;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.net.SocketException;

public class HiloServidor extends Thread{
    DataInputStream fentrada;
    ObjectOutputStream fsalida;
    Socket socket = null;
    Profesor arrayObjectosProfesor[];
    Integer idCliente;

    public HiloServidor(Socket s, Profesor[] arrayObjectosProfesor, int idCliente) {
        socket = s;
        this.arrayObjectosProfesor = arrayObjectosProfesor;
        this.idCliente = idCliente;

        try {
            fsalida = new ObjectOutputStream(socket.getOutputStream());
            fentrada = new DataInputStream(socket.getInputStream());
        } catch (IOException e) {
            System.out.println("Error de E/S con cliente " + idCliente);
            e.printStackTrace();
        }
    }

    public void run() {
        String cadena = "";
        try {
            fsalida.writeObject(idCliente);
        }catch (IOException e) {
            System.out.println("Error al enviar idcliente con cliente " + idCliente);
            e.printStackTrace();
        }

        while (!cadena.trim().equals("*")) {
            Profesor profesor =new Profesor();

            try {
                try {
                    cadena = fentrada.readUTF();
                } catch (SocketException e) {
                    System.out.println("\tError al leer el cliente: " + idCliente);
                    break;
                }catch (EOFException EO) {
                    System.out.println("El cliente " + idCliente + " Ha finalizado ");
                    break;
                }
                System.out.println("\tConsultando id " + cadena + ", solicitado por el cliente " + idCliente);

                int id = Integer.parseInt(cadena);
                profesor = DatosProfesor(id);

                fsalida.reset();
                fsalida.writeObject(profesor);
            }catch (IOException e) {
                e.printStackTrace();
            }
        }

            System.out.println("Fin con: " + socket.toString() + " Del cliente " + idCliente);

                try {
                    fsalida.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                try {
                    fentrada.close();
                    socket.close();
                }catch (IOException e) {
                    e.printStackTrace();
                }
            }
            private Profesor DatosProfesor(int identificador) {
            Especialidad noexiste = new Especialidad(0, "sin datos");

            Profesor profesor = new Profesor(identificador, "No existe", null, noexiste);

            for (int i=0; i<arrayObjectosProfesor.length; i++) {
                if (arrayObjectosProfesor[i].getIdPorofesor() == identificador)
                    profesor = arrayObjectosProfesor[i];
                }
            return profesor;
         }
    }

