package uz.java.While;

import java.util.Scanner;

public class While30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a: ");
        int a = sc.nextInt();

        System.out.print("Enter b: ");
        int b = sc.nextInt();

        System.out.print("Enter c: ");
        int c = sc.nextInt();

        int m = 0, n = 0, i = 0, result = 0;
        do {
            a -= c;
            m++;
        }while (a >= c);    // a/c = m

       do {
            b -= c;
            n++;
        } while (b >= c);   // b/c = n

        while (i < n) {
            result +=m;
            i++;
        }                   // n * m

        System.out.println(result);

//        System.out.println((a/c) * (b/c));

    }
}
