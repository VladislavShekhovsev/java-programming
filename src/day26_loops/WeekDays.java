package day26_loops;
import java.util.*;
public class WeekDays {
    public static void main(String[] args) {
     Scanner input= new Scanner(System.in);
        for(int day = input.nextInt();day<=10;day++) {
            switch (day) {
                case 1:
                    System.out.println("Monday");
                    break;
                case 2:
                    System.out.println("Tuesday");
                    break;
                case 3:
                    System.out.println("Wednesday");
                    break;
                case 4:
                    System.out.println("Thursday");
                    break;
                case 5:
                    System.out.println("Friday");
                case 6:
                    System.out.println("Saturday");
                    break;
                case 7:
                    System.out.println("Sunday");
                    break;
                default:
                    System.out.println("no such day, its Java day");

            }
        }
    }

}
