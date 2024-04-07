package Ejercicios.Ejercicio5;

public class Animal {
private Sexo sexo;

    public Animal(Sexo sexo) {
        this.sexo = sexo;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void comer() {
        System.out.println("El animal está comiendo.");
    }

    public void dormir() {
        System.out.println("El animal está durmiendo.");
    }

    public void reproducirse() {
        System.out.println("El animal está reproduciéndose.");
    }
}
