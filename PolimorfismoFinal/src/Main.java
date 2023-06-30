import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Figura> historial = new ArrayList<>();

        while (true) {
            System.out.println("Seleccione una figura:");
            System.out.println("1. Círculo");
            System.out.println("2. Cuadrado");
            System.out.println("3. Triángulo");
            System.out.println("4. Esfera");
            System.out.println("5. Cubo");
            System.out.println("6. Pirámide");
            System.out.println("7. Salir");

            int opcion = scanner.nextInt();

            if (opcion == 7) {
                break;
            }

            Figura figura;

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el radio del círculo:");
                    double radioCirculo = scanner.nextDouble();
                    figura = new Circulo(radioCirculo);
                    break;
                case 2:
                    System.out.println("Ingrese la longitud del lado del cuadrado:");
                    double ladoCuadrado = scanner.nextDouble();
                    figura = new Cuadrado(ladoCuadrado);
                    break;
                case 3:
                    System.out.println("Ingrese la longitud del lado 1 del triángulo:");
                    double lado1Triangulo = scanner.nextDouble();
                    System.out.println("Ingrese la longitud del lado 2 del triángulo:");
                    double lado2Triangulo = scanner.nextDouble();
                    System.out.println("Ingrese la longitud del lado 3 del triángulo:");
                    double lado3Triangulo = scanner.nextDouble();
                    figura = new Triangulo(lado1Triangulo, lado2Triangulo, lado3Triangulo);
                    break;
                case 4:
                    System.out.println("Ingrese el radio de la esfera:");
                    double radioEsfera = scanner.nextDouble();
                    figura = new Esfera(radioEsfera);
                    break;
                case 5:
                    System.out.println("Ingrese la longitud del lado del cubo:");
                    double ladoCubo = scanner.nextDouble();
                    figura = new Cubo(ladoCubo);
                    break;
                case 6:
                    System.out.println("Ingrese la altura de la pirámide:");
                    double alturaPiramide = scanner.nextDouble();
                    System.out.println("Ingrese la longitud del lado de la pirámide:");
                    double ladoPiramide = scanner.nextDouble();
                    figura = new Piramide(alturaPiramide, ladoPiramide);
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
                    continue;
            }

            historial.add(figura);

            System.out.println("Área: " + figura.calcularArea());
            System.out.println("Perímetro: " + figura.calcularPerimetro());
            System.out.println("Volumen: " + figura.calcularVolumen());
        }

        System.out.println("Historial de figuras:");

        for (Figura figura : historial) {
            System.out.println("Figura: " + figura.getClass().getSimpleName());
            System.out.println("Área: " + figura.calcularArea());
            System.out.println("Perímetro: " + figura.calcularPerimetro());
            System.out.println("Volumen: " + figura.calcularVolumen());
            System.out.println("---------------------");
        }
    }
}