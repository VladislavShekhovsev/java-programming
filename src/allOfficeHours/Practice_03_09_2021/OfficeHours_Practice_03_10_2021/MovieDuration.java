package allOfficeHours.Practice_03_09_2021.OfficeHours_Practice_03_10_2021;
import java.util.Scanner;
public class MovieDuration {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter length of movie ");
        double movieLength = input.nextDouble();
        double price = 0;
        if (movieLength == 1){price = 8.99;}
        if (movieLength==1.5){price = 10.5;}
        if (movieLength==2.0){price = 12.99;}
        if (movieLength==2.5){price = 14.50;}
        if (movieLength>=3){price = 15.99;}
            System.out.println("Price; " + price); // = assigment and == for comparison.

    }
}