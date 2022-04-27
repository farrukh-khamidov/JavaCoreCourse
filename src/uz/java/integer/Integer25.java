package uz.java.integer;

import java.util.Scanner;

public class Integer25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please, enter k: ");
        int k = sc.nextInt();


        System.out.println("week day:  " + (k+3) % 7);


    }
}
