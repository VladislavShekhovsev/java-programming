package saim_HomeWork;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int year = input.nextInt();

        if (year % 4 == 0) {
            System.out.println(year+" its a leap year");
        } else {
            System.out.println(year+" its a regular year");
        }

    }
}
