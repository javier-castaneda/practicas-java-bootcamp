package ejerciciosComp1;

import java.util.Scanner;

public class Ejerc4 {
    //Función para determinar si un número es primo
    public static boolean primo(int x) {
        for (int i = 2; i < x; i++) {
            if (x % i == 0 || x <= 1) {
                return false;
            }
        }
        return true;
    }

    public static void primerosPrimos() {
        System.out.println("Ingresa n para ver los n primeros números primos: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int cont = 0;
        int num = 2;
        while (cont < n) {
            if (primo(num)) {
                System.out.println(num);
                cont++;
            }
            num++;
        }
    }

    public static void main(String[] args) {
        primerosPrimos();
    }
}
