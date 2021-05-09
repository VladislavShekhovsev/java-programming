package day24_loops;
import java.util.*;
public class PinCodeDoWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int secretPin =1234;
        int pincode;
        do {
            System.out.println("Enter pin");
            pincode = input.nextInt();
        }while(pincode!=secretPin);
        System.out.println("welcome to account");
    }
}
