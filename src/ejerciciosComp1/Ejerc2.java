package ejerciciosComp1;

import java.util.Scanner;

public class Ejerc2 {
    public static void multiplos() {
        System.out.println("Ingresa la cantidad de números n: ");
        Scanner readern = new Scanner(System.in);
        int n = readern.nextInt();
        System.out.println("Ingresa el número m: ");
        Scanner readerm = new Scanner(System.in);
        int m = readerm.nextInt();

        for (int i = m; i <= n * m; i += m) {
            System.out.println(i + " ");
        }
        readerm.close();
        readern.close();
    }

    public static void main(String[] args) {
        multiplos();
    }
}
