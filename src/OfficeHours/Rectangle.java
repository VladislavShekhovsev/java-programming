package OfficeHours;
import java.util.Scanner;
//PIC ->package -> Import->Class
public class Rectangle {
    public static void main(String[] args) {
//        double length= 5;
//        double width = 3;
  Scanner input = new Scanner(System.in);
//  SINS
        double length = input.nextDouble();
        double width = input.nextDouble();
        double perimeter = 2*(length+width);
        double area =length*width;
        System.out.println("perimeter = "+ perimeter);
        System.out.println("area = "+area);
    }
}
