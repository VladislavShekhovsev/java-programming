package OfficeHours;

import java.util.Scanner;

public class SalaryAddOrSubtractTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Are you a full time employee ? ");
        String answer = input.next();
        //need else before if on line 14 to fix; think about that.
        if(answer.equals("yes")){
            System.out.println("You are full time employee, your yearly salary is $"+
                    " we decided to give you a bonus, and now your salary is $");
        }if(answer.equals("no")){
            System.out.println("You are part time employee and your salary is "+
                    " we decided to give you a bonus, and now your salary is $");
        }else{
            System.out.println("incorrect answer "+answer+", please write \"yes\" or \"no\".");
        }
           // here the line 14 is different branch so if its only if no and else and if he see
        // yes he will accept it like default command
        // (if always start of branch) so its execute the command
        // of line  12 and them execute it again because line 14 dont have yes condition
        // line 14 till 18 its like another one command.
        // (this is difference between if, if ,if and if,else if.else; the first one its 3 commands
        // in second one its one command.(one branch)
    }
}
