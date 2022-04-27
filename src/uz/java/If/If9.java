package uz.java.If;

import java.util.Scanner;

public class If9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = scanner.nextInt();

        System.out.print("Enter b: ");
        int b = scanner.nextInt();

        if (a > b) {
            a = a+b;
            b = a-b;
            a = a-b;
        }

        System.out.println("a=" + a);
        System.out.println("b=" + b);
    }
}
