package Boletines.Boletin2.Ej5;

import java.io.*;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

/**
 * Crea una clase de nombre Curso, con los siguientes atributos:
 * String id;
 * String descripcion;
 * Crea otra clase de nombre Alumno, con los siguientes atributos:
 * String idalumno;
 * String nombre;
 * Curso curso;
 * int nota;
 * Crea en las clases anteriores los constructores y métodos get y set necesarios.
 * Utilizando sockets UDP crea un programa servidor que inicialice un array de 5 objetos de tipo
 * Alumno.
 * El servidor, en un bucle infinito, solicitará al cliente un idAlumno y le devolverá el objeto
 * Alumno que corresponda.
 * Crea un programa cliente en el que se introduzca por teclado el idAlumno que se desea
 * consultar. Dicho programa recogerá datos hasta recibir un * por parte del usuario.
 * Si el idAlumno no se encuentra registrado, el servidor le devolverá un objeto Alumno con datos
 * vacíos.
 */

public class ServidorUDP {
    static Alumno arrayObectos[] = new Alumno[5];

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Curso dam1 = new Curso("1", "Primero DAM");
        Curso dam2 = new Curso("2", "Segundo DAM");

        arrayObectos[0] = new Alumno("20", "Fernando", dam1,7);
        arrayObectos[1] = new Alumno("32", "Angel", dam2,4);
        arrayObectos[2] = new Alumno("1", "Luis", dam2,8);
        arrayObectos[3] = new Alumno("25", "María", dam1,6);
        arrayObectos[4] = new Alumno("2", "Bea", dam1,4);

        DatagramSocket serverSocket = new DatagramSocket(9876);

        while (true) {
            System.out.println("Servidor Esperando identificador...");

            byte[] recibidos = new byte[1024];
            byte[] enviados = new byte[1024];

            DatagramPacket paqueteReibido = new DatagramPacket(recibidos, recibidos.length);
            serverSocket.receive(paqueteReibido);

            ByteArrayInputStream bais = new ByteArrayInputStream(recibidos);
            ObjectInputStream in = new ObjectInputStream(bais);
            String identificador = (String) in.readObject();

            InetAddress IPOrigen = paqueteReibido.getAddress();
            int puerto = paqueteReibido.getPort();

            System.out.println("\tConsultando id: " + identificador);

            Alumno alum = DatosAlumno(identificador);

            ByteArrayOutputStream bs = new ByteArrayOutputStream();
            ObjectOutputStream out = new ObjectOutputStream(bs);
            out.writeObject(alum);
            out.close();
            enviados = bs.toByteArray();

            DatagramPacket paqueteEnviado = new DatagramPacket(enviados, enviados.length, IPOrigen, puerto);
            serverSocket.send(paqueteEnviado);
        }

    }

    private static Alumno DatosAlumno(String identificador) {
        Curso noexiste = new Curso("*", "Sin datos");
        Alumno al = new Alumno(identificador, "No existe", noexiste, -1);

        for (int i=0; i<arrayObectos.length; i++) {
            if (arrayObectos[i].getIdAlumno().equals(identificador))
                al = arrayObectos[i];
        }
        return al;
    }
}
