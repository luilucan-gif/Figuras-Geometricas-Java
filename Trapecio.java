public class Trapecio {

    // Atributos del trapecio
    private int baseMayor;
    private int baseMenor;
    private int lado1;
    private int lado2;
    private int altura;

    // Constructor de la clase
    public Trapecio(int baseMayor, int baseMenor, int lado1, int lado2, int altura) {
        this.baseMayor = baseMayor;
        this.baseMenor = baseMenor;
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.altura = altura;
    }

    // Calcula el área del trapecio
    public double calcularArea() {
        return ((baseMayor + baseMenor) * altura) / 2.0;
    }

    // Calcula el perímetro del trapecio
    public double calcularPerimetro() {
        return baseMayor + baseMenor + lado1 + lado2;
    }
}