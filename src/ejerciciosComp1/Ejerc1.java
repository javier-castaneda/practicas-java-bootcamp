package ejerciciosComp1;

import java.util.Scanner;

public class Ejerc1 {
    //Función que lista los n primeros números pares
    public static void pares() {
        System.out.println("Ingresa un número entero: ");
        Scanner reader = new Scanner(System.in);
        int n = reader.nextInt();
        for (int i = 2; i <= n * 2; i += 2) {
            System.out.println(i);
        }
        reader.close();
    }

    public static void main(String[] args) {
        pares();
    }
}
