public class Aparato {
    private double PVP;
    private String color;
    private char consumo;
    private float peso;

    public Aparato() {
        this(2000,5,'F',"negro");
    }



    public Aparato(double PVP, float peso) {
        this(PVP,peso,'F',"blanco");

    }

    public Aparato(double PVP, double peso, char consumo, String color) {
        this.PVP = PVP;
        this.peso = (float) peso;
        if(comprobarConsumo(consumo))
            this.consumo = consumo;
        else
            this.consumo ='F';

    }

    private boolean comprobarConsumo(char consumo) {
        return (consumo >=65 && consumo <= 70);
    }


    public double getPVP() {
        return PVP;
    }

    public void setPVP(double PVP) {
        this.PVP = PVP;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumo() {
        return consumo;
    }

    public void setConsumo(char consumo) {
        this.consumo = consumo;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public double aplicarDescuento() {
        switch (color) {
            case "gris":
                PVP *=0.95;
        }
        switch (consumo) {
            case 'A':
                return PVP *=0.8;
            case 'B':
                return PVP *=0.85;
            case 'C':
                return PVP *=0.9;
            case 'D':
                return PVP *=0.95;
        }
        return PVP;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Aparato{");
        sb.append("PVP=").append(PVP);
        sb.append(", color='").append(color).append('\'');
        sb.append(", consumo=").append(consumo);
        sb.append(", peso=").append(peso);
        sb.append('}');
        return sb.toString();
    }
}
