public class Circulo {

    // Atributo que almacena el radio del círculo
    private int radio;

    // Constructor de la clase
    public Circulo(int radio) {
        this.radio = radio;
    }

    // Calcula y devuelve el área del círculo
    public double calcularArea() {
        return Math.PI * radio * radio;
    }

    // Calcula y devuelve el perímetro del círculo
    public double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }
}