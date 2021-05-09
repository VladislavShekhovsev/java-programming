package SelfPractice;
import java.util.*;
public class PrintInLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float [] score = new float[7];
        for (int i = 0; i <=7; i++) {
            System.out.println("Enter score for judge "+i+":");
             score[i] = input.nextFloat();
        }
        System.out.println(Arrays.toString(score));
        // System.out.println("Enter score for judge 1:");
        //    float num1 = input.nextFloat();
        //    System.out.println("Enter score for judge 2:");
        //    float num2 = input.nextFloat();
        //    System.out.println("Enter score for judge 3:");
        //    float num3 = input.nextFloat();
        //    System.out.println("Enter score for judge 4:");
        //    float num4 = input.nextFloat();
        //    System.out.println("Enter score for judge 5:");
        //    float num5 = input.nextFloat();
        //    System.out.println("Enter score for judge 6:");
        //    float num6 = input.nextFloat();
        //    System.out.println("Enter score for judge 7:");
        //    float num7 = input.nextFloat();
        //    System.out.println("Enter difficulty:");
        //    float difficulty = input.nextFloat();
        //    score[0]=num1;score[1]=num2;
        //    score[2]=num3;score[3]=num4;
        //    score[4]=num5;score[5]=num6;
        //    score[6]=num7;
        //     float sum =0;
        //        Arrays.sort(score);
        //        for (int i = 1;i<score.length-1;i++) {
        //           sum+=score[i];
        //
        //        }
        //        System.out.println("Total: "+(sum*difficulty)*0.6F);
        //
        //
        //    }
        //
        //
        //
        //
        //  }
    }
}
