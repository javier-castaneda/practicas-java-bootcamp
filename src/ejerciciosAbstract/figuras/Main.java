package ejerciciosAbstract.figuras;

public class Main {
    public static void main(String[] args) {
        FiguraGeometrica[] arr = new FiguraGeometrica[5];
        arr[0] = new Circulo(3);
        arr[1] = new Rectangulo(3,4);
        arr[2] = new Triangulo(2,3);
        arr[3] = new Circulo(2);
        arr[4] = new Triangulo(5,3);


        System.out.println("Media: "+ UtilsFigGeo.areaPromedio(arr));
    }
}
