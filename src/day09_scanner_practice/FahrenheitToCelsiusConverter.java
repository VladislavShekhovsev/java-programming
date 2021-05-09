package day09_scanner_practice;
import java.util.Scanner;
public class FahrenheitToCelsiusConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("***FAHRENHEIT TO CELSIUS CONVERTER***");
        double fahrenheit = input.nextDouble();
        double Celsius = (int)(fahrenheit - 32.00)*5/9;
        System.out.println("There is "+Celsius+" Celsius right now");


    }
    }
