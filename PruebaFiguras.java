public class PruebaFiguras {

    // Método principal: inicia la ejecución del programa
    public static void main(String[] args) {

        // Creación de los objetos
        Circulo figura1 = new Circulo(2);
        Rectangulo figura2 = new Rectangulo(1, 2);
        Cuadrado figura3 = new Cuadrado(3);
        TrianguloRectangulo figura4 = new TrianguloRectangulo(3, 5);
        Trapecio figura5 = new Trapecio(10, 4, 5, 5, 4);

        System.out.println("RESULTADOS DE LAS FIGURAS GEOMÉTRICAS");
        System.out.println("-------------------------------------");

        System.out.println("\nCÍRCULO");
        System.out.printf("Área: %.2f%n", figura1.calcularArea());
        System.out.printf("Perímetro: %.2f%n", figura1.calcularPerimetro());

        System.out.println("\nRECTÁNGULO");
        System.out.printf("Área: %.2f%n", figura2.calcularArea());
        System.out.printf("Perímetro: %.2f%n", figura2.calcularPerimetro());

        System.out.println("\nCUADRADO");
        System.out.printf("Área: %.2f%n", figura3.calcularArea());
        System.out.printf("Perímetro: %.2f%n", figura3.calcularPerimetro());

        System.out.println("\nTRIÁNGULO RECTÁNGULO");
        System.out.printf("Área: %.2f%n", figura4.calcularArea());
        System.out.printf("Hipotenusa: %.2f%n", figura4.calcularHipotenusa());
        System.out.printf("Perímetro: %.2f%n", figura4.calcularPerimetro());
        figura4.determinarTipoTriangulo();

        System.out.println("\nTRAPECIO");
        System.out.printf("Área: %.2f%n", figura5.calcularArea());
        System.out.printf("Perímetro: %.2f%n", figura5.calcularPerimetro());
    }
}