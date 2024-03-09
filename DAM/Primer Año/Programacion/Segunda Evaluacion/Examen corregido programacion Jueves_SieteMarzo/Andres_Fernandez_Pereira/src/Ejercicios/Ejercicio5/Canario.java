package Ejercicios.Ejercicio5;

public class Canario extends Animal{
    public Canario(Sexo sexo) {
        super(sexo);
    }

    //Método específico para los canarios
    public void cantar() {
        System.out.println("El canario está cantando.");
    }

    //Método para acicalarse
    public void acicalarse() {
        System.out.println("El canario está acicalándose.");
    }

    //Método para volar en círculos
    public void volarCirculos() {
        System.out.println("El canario está volando en círculos.");
    }
    //Método sobreescrito para comunicarse
    @Override
    public void comuniacarse() {
        System.out.println("El canario emite sonidos.");
    }
}
