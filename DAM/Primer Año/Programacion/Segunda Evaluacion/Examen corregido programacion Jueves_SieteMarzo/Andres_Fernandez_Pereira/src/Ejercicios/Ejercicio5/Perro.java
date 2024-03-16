package Ejercicios.Ejercicio5;

public class Perro extends Mamifero{
    public Perro(Sexo sexo) {
        super(sexo);
    }

    @Override
    public void amamantar() {
        System.out.println("Los perros no amamantan a sus crías.");
    }

    @Override
    public void moverse() {
        System.out.println("El perro está corriendo o saltando.");
    }

    @Override
    public void emitirSonido() {
        System.out.println("El perro está ladrando.");
    }
}
