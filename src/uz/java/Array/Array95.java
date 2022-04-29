package uz.java.Array;

import java.util.Scanner;

public class Array95 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int count = 0;

        boolean isLengthGreaterOne = false;
        for (int i = 1; i < a.length; i++) {
            if (a[i] != a[i-1]) {
                if (isLengthGreaterOne) count++;
                isLengthGreaterOne = false;
            } else isLengthGreaterOne = true;
        }
        if (isLengthGreaterOne) count++;

        int[] b = new int[a.length-count];


        boolean newSeries = true;
        for (int i = 0, j = 0; i < a.length-1; i++) {
            if (newSeries || a[i] == a[i+1]) {
                b[j++] = a[i];
                if (a[i] == a[i+1]) newSeries = false;
            } else newSeries = true;
        }
        if (newSeries) b[b.length-1] = a[a.length -1];
        a=b;
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }

    }
}
