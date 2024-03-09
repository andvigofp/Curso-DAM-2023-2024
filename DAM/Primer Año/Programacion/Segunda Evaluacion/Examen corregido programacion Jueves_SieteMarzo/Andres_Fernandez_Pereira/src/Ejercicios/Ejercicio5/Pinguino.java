package Ejercicios.Ejercicio5;

public class Pinguino extends Animal{
    public Pinguino(Sexo sexo) {
        super(sexo);
    }

    //Método específico para los pingüinos
    public void nadar() {
        System.out.println("El pingüino está nadando.");
    }

    //Método para pescar
    public void pescar() {
        System.out.println("El pingüino está pescando.");
    }

    //Método para deslizarse en el hielo
    public void deslizarse() {
        System.out.println("El pingüino está deslizándose en el hielo.");
    }
    //Método sobreescrito para comunicarse
    @Override
    public void comuniacarse() {
        System.out.println("El pingino emite sonido para comunicarse.");
    }
}
