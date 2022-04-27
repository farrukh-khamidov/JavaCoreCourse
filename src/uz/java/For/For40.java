package uz.java.For;

import java.util.Scanner;

public class For40 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a: ");
        int a = scanner.nextInt();

        System.out.print("Enter b: ");
        int b = scanner.nextInt();

        for (int i = a; i <= b; i++) {
            for (int j = 0; j <= i - a; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

    }
}
