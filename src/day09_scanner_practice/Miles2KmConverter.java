package day09_scanner_practice;
import java.util.Scanner;
public class Miles2KmConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("***********MILES TO KM CONVERTER*********");
        System.out.println("please enter miles; ");
        double miles = input.nextDouble();
        double kilometer = miles * 1.609;
        System.out.println(miles+" miles its "+kilometer+"km");

    }
}
