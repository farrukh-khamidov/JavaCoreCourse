package uz.java.For;

import java.util.Scanner;

public class For23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = scanner.nextInt();

        System.out.print("Enter x: ");
        double x = scanner.nextDouble();

        int fact = 1;
        double prod = x;
        double sum = prod/fact;

        for (int i = 1; i <= n; i++) {
            fact*=2*i*(2*i+1);

            prod*= -x * x;

            sum += prod/fact;
        }

        System.out.println(sum);

    }
}
