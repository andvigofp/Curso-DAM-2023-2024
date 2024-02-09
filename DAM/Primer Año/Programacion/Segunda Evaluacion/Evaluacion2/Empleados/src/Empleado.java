import java.sql.Date;

public class Empleado {
    private String nombre;
    private double salario;
    private Date fechaIncorporacion;



    public Empleado(String nombre, double salario, Date fechaIncorporacion) {
        this.nombre = nombre;
        this.salario = salario;
        this.fechaIncorporacion = fechaIncorporacion;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Date getFechaIncorporacion() {
        return fechaIncorporacion;
    }

    public void setFechaIncorporacion(Date fechaIncorporacion) {
        this.fechaIncorporacion = fechaIncorporacion;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", salario=" + salario +
                ", fechaIncorporacion=" + fechaIncorporacion +
                '}';
    }
}
