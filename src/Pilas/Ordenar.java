package Pilas;

import java.util.Scanner;

public class Ordenar {

    public static void main(String arg[]) {
        int n, i, j, aux;
        int v[];
        Scanner sc = new Scanner(System.in);
        System.out.println("Cantidad de Numeros:");
        n = sc.nextInt();
        v = new int[n];
        for (i = 0; i < n; i++) {
            System.out.print("V[" + i + "]=");
            v[i] = sc.nextInt();
        }
        for (i = 0; i < n; i++) {
            System.out.print(" " + v[i]);
        }
        System.out.println("");

        for (i = 0; i < n - 1; i++) {
            for (j = i + 1; j < n; j++) {
                if (v[i] > v[j]) {
                    aux = v[i];
                    v[i] = v[j];
                    v[j] = aux;
                }
            }
        }
        System.out.println("Datos Ordenados");
        for (i = 0; i < n; i++) {
            System.out.print(" " + v[i]);
        }
    }
}
