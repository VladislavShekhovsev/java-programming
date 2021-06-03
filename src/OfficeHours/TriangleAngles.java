package OfficeHours;

import java.util.Scanner;

public class TriangleAngles {
    public static void main(String[] args) {
        //int angleOne = 100;
        //int angleTwo =30;
        //int angleThree = 50;
        // int sum = angleOne+angleTwo+angleThree;
        //  if(sum==180){
        Scanner input = new Scanner(System.in);
        System.out.println("Triangle check");
        System.out.println("please enter degrees of angle one");
        int angleOne = input.nextInt();
        System.out.println("please enter degrees of angle two");
        int angleTwo = input.nextInt();
        System.out.println("please enter degrees of angle three");
        int angleThree = input.nextInt();
        if (angleOne + angleTwo + angleThree == 180) {
            System.out.println("its a valid triangle");
        } else {
            System.out.println("invalid triangle");
        }

    }
}
