package uz.java.integer;

import java.util.Scanner;

public class Integer1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please, enter distance centimeters: ");
        int distanceInCentimeters = sc.nextInt();

        System.out.println("Distance is " + distanceInCentimeters /100.0 + " meters");


    }
}
