package day09_scanner_practice;
import java.util.Scanner;
public class CentsToDollars {
    public static void main(String[] args) {
        System.out.println("Calculator cents to dollars");
        System.out.println("please enter amount of cents: ");
        Scanner input = new Scanner(System.in);
        int cents = input.nextInt();
        int dollar = cents/100;
        int remainingCents = cents%100;
        System.out.println("You have; $"+dollar+" and "+remainingCents+"cents");


    }
}
