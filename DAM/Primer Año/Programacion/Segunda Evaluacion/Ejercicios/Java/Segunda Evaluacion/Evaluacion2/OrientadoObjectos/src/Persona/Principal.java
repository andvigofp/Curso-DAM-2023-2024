package Persona;

import ProfeHerencia.Persona;

public class Principal {
    public static void main(String[] args) {
        Persona[] personas = new Persona[10];

        personas[0] = new Persona("Angel",21);
        personas[1] = new Persona("Pepe",22);
        personas[2] = new Persona("Luis",30);
        personas[3] = new Persona("Tania",50);
        personas[4] = new Persona("Susana",30);
        personas[5] = new Persona("Berto",40);
        personas[6] = new Persona("Carlos",28);
        personas[7] = new Persona("Nuria",27);
        personas[8] = new Persona("Nolito",31);
        personas[9] = new Empleado("Nacho",60,2000);


       for (int i=0; i< personas.length; i++) {
           System.out.println(" " + personas[i]);
       }
        System.out.println("-------------------------------");

       for (Persona j: personas) {
           System.out.println(j);
       }
    }


}
