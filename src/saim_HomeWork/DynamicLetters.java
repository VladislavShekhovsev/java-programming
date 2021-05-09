package saim_HomeWork;
import java.util.*;
public class DynamicLetters {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Uppercase or lowercase");
        String upperOrLower = input.next();
        System.out.println("do u want it in ascending or descending order ?");
        String ascendingOrDescending = input.next();
        int starting;
        int ending;
        if (upperOrLower.equals("uppercase")) {
            starting = 'A';
            ending = 'Z';


        } else {
            starting = 'a';
            ending = 'z';

        }
        if (ascendingOrDescending.equals("ascending")) {
            for (int i = starting; i <= ending; i++) {
                System.out.print((char) i); // casting int numbers to char characters

            }
        } else {
            for (int i = ending; i >= starting; i--) {
                System.out.print((char) i);
            }
        }
    }
}