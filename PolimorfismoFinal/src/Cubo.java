class Cubo extends Figura {
    private double lado;

    public Cubo(double lado) {
        this.lado = lado;
    }

    @Override
    double calcularArea() {
        return 6 * lado * lado;
    }

    @Override
    double calcularPerimetro() {
        return 0; // No aplica para un cubo
    }

    @Override
    double calcularVolumen() {
        return lado * lado * lado;
    }
}

