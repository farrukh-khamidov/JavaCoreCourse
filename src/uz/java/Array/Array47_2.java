package uz.java.Array;

import java.util.Scanner;

public class Array47_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }



        for (int i = 0; i < a.length; i++) {
            boolean found = false;

            for (int j = i-1; j >= 0; j--) {
                if (a[j] == a[i]) {
                    found = true;
                    break;
                }
            }
            if (!found) System.out.print(a[i] + " ");
        }

    }
}
