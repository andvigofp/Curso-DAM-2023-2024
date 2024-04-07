import java.time.LocalDate;
import java.util.Date;


public class Cuenta {
    //Atributos
    private String DNI;
    private String titular;
    private double saldo;
    private LocalDate dia;

    //private Date dia;

    //Constructor Vacio por defecto
    public Cuenta() {

    }

    //Constructor dejamos el saldo a 0
    public Cuenta(String DNI, String titular) {
        this.DNI = DNI;
        this.titular = titular;
        this.saldo = 0;
        //this.dia = LocalDate.of(2023,1,2); //Nueva variable para almacenar la fecha de creación;
        this.dia = LocalDate.now(); //Fecha actual
    }

    //G
    public String getDNI() {
        return DNI;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public LocalDate getDia() {
        return dia;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setDia(LocalDate dia) {
        this.dia = dia;
    }

    //Método para sacarDinero dinero en la cuenta
    public String sacarDinero(double cantidad) {
        if (cantidad > 0 && cantidad<=this.saldo) {
            this.saldo -= cantidad;
            return "Retiro de € " + cantidad + " realizado con éxito";
        }else {
            return "Saldo insuficiente para realizar la operación.";
        }
    }

    //Método para ingresar dinero en la cuenta
    public String ingresarDinero(double cantidad) {
        if (cantidad > 0) {
            this.saldo += cantidad;
            return "Depósito de € " + cantidad + " realizado con éxito";
        }else {
            return "La cantidad a depositar debe ser mayor que cero.";
        }
    }

    //Método para mostrar información de la cuenta con la fecha de creación
    public String mostarInformacion() {
        return "\nDNI del titular " + this.DNI+
                "\nNombre del titular " + this.titular +
                "\nDía " + this.dia +
                "\nSaldo actual € " + this.saldo;

    }
}
