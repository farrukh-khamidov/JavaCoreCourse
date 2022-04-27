package uz.java.If;

import java.util.Scanner;

public class If1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = scanner.nextInt();

        if (number > 0) number = number + 1;
        System.out.println("number: " + number);

    }
}
