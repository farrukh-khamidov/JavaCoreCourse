package uz.java.Array;

import java.util.Scanner;

public class Array81 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int k = sc.nextInt();

        for (int j = a.length - 1; j -k >= 0; j--) {
            a[j] = a[j -k];
        }
        for (int j = 0; j < k; j++) {
            a[j]=0;
        }

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }

    }
}
