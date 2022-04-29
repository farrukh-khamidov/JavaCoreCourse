package uz.java.Array;

import java.util.Scanner;

public class Array83 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int tmp = a[a.length-1];
        for (int i = a.length - 1; i > 0; i--) {
            a[i] = a[i -1];
        }
        a[0] = tmp;

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }

    }
}
