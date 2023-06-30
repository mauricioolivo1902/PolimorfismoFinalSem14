class Esfera extends Figura {
    private double radio;

    public Esfera(double radio) {
        this.radio = radio;
    }

    @Override
    double calcularArea() {
        return 4 * Math.PI * radio * radio;
    }

    @Override
    double calcularPerimetro() {
        return 0; // No aplica para una esfera
    }

    @Override
    double calcularVolumen() {
        return (4 / 3.0) * Math.PI * radio * radio * radio;
    }
}
