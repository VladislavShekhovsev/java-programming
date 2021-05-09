package day09_scanner_practice;
import java.util.Scanner;
public class SpeedCheck1 {
    public static void main(String[] args) {
Scanner input = new Scanner(System.in);
int yourSpeed = input.nextInt();
        int speedLimit =55;
        int overLimit = yourSpeed- speedLimit;
        System.out.println("You are driving "+overLimit+"mph over the limit, pls slow down.");

    }
}
