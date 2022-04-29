package uz.java.Array;

import java.util.Scanner;

public class Array48 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        for (int i = 0; i < a.length - 1; i++) {
            int minIndex = i;
            for (int j = i+1; j < a.length; j++) {
                if (a[j] < a[minIndex]) minIndex = j;
            }

            int temp = a[i];
            a[i] = a[minIndex];
            a[minIndex] = temp;
        }

        int count = 1, max = 1;

        for (int i = 1; i < a.length; i++) {
            if (a[i-1] != a[i]) {
                if (count > max) max = count;
                count = 1;
            }
            else count++;
        }

        System.out.println("Max count: " + max);

    }
}
