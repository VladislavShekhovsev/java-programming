package OfficeHours;
import java.util.Scanner;
public class ExprassionOperator {
    public static void main(String[] args) {
        //Create a program that will accept a number and it will print if it is evenly divisible by 2, 3, and 5
        //
        //Ex:
        //number = 65
        //
        //Output:
        //65 is divisible by 2: false
        //65 is divisible by 3: false
        //65 is divisible by 5: true
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        if(x%2==0&&x%3==0&&x%5==0){System.out.println(x+" can is divisible by 2,3,5");}else{
            System.out.println(x+" not divisible by 2, 3 and 5 ");
        }

    }
}
