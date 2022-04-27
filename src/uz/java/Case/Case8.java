package uz.java.Case;

import java.util.Scanner;

public class Case8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter day: ");
        byte day = scanner.nextByte();

        System.out.print("Enter month: ");
        byte month = scanner.nextByte();

        switch (month){
            case 1: {
                switch ((day+29)/31){
                    case 0:{
                        day=31;
                        month=12;
                        break;
                    }
                    case 1: {
                        day--;
                        break;
                    }
                }
                break;
            }
            case 2:{
                switch ((day+26)/28){
                    case 0:{
                        day=31;
                        month=1;
                        break;
                    }
                    case 1: {
                        day--;
                        break;
                    }
                }
                break;
            }

        }

    }
}
