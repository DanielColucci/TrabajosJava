public class Cuadrado implements Figura {
    import java.util.Scanner;

    public class CalcularArea {
        public static void main (String [] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Ingresa la longitud de un lado del cuadrado:   ");
            double lado = scanner.nextDouble();


            //Calcula el área del cuadrado
            double area = lado * lado;
            
            System.out.println("El área del cuadrado es:   " + area);
            scanner.close();
        }
    }
}
