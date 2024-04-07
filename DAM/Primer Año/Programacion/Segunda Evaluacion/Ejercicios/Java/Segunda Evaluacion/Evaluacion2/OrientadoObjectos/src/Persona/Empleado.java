package Persona;

import ProfeHerencia.Persona;

public class Empleado extends Persona {
    private float salario;
    public Empleado(String nombre, int edad, float salario) {
        super(nombre, edad);
        this.salario = salario;
    }


    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return
                "Empleado{" +
                "salario=" + salario +
                "} " + super.toString();
    }


}
