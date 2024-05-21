package Agenda;

import java.util.ArrayList;

/**
 * Se va a implementar una agenda telefónica de contactos.
 * Un contacto está definido por un nombre y un teléfono (No es necesario validar). Un contacto es igual a otro cuando sus nombres son iguales.
 * Una agenda de contactos está formada por un conjunto de contactos
 *
 * La agenda se podrá crear de dos formas, indicándole el tamaño o con un tamaño por defecto (10)
 * Métodos:
 *     • anhadirContacto(Contacto c): Añade un contacto a la agenda, si no se pueden meter más a la agenda se indicará por pantalla. No se pueden meter contactos que existan, es decir, no podemos duplicar nombres, aunque tengan distinto teléfono.
 *     • existeContacto(Contacto c): indica si el contacto pasado existe o no.
 *     • listarContactos(): Lista toda la agenda
 *     • buscaContacto(String nombre): busca un contacto por su nombre y muestra su teléfono.
 *     • eliminarContacto(Contacto c): elimina el contacto de la agenda, indica si se ha eliminado o no por pantalla
 *     • agendaLlena(): indica si la agenda está llena.
 *     • huecosLibres(): indica cuántos contactos más podemos meter.
 * Crea un menú con opciones por consola para probar todas estas funcionalidades.
 */
public class Agenda {
    private ArrayList<Contacto> contactos;
    private final int TAMANO;


    public Agenda(ArrayList<Contacto> contactos, int TAMANO) {
        this.contactos = contactos;
        this.TAMANO = 10;
    }

    public void anadirContaco(Contacto c) {
        if (existeContacto(c)) {
            System.out.println("El contacto con ese nombre ya existe ");
        }else if (agebdaLlena()) {
            System.out.println("La agenda está llena, no se pueden meter más contactos");
        }else {
            contactos.add(c);
        }
    }



    public boolean existeContacto(Contacto c) {
       for (int i=0; i<contactos.size(); i++) {
           if (contactos.get(i).getNombre().trim()
                   .equalsIgnoreCase(c.getNombre().trim())) {
               return true;
           }
       }
       return false;
    }

    public void listarContactos() {
        if (contactos.isEmpty()) {
            System.out.println("No hay contactos que mostrar");
        }else {
            for (int i=0; i<contactos.size(); i++) {
                System.out.println(contactos.get(i));
            }
        }
    }

    public void buscarPorNombre(String nombre) {
        boolean encontrado=false;
        for (int i=0; i<contactos.size() && !encontrado; i++) {
            if (contactos.get(i).getNombre().trim()
                    .equalsIgnoreCase(nombre.trim())) {
                System.out.println("Su telefono es " + contactos.get(i).getTelefono());
            }
        }
    }
    public boolean agebdaLlena() {
        return this.contactos.size() >=this.TAMANO;
    }
}
