package day10_shorthand_operators;
import java.util.Scanner;
public class NextLineBugFixing {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("please enter rent or month; ");
        double rent = input.nextDouble();
        input.nextLine();// whenever you use nextLine after nextDouble/nextInt
        // or other pls add empty line before scan.nextLine();
        String month = input.nextLine();
        System.out.println("rent; "+rent);
        System.out.println("month: "+month);



    }
}
