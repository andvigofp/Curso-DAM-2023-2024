package Ejercicios.Ejercicio5;

public class Lagarto extends Reptil{
    public Lagarto(Sexo sexo) {
        super(sexo);
    }

    @Override
    public void reptar() {
        System.out.println("El lagarto está reptando por el suelo.");
    }

    @Override
    public void regularTemperatura() {
        System.out.println("El lagarto está regulando su temperatura corporal.");
    }

    @Override
    public void mudarPiel() {
        System.out.println("El lagarto está mudando su piel.");
    }
}
