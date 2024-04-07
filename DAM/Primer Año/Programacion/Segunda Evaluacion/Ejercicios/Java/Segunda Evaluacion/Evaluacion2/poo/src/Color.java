public enum Color {
    ROJO("Rojo"),
    AMARILLO("Amarillo"),
    AZUL("Azul"),
    BLANCO("Blanco"),
    NARANJA("Naranja"),
    NEGRO("Negro"),
    AMARAILLO_LIMON("Amarillo Limón");


    private final String color;
    Color(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
