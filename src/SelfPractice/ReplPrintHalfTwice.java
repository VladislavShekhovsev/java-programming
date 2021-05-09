package SelfPractice;


import java.util.Scanner;

public class ReplPrintHalfTwice {
    public static void main(String[] args) {
        /**Write a program that will print out first half of the word twice.

         Example:*/
        Scanner input = new Scanner(System.in);
        String word= input.next();
        String halfWord= word.substring(0,word.length()/2) ;
        System.out.println(halfWord+halfWord);

    }
}
