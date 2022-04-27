package uz.java.Case;

import java.util.Scanner;

public class Case30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter day: ");
        byte day = scanner.nextByte();

        System.out.print("Enter month: ");
        byte month = scanner.nextByte();

        switch (month){
            case 1: {
                if (day <= 19 && day > 0) System.out.println("Echki");
                else if (day > 19 && day <= 31)System.out.println("Qovg'a");
                else System.out.println("Noto'g'ri oy kuni!");
                break;
            }
            case 2:{
                if (day <= 19 && day > 0) System.out.println("Echki");
                else if (day > 19 && day <= 31)System.out.println("Qovg'a");
                else System.out.println("Noto'g'ri oy kuni!");
                break;
            }

        }

    }
}
