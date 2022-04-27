package uz.java.begin;

import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter basis of exponent a=");
        int a = scanner.nextInt();

        System.out.print("Enter degree of exponent n=");
        int n = scanner.nextInt();

        System.out.println(a + " ning " + n + "-chi darajasi: " + Math.pow(a, n));




    }
}
