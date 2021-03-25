package ejercicioSorters;

import ejercicioSorters.Comparators.IntAsc;

public class demoSorters {

    public static void mostrarArray(Integer[] arr) {
        String datos = "{";

        for (Integer x : arr) {
            datos += " " + x;
        }
        datos += " }";
        System.out.println(datos);
    }

    public static void main(String[] args) {
        Integer arr[] = {3, 1, 51, 545, 75, 42, 68, 5, 143};

        mostrarArray(arr);
        System.out.println(" ---- Ordenados por QuickSort ---- ");

        QuickSortSorterImple myQuickSorter = new QuickSortSorterImple();
        myQuickSorter.sort(arr, new IntAsc());


        mostrarArray(arr);

        System.out.println(" ---- Desordenados ---- ");

        Integer arr1[] = {3, 1, 51, 545, 75, 42, 68, 5, 143};
        mostrarArray(arr1);

        System.out.println(" ---- Ordenados por BubbleSort ---- ");

        BubbleSortSorterImple myBubbleSorter = new BubbleSortSorterImple();
        myBubbleSorter.sort(arr1, new IntAsc());

        mostrarArray(arr1);

        System.out.println(" ---- Desordenados ---- ");

        Integer arr2[] = {3, 1, 51, 545, 75, 42, 68, 5, 143};
        mostrarArray(arr2);

        System.out.println(" ---- Ordenados por HeapSort ---- ");

        HeapSortSorterImple myHeapSorter = new HeapSortSorterImple();
        myHeapSorter.sort(arr2, new IntAsc());

        mostrarArray(arr2);

    }
}
