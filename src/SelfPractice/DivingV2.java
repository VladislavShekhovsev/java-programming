package SelfPractice;
import java.util.*;
public class DivingV2 {
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            float[] score = new float[7];

            //WRITE YOUR CODE HERE
            for (int i = 0; i< score.length; i++) {
                System.out.println("Enter score for judge "+(i+1)+":");
                score[i] = input.nextFloat();}


            System.out.println("Enter difficulty:");
            float difficulty = input.nextFloat();

            float sum =0;
            Arrays.sort(score);
            for (int i = 1;i<score.length-1;i++) {
                sum+=score[i];

            }
            System.out.println("Total: "+(sum*difficulty)*0.6F);


        }

    }


