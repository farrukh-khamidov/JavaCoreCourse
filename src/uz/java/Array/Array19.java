package uz.java.Array;

import java.util.Scanner;

public class Array19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = (int) (Math.random() * 100);
        }

        for (int i = 0; i < n; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
        int last = nums[nums.length-1];
        int i;
        for (i = 0; i < nums.length; i++) {
            if (nums[i] < last){
                System.out.println(nums[i]);
                break;
            }
        }
        if (i == nums.length) System.out.println(0);


    }
}
