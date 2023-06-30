class Piramide extends Figura {
    private double altura;
    private double lado;

    public Piramide(double altura, double lado) {
        this.altura = altura;
        this.lado = lado;
    }

    @Override
    double calcularArea() {
        double areaBase = lado * lado;
        double areaLateral = lado * Math.sqrt((lado * lado) - (lado * lado) / 4);
        return areaBase + areaLateral;
    }

    @Override
    double calcularPerimetro() {
        return 0; // No aplica para una pirámide
    }

    @Override
    double calcularVolumen() {
        return (1 / 3.0) * lado * lado * altura;
    }
}
