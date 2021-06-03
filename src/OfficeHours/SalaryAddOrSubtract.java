package OfficeHours;
import java.util.Scanner;
public class SalaryAddOrSubtract {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Are you a full time employee ? ");
        String answer = input.next();
        System.out.println("Please enter your amount of your salary");
        double salary = input.nextDouble();
        double updatedSalary;
        if(answer.equals("yes")){ updatedSalary=salary+2000;
            System.out.println("You are full time employee, your yearly salary is $"+salary+
                    " we decided to give you a bonus, and now your salary is $"+updatedSalary);
        }else if (answer.equals("no")){ updatedSalary=salary+500;
            System.out.println("You are part time employee and your salary is $"+salary+
                    " we decided to give you a bonus, and now your salary is $"+updatedSalary);
        }else {
            System.out.println("incorrect answer "+answer+", please write \"yes\" or \"no\".");
        }

    }
}
