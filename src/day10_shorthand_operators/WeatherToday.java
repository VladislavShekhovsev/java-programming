package day10_shorthand_operators;
import java.util.Scanner;
public class WeatherToday {
    public static void main(String[] args) {
        System.out.println("How its the weather today ?");
        Scanner input = new Scanner(System.in);
        String weather = input.nextLine();
        System.out.println(weather+" Its a great weather.");

    }
}
