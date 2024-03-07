package org.andres.pooherencia;

public class EjemploHerencia {
    public static void main(String[] args) {
        Alumno alumno = new Alumno();
        Profesor profesor = new Profesor();

        alumno.setNombre(" gunersindo ");
        Persona alumno2 = new Alumno();
        ((Alumno)alumno2).setInstituto(" santa catalina ");
        profesor.setNombre("veronica");
        profesor.setApellido("guzman");
        profesor.setAsignatura("Matemáticas");

        System.out.println(alumno.getNombre() + " " + alumno.getApellido());
        System.out.println("profesor " + profesor.getAsignatura() + " "
                    + profesor.getNombre() + " " + profesor.getApellido() +
                ((Alumno)alumno2).getInstituto());
    }
}
