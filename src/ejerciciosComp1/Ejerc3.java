package ejerciciosComp1;

import java.util.Scanner;

public class Ejerc3 {
    //Función para determinar si un número es primo
    public static boolean primo(int x) {
        for (int i = 2; i < x; i++) {
            if (x % i == 0 || x <= 1) {
                return false;
            }
        }
        return true;
    }

    public static void unPrimo() {
        System.out.println("Ingresa un número para saber si es primo: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (primo(n)) {
            System.out.println(n + " es primo");
        } else {
            System.out.println(n + " no es primo");
        }
        scanner.close();
    }

    public static void main(String[] args) {
        unPrimo();
    }
}
