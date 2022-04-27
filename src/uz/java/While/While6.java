package uz.java.While;

import java.util.Scanner;

public class While6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();
        int fact = 1;

        while (n > 0) {
            fact *= n;
            n -= 2;
        }
        System.out.println(fact);
    }
}
