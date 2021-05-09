package day26_loops;
import java.util.*;
public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = input.nextInt();
        if(number<1||number>10) {
            System.out.println("ERROR: invalid input");
            return;//exit main method/stop the program.
        }
        for (int i =1;i<=10;i++){
            System.out.println(number+" X "+i+" = "+(number*i));
        }
    }

}

      /*System.out.println(number+ " x "+1+" = "+(number*1));
        System.out.println(number+ " x "+2+" = "+(number*2));
        System.out.println(number+ " x "+3+" = "+(number*3));
        System.out.println(number+ " x "+4+" = "+(number*4));
        System.out.println(number+ " x "+5+" = "+(number*5));
        System.out.println(number+ " x "+6+" = "+(number*6));
        System.out.println(number+ " x "+7+" = "+(number*7));*/
