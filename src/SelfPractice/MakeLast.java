package SelfPractice;

import java.util.Scanner;

public class MakeLast {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("size:");
        int size = scan.nextInt();
        int[] nums = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("array - " + i);
            nums[i] = scan.nextInt();
        }
        int[] doubleNums = new int[size * 2];
        doubleNums[doubleNums.length - 1] = nums[nums.length - 1];
         System.out.print("");
        for ( int n : doubleNums) {

            System.out.print(n);
        }
        System.out.print("]");


    }
}