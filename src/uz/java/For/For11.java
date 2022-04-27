package uz.java.For;

import java.util.Scanner;

public class For11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = scanner.nextInt();

        int sum = 0;

        for (int i = 0; i <= n; i++) {
            sum += (n+i) * (n+i);
        }

        System.out.println(sum);

    }
}
