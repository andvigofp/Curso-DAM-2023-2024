package Ejercicios.Ejercicio5;

public class Lagarto extends Animal{
    public Lagarto(Sexo sexo) {
        super(sexo);
    }

    //Método específico para los lagartos
    public void camuflarse() {
        System.out.println("El lagarto está camuflándose para pasar desapercibido.");
    }

    //Método para cazar insectos
    public void cazarInsectos() {
        System.out.println("El lagarto está cazando insectos.");
    }

    //Método para moverse en zigzag
    public void moverseZigzag() {
        System.out.println("El lagarto se mueve en zigzag.");
    }

        //Método sobreescrito para comunicarse
    @Override
    public void comuniacarse() {
        System.out.println("El lagarto se comunica mediante feromonas");
    }
}
