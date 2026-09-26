public class Cuadrado {

    // Atributo que almacena la medida de un lado
    private int lado;

    // Constructor de la clase
    public Cuadrado(int lado) {
        this.lado = lado;
    }

    // Calcula y devuelve el área del cuadrado
    public double calcularArea() {
        return lado * lado;
    }

    // Calcula y devuelve el perímetro del cuadrado
    public double calcularPerimetro() {
        return 4 * lado;
    }
}
