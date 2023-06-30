class Cuadrado extends Figura {
    private double lado;

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    @Override
    double calcularArea() {
        return lado * lado;
    }

    @Override
    double calcularPerimetro() {
        return 4 * lado;
    }

    @Override
    double calcularVolumen() {
        return 0; // No aplica para un cuadrado
    }
}
