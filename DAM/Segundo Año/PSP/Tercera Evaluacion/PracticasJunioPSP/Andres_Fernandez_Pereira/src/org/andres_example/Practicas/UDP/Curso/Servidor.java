package org.andres_example.Practicas.UDP.Curso;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class Servidor {
   public static Alumno[] alumnos = new Alumno[5];
    public static void main(String[] args) {
        llenarDatos();
        String idAlumno="";
        byte[] byteRecibir;
        byte[] byteEnviar;
        DatagramPacket paqueteRecibir = null;
        DatagramPacket paqueteEnviar;

        ObjectOutputStream fsalida = null;
        Alumno alumno = null;
        boolean exito=false;

        try {
            DatagramSocket socket = new DatagramSocket(6000);
            while (!idAlumno.equals("*")) {
                exito = false;
                byteRecibir = new byte[1024];

                paqueteRecibir = new DatagramPacket(byteRecibir, byteRecibir.length);
                socket.receive(paqueteRecibir);

                idAlumno = new String(paqueteRecibir.getData()).trim();
                if (!idAlumno.equals("*")) {
                    for (Alumno al : alumnos) {
                        if (al.getIdAlumno().equals(idAlumno)) {
                            alumno = al;
                            exito = true;
                            break;
                        }
                    }
                    if (exito == false) {
                        alumno = new Alumno();
                    }
                    byteEnviar = new byte[1024];
                    InetAddress ipRecibido = paqueteRecibir.getAddress();
                    System.out.println(ipRecibido);
                    int puerto = paqueteRecibir.getPort();

                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    fsalida = new ObjectOutputStream(byteArrayOutputStream);
                    fsalida.writeObject(alumno);
                    byteEnviar = byteArrayOutputStream.toByteArray();
                    paqueteEnviar = new DatagramPacket(byteEnviar, byteEnviar.length, ipRecibido, puerto);
                    socket.send(paqueteEnviar);

                } else {
                    System.out.println("El cliente ha solicitado salir");
                }
            }
        } catch (SocketException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void llenarDatos() {
        Curso c1 = new Curso("C1", "DAM");
        Curso c2 = new Curso("C2", "DAW");
        Curso c3 = new Curso("C3","ASIR");

        Alumno alumno1=new Alumno("malv74","Antonio Lorenzo",c1,9);
        Alumno alumno2=new Alumno("agr87","Andres Garcia",c2,4);
        Alumno alumno3=new Alumno("mgb90","Maria Gomez",c3,5);
        Alumno alumno4=new Alumno("mel87","Marisa Estebanez",c1,7);
        Alumno alumno5=new Alumno("ndy78","Nuria Diaz",c2,8);
        alumnos[0] = alumno1;
        alumnos[1] = alumno2;
        alumnos[2] = alumno3;
        alumnos[3] = alumno4;
        alumnos[4] = alumno5;

    }
}
