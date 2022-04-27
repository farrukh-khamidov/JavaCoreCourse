package uz.java.Array;

import java.util.Scanner;

public class Array47 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int[] b = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            b[i] = a[i];
        }

        for (int i = 0; i < b.length - 1; i++) {
            int minIndex = i;
            for (int j = i+1; j < b.length; j++) {
                if (b[j] < b[minIndex]) minIndex = j;
            }

            int temp = b[i];
            b[i] = b[minIndex];
            b[minIndex] = temp;
        }

        int count = 1;

        for (int i = 1; i < b.length; i++) {
            if (b[i] != b[i-1]) count++;
        }

        int[] c = new int[count];

        int index = 1;

        c[0] = a[0];

        for (int i = 1; i < a.length; i++) {
            boolean found = false;

            for (int j = 0; j <= index; j++) {
                if (c[j] == a[i]) {
                    found = true;
                    break;
                }
            }
            if (!found) c[index++] = a[i];
        }

        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i] + " ");
        }

    }
}
