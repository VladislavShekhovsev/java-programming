package day23_string_manipulation_while_loop;
import java.util.Scanner;
public class CountUntil {
    public static void main(String[] args) throws InterruptedException {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number to count until:");
        int numberToStop = input.nextInt();
        int start =1;
        while(start<=numberToStop){
            System.out.print(start+" ");
            start++;
            Thread.sleep(1000);
        }
    }
}
