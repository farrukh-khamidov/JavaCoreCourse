package uz.java.Array;

import java.util.Scanner;

public class Array6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        System.out.print("Enter a: ");
        int a = sc.nextInt();

        System.out.print("Enter b: ");
        int b = sc.nextInt();

        int[] array = new int[n];

        array[0] = a;
        array[1] = b;
        array[2] = a+b;

        for (int i = 3; i < n; i++) {
            array[i] = 2 * array[i-1];
        }

        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }

    }
}
