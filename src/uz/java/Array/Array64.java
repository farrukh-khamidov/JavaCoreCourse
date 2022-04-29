package uz.java.Array;

import java.util.Scanner;

public class Array64 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int[] b = new int[n];

        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }

        int[] c = new int[n];

        for (int i = 0; i < n; i++) {
            c[i] = sc.nextInt();
        }

        int[] d = new int[3*n];

        int i = n-1, j = n-1, k = n-1, index = 0;

        while (i >=0 || j >=0 || k >=0){
            if (i >=0 && j >=0 && k >=0){
                while (i >=0 && a[i] <= b[j] && a[i] <= c[k]) d[index++] = a[i--];
                while (i >=0 && j >=0 && b[j] <= a[i] && b[j] <= c[k]) d[index++] = b[j--];
                while (i >=0 && j >=0 && k >=0 && c[k] <= a[i] && c[k] <= b[j]) d[index++] = c[k--];
            } else if (j >=0 && k >=0){
                while (j >=0 && b[j] <= c[k]) d[index++] = b[j--];
                while (j >=0 && k >=0 && c[k] <= b[j]) d[index++] = c[k--];
            } else if (i >=0 && k >=0){
                while (i >=0 && a[i] <= c[k]) d[index++] = a[i--];
                while (i >=0 && k >=0 && c[k] <= a[i]) d[index++] = c[k--];
            } else if (i >=0 && j >=0){
                while (i >=0 && a[i] <= b[j]) d[index++] = a[i--];
                while (i >=0 && j >=0 && b[j] <= a[i]) d[index++] = b[j--];
            } else {
                while (j >=0) d[index++] = b[j--];
                while (i >=0) d[index++] = a[i--];
                while (k >=0) d[index++] = c[k--];
            }
        }

        for (i = 0; i < d.length; i++) {
            System.out.print(d[i] + " ");
        }

    }
}
