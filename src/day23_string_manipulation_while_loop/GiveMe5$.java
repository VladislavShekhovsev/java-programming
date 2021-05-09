package day23_string_manipulation_while_loop;
import java.util.*;
public class GiveMe5$ {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int dollar = input.nextInt();
        int wallet = 5;
        while (dollar!=wallet){
            System.out.println("give me 5 dollars, u gave me $" +dollar);
            dollar=input.nextInt();
        }
        System.out.println("thank you for the 5 dollars");
    }
}
