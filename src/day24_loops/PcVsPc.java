package day24_loops;

import java.util.Random;
import java.util.Scanner;

public class PcVsPc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random randomNum =new Random();
        // System.out.println(randomNum.nextInt(101));// generate random numbers.
        int secretNum=randomNum.nextInt(101);
        int guessingNum =0;
        do{
            System.out.println("Guess the secret number;");
            guessingNum = input.nextInt();
            if(guessingNum>secretNum){
                System.out.println("wrong,to large");
            } else if(guessingNum<secretNum){
                System.out.println("Wrong,to small");
            }
        }while(secretNum!=guessingNum);
        System.out.println("congratulations you guest the secret code");

    }
}






