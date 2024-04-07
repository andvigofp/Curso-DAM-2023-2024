public class Automovil {
    //Atributos

    private int id=0;
    private TipoAutomovil tipo = TipoAutomovil.PICKUP;
    private String modelo;
    private String fabricante;
    private Color color = Color.NEGRO;
    private double cilindrada;
    private int capacidadDeposito = 40;

    private static String colorPatente= "azul";
    private static int capacidadDepositoEstatico = 30;

    private static int ultimolId;

    private static final Integer VELOCIDAD_MAXIMA_CARRETERA=120;
    private static final int VELOCIDAD_MAXIMA_CIUDAD =50;



    public Automovil() {
        this.id = ultimolId++;
    }

   public Automovil(String fabricante, String modelo) {
        this();
        this.fabricante = fabricante;
        this.modelo = modelo;
    }

    public Automovil (String fabricante, String modelo, Color color) {
        this(fabricante,modelo);
        this.color = color;
    }

    public Automovil (String fabricante, String modelo, Color color, double cilindrada) {
        this(fabricante,modelo,color);
        this.cilindrada = cilindrada;
    }

    public Automovil (String fabricante, String modelo, Color color, double cilindrada, int capacidadDeposito){
        this(fabricante,modelo,color,cilindrada);
        this.capacidadDeposito = capacidadDeposito;
    }


    public Automovil(String fabricante, String modelo, Color color, double cilindrada, int capacidadDeposito, int id, TipoAutomovil tipo) {
        this(fabricante,modelo,color,cilindrada,capacidadDeposito);
        this.id = id;
        tipo = tipo;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public double getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(double cilindrada) {
        this.cilindrada = cilindrada;
    }

    public int getCapacidadDeposito() {
        return capacidadDeposito;
    }

    public void setCapacidadDeposito(int capacidadDeposito) {
        this.capacidadDeposito = capacidadDeposito;
    }


    public static String getColorPatente() {
        return colorPatente;
    }

    public static void setColorPatente(String colorPatente) {
        Automovil.colorPatente = colorPatente;
    }

    public static int getCapacidadDepositoEstatico() {
        return capacidadDepositoEstatico;
    }

    public static void setCapacidadDepositoEstatico(int capacidadDepositoEstatico) {
        Automovil.capacidadDepositoEstatico = capacidadDepositoEstatico;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public static int getUltimolId() {
        return ultimolId;
    }



   public static Integer getVelocidadMaximaCarretera() {
        return VELOCIDAD_MAXIMA_CARRETERA;
   }

    public static int getVelocidadMaximaCiudad() {
        return VELOCIDAD_MAXIMA_CIUDAD;
    }

    public String detalle() {
       return  "auto.fabricante = " + this.fabricante +
        "\nauto.color =" + this.color.getColor() + color.getColor() +
        "\nauto.modelo = " + this.modelo +
        "\nAutomovil.colorpatente = " + Automovil.colorPatente+
        "\nauto.cilindrada = " + this.cilindrada +
        "\nauto.capacidad del deposito = " + this.capacidadDeposito+
        "\nAutomovil.capacidadDepositoEstatico= " + Automovil.capacidadDepositoEstatico +
        "\nauto.id = " + this.id +
        "\nAutomovil.ultimoId = " + Automovil.ultimolId;
       
    }



    public String acelerar (int rpm) {
        return "El auto " + fabricante + " acelerado " + rpm + " r.p.m";
    }

    public String frenar() {
        return fabricante + " " + this.modelo + " frenando!!";
    }

    public String acelerarFrenar(int rpm) {
        String acelerar = acelerar(rpm);
        String frenar = frenar();
        return acelerar + "\n " + frenar;
    }

    public float calcularConsumo(int km, float porcentajeGasolina) {
        return km / (capacidadDeposito * porcentajeGasolina);
    }

    public float calcularConsumo(int km, int porcentajeGasolina) {
        return km /(capacidadDeposito * (porcentajeGasolina /100f));
    }

    public String intermitentesPuesto(String intermitente) {
        return "El vehiculo " + fabricante + " tiene enecendido sus " + intermitente;
    }

    public static float calcularConsumoEstatico(int km, int porcentajeGasolina) {
        return km /(Automovil.capacidadDepositoEstatico * (porcentajeGasolina /100f));
    }



    }

