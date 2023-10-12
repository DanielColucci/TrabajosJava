

public class Main {
    public static void main(String[] args) {
        Circulo circulo = new Circulo(5);
        Rectangulo rectangulo = new Rectangulo(12, 10);
        Cuadrado cuadrado = new Cuadrado(10);

        System.out.println("Área del círculo: " + circulo.calcularArea());
        System.out.println("Área del Rectangulo: " + rectangulo.calcularArea());
        System.out.println("Área del Cuadrado: " + cuadrado.calcularArea());
    }
}
