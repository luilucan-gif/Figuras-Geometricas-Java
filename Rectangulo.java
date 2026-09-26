public class Rectangulo {

    // Atributos del rectángulo
    private int base;
    private int altura;

    // Constructor de la clase
    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    // Calcula y devuelve el área del rectángulo
    public double calcularArea() {
        return base * altura;
    }

    // Calcula y devuelve el perímetro del rectángulo
    public double calcularPerimetro() {
        return 2 * (base + altura);
    }
}
