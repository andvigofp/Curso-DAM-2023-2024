public enum TipoAutomovil {
SEDAN("Sedán","Automovil Normal",4),
STATION_WAGON("Station Wagon", "Automopvil Grande", 4),
HATCHBACK("Hackback", "Automovil Compacto",4),
PICKUP("Pickup", "Camioneta", 2),
COMVERTIBLE("Convertible","Automovil Deportivo",2),
FURGON("Furgoneta", "Automovil Utilitario",4);

private final String nombre;

private final String descripcion;

    private final int numeroPuerta;
    TipoAutomovil(String nombre, String descripcion, int numeroPuerta) {
        this.nombre = nombre;
        this.numeroPuerta = numeroPuerta;
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getNumeroPuerta() {
        return numeroPuerta;
    }
}
