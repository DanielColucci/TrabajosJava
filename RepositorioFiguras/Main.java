public class Main {
    public static void main(String[] args) {
        Circulo circulo = new Circulo(5);
        Rectangulo rectangulo = new Rectangulo(12, 10);
        Cuadrado cuadrado = new Cuadrado(10);
        Triangulo triangulo = new Triangulo(12, 15);
        Pentagono pentagono = new Pentagono(12, 17);

        System.out.println("Área del círculo: " + circulo.calcularArea());
        System.out.println("Área del Rectangulo: " + rectangulo.calcularArea());
        System.out.println("Área del Cuadrado: " + cuadrado.calcularArea());
        System.out.println("Área del Triangulo: " + triangulo.calcularArea());
        System.out.println("Área del Pentagono: " + pentagono.calcularArea());

    }
}