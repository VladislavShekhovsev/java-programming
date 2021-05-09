package repls;

import java.util.Arrays;
import java.util.Scanner;

public class Diving {
    public static void main(String[] args) {
        float score[] ={5,5,1,5,5,8,9};
        float difficulty = 2.1F;
        float sum =0;
        Arrays.sort(score);
        for (int i = 1;i<score.length-1;i++) {
           sum+=score[i];

        }
        System.out.println((sum*difficulty)*0.6F);


    }
}
