package ejerciciosAbstract.figuras;


public class Circulo extends FiguraGeometrica {
    private double radio;
    public Circulo(double r){
        radio = r;
    }

    @Override
    public double area() {
        return Math.PI* Math.pow(radio,2);
    }
}
