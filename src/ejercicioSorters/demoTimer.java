package ejercicioSorters;

import ejercicioSorters.Comparators.IntAsc;
import ejercicioSorters.Comparators.IntDesc;

public class demoTimer {
    public static void main(String[] args) {
        Integer[] arr = new Integer[100];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 999) + 1;
        }

        Sorter sr = (Sorter) MiFactory.getInstance("MiFactory.properties");
        sr.sort(arr, new IntDesc());

        System.out.println(" ---- Array ordenado de mayor a menor ---- ");

        demoSorters.mostrarArray(arr);

        System.out.println(" ---- Iniciando Timer ---- ");
        Timer t = new Timer();

        t.start();
        sr.sort(arr, new IntAsc());
        t.stop();

        System.out.println(" ---- Timer Finalizado ---- ");
        System.out.println(" ---- Array ordenado de menor a mayor ---- ");
        demoSorters.mostrarArray(arr);

        System.out.println("El tiempo usado por "+sr.getClass()+ " fue "+ t.elapsedTime()+ " milisegundos");
    }

}
