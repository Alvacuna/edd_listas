/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pilas;

import java.util.Scanner;

/**
 *
 * @author aquis
 */
public class Fecha {

    public static void main(String[] args) {
        int d, m, a, i, n;
        Scanner lee = new Scanner(System.in);
        n = lee.nextInt();
        for (i = 1; i <= n; i++) {
            boolean bisiesto = false;
            d = lee.nextInt();
            m = lee.nextInt();
            a = lee.nextInt();
            if (d > 0 && d < 32 && m > 0 && m < 13 && a > 0) {
                if (m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12) {
                    System.out.println("Fecha correcta\n");
                } else {
                    if (m == 2 && d < 30 && bisiesto) {
                        System.out.println("Fecha correcta\n");
                    } else if (m == 2 && d < 29 && !bisiesto) {
                        System.out.println("Fecha correcta\n");
                    } else if (m != 2 && d < 31) {
                        System.out.println("Fecha correcta\n");
                    } else {
                        System.out.println("Fecha incorrecta\n");
                    }
                }
            } else {
                System.out.println("Fecha incorrecta\n");
            }

        }
    }
}
