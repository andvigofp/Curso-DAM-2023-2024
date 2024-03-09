package Ejercicios.Ejercicio5;

public class Gato extends Animal{
    public Gato(Sexo sexo) {
        super(sexo);
    }


    //Método específico para los gatos
    public void arañar() {
        System.out.println("El gato está arañando.");
    }

    //Método para ronronear
    public void ronronear() {
        System.out.println("El gato está ronroneando.");
    }

    //Método para cazar ratones
    public void cazarRaton() {
        System.out.println("El gato está cazando un ratón.");
    }

    //Método sobreescrito para comunicarse
    @Override
    public void comuniacarse() {
        System.out.println("EL gato manualla para comunicarse.");
    }
}
