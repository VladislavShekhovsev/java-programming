package day25_loops;
import java.util.*;
public class FizzBuzz {
    public static void main(String[] args) {
       /** for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            }else if (i%3==0){
                System.out.println("Fizz");
            }else if(i%5==0){
                System.out.println("Buzz");
            }else{
                System.out.println(i);
            }

        }*/

        for (int n = 1; n <= 100; n++){
            if (n % 3 == 0 && n % 5 == 0){
                System.out.print(n);
                System.out.println(" Fizz Buzz");
            } else if (n % 3 == 0 ){
                System.out.println(n + " Fizz");
            } else if (n % 5 == 0) {
                System.out.println(n + " Buzz");
            } else if (n % 3 != 0 && n % 5 != 0){
                System.out.println(n + " This is not Fizz or Buzz");
            }
        }
        Scanner scan = new Scanner(System.in);
        System.out.println("please enter start number");
        int start = scan.nextInt();
        System.out.println("please enter end number");
        int end = scan.nextInt();

        for (int i = start; i <= end; i++){
            System.out.print(i + " ");
            }
         if(start>end){
             System.out.println("reverse number not allowed");
         }
        }


    }




