public class Pentagono {
    double perimetro;
    double apotema;

    public Pentagono(double perimetro, double apotema) {
        this.perimetro = perimetro;
        this.apotema = apotema;
    }
    
    @Override
    public double calcularArea() {
        double area = perimetro * apotema /2;
        
    }
}
