import java.sql.Date;

public class Tecnico extends Operario{
    private int seccion;
    public Tecnico(String nombre, double salario, Date fechaIncorporacion, String area, String nave, int seccion) {
        super(nombre, salario, fechaIncorporacion, area, nave);
        this.seccion = seccion;
    }

    public int getSeccion() {
        return seccion;
    }

    public void setSeccion(int seccion) {
        this.seccion = seccion;
    }

    @Override
    public String toString() {
        return "Técnico{" +
                "seccion='" + seccion + '\'' +
                '}';
    }
}
