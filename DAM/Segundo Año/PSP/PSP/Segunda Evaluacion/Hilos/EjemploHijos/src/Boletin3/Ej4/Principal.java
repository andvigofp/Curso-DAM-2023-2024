package Boletin3.Ej4;

public class Principal {
    public static void main(String[] args) {

        String[] alumnos = {"Maria", "Juan", "Pepe"};
        Bienvenida bienvenida = new Bienvenida();
        for (int i = 0; i < 3; i++) {
            Alumnos alumno = new Alumnos(bienvenida, alumnos[i]);
            alumno.start();

        }

        Profesor profesor = new Profesor(bienvenida, "Luis");

        profesor.start();

        new Alumnos(bienvenida, "Josito").start();


    }
}
