package day18_conditions_practice_strings_intro;

import java.util.Scanner;
public class EvenOrOdd {
    public static void main(String[] args) {
        //then number divisible by two its even num.
        //odd its not divisible by two, u will have reminder 1 after %
        // evem = chotvoe, odd ne chotnoe
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        if(num%2==0){
            System.out.println(num+" its even number");
        }else if (num%2!=0){
            System.out.println(num+" its odd number");
        }
    }
}
