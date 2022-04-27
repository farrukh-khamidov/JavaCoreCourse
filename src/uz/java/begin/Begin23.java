package uz.java.begin;

import java.util.Scanner;

public class Begin23 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a = ");
        int a = input.nextInt();
        System.out.print("Enter b = ");
        int b = input.nextInt();
        System.out.print("Enter c = ");
        int c = input.nextInt();

        int temp = c;
        c = b;
        b = a;
        a = temp;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);

    }
}
