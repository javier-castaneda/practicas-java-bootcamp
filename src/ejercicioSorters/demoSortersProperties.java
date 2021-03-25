package ejercicioSorters;

import ejercicioSorters.Comparators.IntAsc;
import ejercicioSorters.Comparators.IntDesc;
import ejercicioSorters.Comparators.StrAsc;
import ejercicioSorters.Comparators.StrLen;

import java.util.Random;

public class demoSortersProperties {

    public static String generateString() {
        int leftLimit = 97; // letter 'a'
        int rightLimit = 122; // letter 'z'
        int targetStringLength = (int) (Math.random() * 20) + 1;
        Random random = new Random();

        String generatedString = random.ints(leftLimit, rightLimit + 1)
                .limit(targetStringLength)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();

        return generatedString;
    }

    public static void main(String[] args) {

        String[] arrStr = new String[15];

        for (int i = 0; i < arrStr.length; i++) {
            arrStr[i] = generateString();
        }

        System.out.println(" ---- Strings Desordenados ----");

        for (String s : arrStr
        ) {
            System.out.println(s);
        }

        Sorter sr = (Sorter) MiFactory.getInstance("MiFactory.properties");
        sr.sort(arrStr, new StrLen());

        System.out.println(" ---- Strings Ordenados por tamaño ----");

        for (String s : arrStr
        ) {
            System.out.println(s);
        }


        Integer[] arr = new Integer[20];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 200) + 1;
        }

        Integer arr1[] = arr.clone();
        System.out.println(" ---- Números Desordenados ---- ");
        demoSorters.mostrarArray(arr);

        sr.sort(arr, new IntAsc());

        System.out.println(" ---- Números ordenados ascendentemente ---- ");
        demoSorters.mostrarArray(arr);

        sr.sort(arr1, new IntDesc());

        System.out.println(" ---- Números ordenados descendentemente ---- ");
        demoSorters.mostrarArray(arr1);

    }

}
