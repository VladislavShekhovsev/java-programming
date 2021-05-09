package SelfPractice;
import java.util.*;
public class GuestList {
    public static void main(String[] args) {

            Scanner input = new Scanner(System.in);
            String question ="";
            String guestList ="";
            String name ="";
            // your code
            // ------------------------------------------
            do{System.out.println("Please enter guest name:");
                name = input.next();
                System.out.println("Do you want to enter new guest name:");
                question = input.next();
                guestList+= name+", ";
            } while(question.equals("yes"));{
            System.out.println(guestList);
        }


        }
    }


