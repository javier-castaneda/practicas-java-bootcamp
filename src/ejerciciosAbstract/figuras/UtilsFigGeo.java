package ejerciciosAbstract.figuras;

public class UtilsFigGeo {
    public static double areaPromedio(FiguraGeometrica arr[]){
        double total = 0;
        for (int i = 0; i < arr.length; i++) {
            total += arr[i].area();
        }
        return total/arr.length;
    }
}
