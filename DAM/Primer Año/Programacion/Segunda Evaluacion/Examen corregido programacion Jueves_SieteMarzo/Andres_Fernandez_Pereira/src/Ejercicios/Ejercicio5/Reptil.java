package Ejercicios.Ejercicio5;

public abstract class Reptil extends Animal{
    public Reptil(Sexo sexo) {
        super(sexo);
    }

    public abstract void reptar();

    public abstract void regularTemperatura();

    public abstract void mudarPiel();
}
