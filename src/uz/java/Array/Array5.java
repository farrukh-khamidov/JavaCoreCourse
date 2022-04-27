package uz.java.Array;

import java.util.Scanner;

public class Array5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int[] f = new int[n];

        f[0] = f[1] = 1;

        for (int i = 2; i < n; i++) {
            f[i] = f[i-1] + f[i-2];
        }

        for (int i = 0; i < n; i++) {
            System.out.print(f[i] + " ");
        }

    }
}
