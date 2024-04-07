import java.sql.Date;

public class Oficial extends Operario{
    private String lineaFabricacion;
    public Oficial(String nombre, double salario, Date fechaIncorporacion, String area, String nave, String lineaFabricacion) {
        super(nombre, salario, fechaIncorporacion, area, nave);
        this.lineaFabricacion = lineaFabricacion;
    }

    public String getLineaFabricacion() {
        return lineaFabricacion;
    }

    public void setLineaFabricacion(String lineaFabricacion) {
        this.lineaFabricacion = lineaFabricacion;
    }


    @Override
    public String toString() {
        return "Oficial{" +
                "lineaFabricacion='" + lineaFabricacion + '\'' +
                '}';
    }
}
