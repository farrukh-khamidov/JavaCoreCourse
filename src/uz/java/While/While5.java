package uz.java.While;

import java.util.Scanner;

public class While5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();
        int k = 0;

        while (n > 1) {
            n /= 2;
            k++;
        }
        System.out.println(k);
    }
}
