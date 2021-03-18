package ejerciciosComp1;

import java.util.Scanner;

public class Ejerc5 {

    //Función que retorna la cantidad de apariciones de un caractér en un String
    public static int countString(String num, char dig) {
        int count = 0;
        for (int i = 0; i < num.length(); i++) {
            if (num.charAt(i) == dig) {
                count++;
            }
        }
        return count;
    }

    public static void ejercicio5() {
        System.out.println("Ingresa la cantidad de números n: ");
        Scanner readern = new Scanner(System.in);
        int n = readern.nextInt();
        System.out.println("Ingresa el número m de apariciones del dígito d: ");
        Scanner readerm = new Scanner(System.in);
        int m = readerm.nextInt();
        System.out.println("Ingresa el dígito d: ");
        Scanner readerd = new Scanner(System.in);
        String d = readerd.next();

        int i = 0;
        int count = 0;

        while (count < n) {
            if (countString(Integer.toString(i), d.charAt(0)) == m) {
                System.out.println(i);
                count++;
            }
            i++;
        }


        readern.close();
        readerm.close();
        readerd.close();
    }

    public static void main(String[] args) {
        ejercicio5();
    }
}
