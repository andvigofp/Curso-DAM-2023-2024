package Boletin2.GestionPuntoventa;


/**
 * 6. Diseña un programa que simule la gestión de un punto de venta con tres terminales que acceden a
 * un objeto Cajero que mantiene la cuenta de las localidades vendidas.
 * • Clase Cajero: es el recurso compartido por los terminales (sección crítica). Contendrá un
 * atributo localidades que llevará la cuenta de las localidades vendidas, que irán
 * incrementando los diferentes terminales. Además, contará con un método
 * mostrarLocalidades. En el constructor simplemente se inicializa el cajero dándole un nombre.
 * • Clase Terminal: Su funcionalidad radica en ir vendiendo localidades (hasta un máximo de
 * 20000), anotar el cambio en el contador general de localidades vendidas. Además, cada
 * terminal mostrará por pantalla el total de localidades vendidas por él.
 * • MainCajero: programa principal desde el que creamos un cajero y 3 terminales que trabajen
 * con ese cajero. Se arrancan los terminales y cuando terminen mostrarnos un mensaje que
 * nos indique cuántas localidades han vendido en total(debería mostrar 60000, en ejecución
 * sincronizada).
 */
public class Cajero {
    private int localidades;
    private String nombreLocalidades;


    Cajero(String nombre) {
        nombreLocalidades = nombre;
    }

    int getLocalidades() {
        return localidades;
    }

    public String getNombreLocalidades() {
        return nombreLocalidades;
    }

    public void setNombreLocalidades(String nombreLocalidades) {
        this.nombreLocalidades = nombreLocalidades;
    }

    String mostrarLocaliades(String nombre) {
        return getNombreLocalidades();
    }




   public synchronized void incrementar() {
       localidades++;
    }




}
