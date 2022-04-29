package uz.java.Array;

import java.util.Scanner;

public class Array85 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        for (int i = 0; i < k; i++) {
            int tmp = a[a.length-1];
            for (int j = a.length - 1; j > 0; j--) {
                a[j] = a[j -1];
            }
            a[0] = tmp;
        }

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }

    }
}
