package day14_multi_branch_if_statements;

import java.util.Scanner;

public class CalculatorV4 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("please enter first number");
        double num1 = scan.nextDouble();
        System.out.println("please enter +,-,*,:");
        char operator = scan.next().charAt(0);
        System.out.println("please enter second number");
        double num2 = scan.nextDouble();
        if (operator == '+') {
            System.out.println(num1 + num2);
        } else if (operator == '-') {
            System.out.println(num1 - num2);
        } else if (operator == '*') {
            System.out.println(num1 * num2);
        } else if (operator == '+') {
            System.out.println(num1 + num2);
        }
    }
}

