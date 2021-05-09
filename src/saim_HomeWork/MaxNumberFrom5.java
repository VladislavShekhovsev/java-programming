package saim_HomeWork;
import java.util.Scanner;
public class MaxNumberFrom5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int max =0;

       for(int i =0;i<5;i++){
           System.out.println("Enter a number");
           int number = input.nextInt();
           if (number>max){
               max =number;
           }

       }
        System.out.println(max);

    }
}
