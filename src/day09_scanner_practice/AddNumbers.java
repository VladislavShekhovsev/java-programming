package day09_scanner_practice;
import java.util.Scanner; // import scanner claas utility
public class AddNumbers {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in); // declare and creating scanner object
        System.out.println("Enter two numbers");
        int mun1 = input.nextInt();
                int num2 = input.nextInt();
                int result = mun1 + num2;
        System.out.println(result);

    }

}
