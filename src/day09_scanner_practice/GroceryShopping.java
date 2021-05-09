package day09_scanner_practice;
import java.util.Scanner;
public class GroceryShopping {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter price for milk:");
        double price1 = input.nextDouble();
        System.out.println("Enter price for bread:");
        double price2 = input.nextDouble();
        System.out.println("Enter price for cucumbers:");
        double price3 = input.nextDouble();
        double total = price1+price2+price3;
        System.out.println("Your total price now: $"+total);
    }
}
