package uz.java.Array;

import java.util.Scanner;

public class Array64_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int[] a = new int[n];
        int[] b = new int[n];
        int[] c = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            c[i] = sc.nextInt();
        }

        int[] d = new int[3*n];

        int i = n-1, j = n-1, k = n-1, index = 0;

        while (i >=0 && j >=0 && k >=0){
            if (a[i] < b[j] && a[i] < c[k]) d[index++] = a[i--];
            else if (b[j] < a[i] && b[j] < c[k]) d[index++] = b[j--];
            else d[index++] = c[k--];
        }

        while (j >=0 && k >=0){
            if (b[j] < c[k]) d[index++] = b[j--];
            else d[index++] = c[k--];
        }
        while (i >=0 && k >=0) {
            if (a[i] < c[k]) d[index++] = a[i--];
            else d[index++] = c[k--];
        }
        while (i >=0 && j >=0) {
            if (a[i] < b[j]) d[index++] = a[i--];
            else d[index++] = b[j--];
        }
        while (i >=0) d[index++] = a[i--];
        while (j >=0) d[index++] = b[j--];
        while (k >=0) d[index++] = c[k--];

        for (i = 0; i < d.length; i++) {
            System.out.print(d[i] + " ");
        }

    }
}
