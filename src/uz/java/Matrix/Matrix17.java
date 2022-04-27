package uz.java.Matrix;

import java.util.Scanner;

public class Matrix17 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();

        int[][] a = new int[m][n];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        int k = sc.nextInt();

        int sum = 0, prod = 1;
        for (int i = 0; i < a[k].length; i++) {
            sum += a[k][i];
            prod *= a[k][i];
        }

        System.out.println("sum: " + sum);
        System.out.println("product: " + prod);
    }
}
