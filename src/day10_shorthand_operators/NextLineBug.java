package day10_shorthand_operators;
import java.util.Scanner;
public class NextLineBug {
    public static void main (String [] args){
        System.out.println("please enter your rent payment and month");
        Scanner input = new Scanner (System.in);
        double rent= input.nextDouble();
        String month = input.nextLine();
        System.out.println("Your rent payment is $"+rent+" for the"+month);

    }
}
