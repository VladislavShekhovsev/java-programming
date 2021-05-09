package SelfPractice;

import java.util.Scanner;

public class StarRepl {
    public static void main(String[] args) {
        int i = 1;
        int j = 1;
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        String star ="";
        /**for (i = 1; i <= n; i++) {
         for (j = 1; j <= i; j++) {
         System.out.print("*");
         }
         System.out.println();*/
        for(i =1;i<=5;i++){
            star+="*";
            System.out.println(star);
        }
    }

}


