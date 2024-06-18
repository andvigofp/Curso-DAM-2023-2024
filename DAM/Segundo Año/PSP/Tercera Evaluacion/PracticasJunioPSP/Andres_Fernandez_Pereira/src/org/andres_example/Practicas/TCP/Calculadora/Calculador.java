package org.andres_example.Practicas.TCP.Calculadora;

public class Calculador {
    private int operando1;
    private int operando2;
    private String opreacion;
    private double resultado;

    public Calculador() {
        super();
    }

    public Calculador(int operando1, int operando2, String opreacion) {
        this.operando1 = operando1;
        this.operando2 = operando2;
        this.opreacion = opreacion;
    }

    public int getOperando1() {
        return operando1;
    }

    public void setOperando1(int operando1) {
        this.operando1 = operando1;
    }

    public int getOperando2() {
        return operando2;
    }

    public void setOperando2(int operando2) {
        this.operando2 = operando2;
    }

    public String getOpreacion() {
        return opreacion;
    }

    public void setOpreacion(String opreacion) {
        this.opreacion = opreacion;
    }

    public void suma() {
        resultado = operando1 + operando2;
    }

    public void resta() {
        resultado = operando1 - operando2;
    }

    public void multiplicacion() {
        resultado = operando1 * operando2;
    }

    public boolean division() {
        if (operando1!=0) {
            resultado = operando1 / operando2;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Calculador{" +
                "operando1=" + operando1 +
                ", operando2=" + operando2 +
                ", opreacion='" + opreacion + '\'' +
                ", resultado=" + resultado +
                '}';
    }
}
