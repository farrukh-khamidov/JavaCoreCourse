package uz.java.Array;

import java.util.Scanner;

public class Array39_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int count = 1;

        byte monotone;
        if (a[1] > a[0]) monotone = 1;
        else if (a[1] < a[0]) monotone = -1;
        else {
            monotone = 0;
            count = 2;
        }



        for (int i = 2; i < n; i++) {

            if (monotone == 1 && a[i] <= a[i-1]) {
                count++;

                if (a[i] < a[i-1]) monotone = -1;
                else monotone = 0;

            } else if (monotone == -1 && a[i] >= a[i-1]) {
                count++;

                if (a[i] > a[i-1]) monotone = 1;
                else monotone = 0;

            } else if (monotone == 0) {
                if (a[i] > a[i-1]) monotone = 1;
                else if (a[i] < a[i-1]) monotone = -1;
                else if (i + 1 < n && a[i+1] == a[i])count++;
            }
        }

        System.out.println(count);
    }
}
