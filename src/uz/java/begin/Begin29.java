package uz.java.begin;

import java.util.Scanner;

public class Begin29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter angle in degrees a=");
        int a = scanner.nextInt();

        System.out.println(a + " degrees is " +Math.toRadians(a) +  " radians.");
        System.out.printf("%d degrees is %.2f radians.", a, Math.toRadians(a));




    }
}
