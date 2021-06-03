package OfficeHours;

import java.util.Scanner;

public class EligibleToVote {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        byte age = input.nextByte();
        if (age >= 18) {
            System.out.println("Person eligible to vote, age: " + age);
        } else {
            System.out.println("Person not eligible to vote, age: " + age);
        }
    }

}
