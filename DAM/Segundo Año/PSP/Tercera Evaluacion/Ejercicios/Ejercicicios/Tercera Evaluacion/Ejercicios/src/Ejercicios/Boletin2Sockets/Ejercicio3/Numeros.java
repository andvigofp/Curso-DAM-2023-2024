package Ejercicios.Boletin2Sockets.Ejercicio3;

public class Numeros {
    int numero;
    long cuadrado;
    long cubo;

    public Numeros() {
        super();
    }

    public Numeros(int numero) {
        this.numero = numero;
    }

    public Numeros(int numero, long cuadrado, long cubo) {
        super();
        this.numero = numero;
        this.cuadrado = cuadrado;
        this.cubo = cubo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public long getCubo() {
        return cubo;
    }

    public void setCubo(long cubo) {
        this.cubo = cubo;
    }

    public long getCuadrado() {
        return cuadrado;
    }

    public void setCuadrado(long cuadrado) {
        this.cuadrado = cuadrado;
    }
}
