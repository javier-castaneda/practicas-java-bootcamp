package ejerciciosAbstract.figuras;



public class Rectangulo extends FiguraGeometrica {

    double base;
    double altura;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double area() {
        return base * altura;
    }
}
