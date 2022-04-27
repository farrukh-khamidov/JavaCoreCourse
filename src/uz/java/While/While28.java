package uz.java.While;

import java.util.Scanner;

public class While28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter e: ");
        double e = sc.nextDouble();
        int k = 1;
        double a = 2, prevA;
        do {
            prevA = a;
            k++;
            a = 2 + 1/a;
        } while (Math.abs(a - prevA) >= e);
        System.out.println(k);
    }
}
