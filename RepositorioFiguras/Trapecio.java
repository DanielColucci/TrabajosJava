public class Trapecio implements Figura {
    double baseMayor;
    double baseMenor;
    double altura;

    public Trapecio(double baseMayor, double baseMenor, double altura) {
        this.baseMayor = baseMayor;
        this.baseMenor = baseMenor;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        double area = (baseMayor + baseMenor) * altura / 2;
        return area;
    }
}
