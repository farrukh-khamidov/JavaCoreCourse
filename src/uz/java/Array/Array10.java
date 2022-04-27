package uz.java.Array;

import java.util.Scanner;

public class Array10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            if (a[i] % 2 == 0) System.out.print(a[i] + " ");
        }
        for (int i = a.length - 1; i >= 0; i--) {
            if (a[i] % 2 == 1) System.out.print(a[i] + " ");
        }

    }
}
