public class TrianguloRectangulo {

    // Atributos del triángulo rectángulo
    private int base;
    private int altura;

    // Constructor de la clase
    public TrianguloRectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    // Calcula el área del triángulo
    public double calcularArea() {
        return (base * altura) / 2.0;
    }

    // Calcula la hipotenusa utilizando el teorema de Pitágoras
    public double calcularHipotenusa() {
        return Math.sqrt((base * base) + (altura * altura));
    }

    // Calcula el perímetro
    public double calcularPerimetro() {
        return base + altura + calcularHipotenusa();
    }

    // Determina el tipo de triángulo según sus lados
    public void determinarTipoTriangulo() {
        if (base == altura) {
            System.out.println("El triángulo rectángulo es isósceles.");
        } else {
            System.out.println("El triángulo rectángulo es escaleno.");
        }
    }
}
