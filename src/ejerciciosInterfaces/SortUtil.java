package ejerciciosInterfaces;

public class SortUtil {
    public static <T> void ordenar(Precedable<T>[] arr) {

        for (int i = 1; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i; j++) {
                if (arr[j].precedeA((T) arr[j + 1]) > 0) {
                    T aux = (T) arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = (Precedable<T>) aux;
                }
            }
        }
    }
}
