public class Rectangulo implements Figura {
    double base;
    double altura;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        double area = base * altura;
        System.out.println("El area del Rectangulo es: ");
        return area; 

    }
    
}
