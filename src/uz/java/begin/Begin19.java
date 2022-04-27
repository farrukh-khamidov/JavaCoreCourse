package uz.java.begin;

import java.util.Scanner;

public class Begin19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter x1 = ");
        int x1 = scanner.nextInt();

        System.out.print("Enter y1 = ");
        int y1 = scanner.nextInt();

        System.out.print("Enter x2 = ");
        int x2 = scanner.nextInt();

        System.out.print("Enter y2 = ");
        int y2 = scanner.nextInt();

        int a = Math.abs(x1-x2);
        int b = Math.abs(y1-y2);

        int p = 2 * (a+b);
        int s = a*b;

        System.out.println("perimeter: " + p);
        System.out.println("area: " + s);



    }
}
