package saim_HomeWork;
import java.util.Scanner;
public class Stage02Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("+++++CALCULATOR+++++");
        System.out.println("____________________");
        System.out.println("Please enter numbers");
        System.out.println("press: 1 for +");
        System.out.println("press: 2 for -");
        System.out.println("press: 3 for x");
        System.out.println("press: 4 for :");
        byte num = scan.nextByte();
        double num1 = scan.nextDouble();
        double num2 = scan.nextDouble();
        double num3;
        if (num == 1) {
            System.out.println(num3=num1+num2);
        }
        if (num == 2) {
            System.out.println(num3=num1-num2);
        }
        if (num == 3) {
            System.out.println(num3=num1*num2);
        }
        if (num == 4) {
            System.out.println(num3=num1/num2);
        }

        }
    }








