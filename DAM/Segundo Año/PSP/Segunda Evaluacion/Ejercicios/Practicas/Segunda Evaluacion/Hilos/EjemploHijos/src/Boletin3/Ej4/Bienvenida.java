package Boletin3.Ej4;

public class Bienvenida {
    private boolean bandera;
    public Bienvenida() {
        bandera=false;

    }



    public synchronized  void SaludoAlumnos(String nombre){
        while(!bandera){
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        System.out.println(nombre+" Buenos dias profesor");
    }

    public synchronized  void LlegadaProfesor(String nombre){
        System.out.println("Buenos dias, soy el profesor "+nombre+" Vamos a empezar la clase");
        bandera=true;
        notifyAll();

    }

}
