package repls;

import java.util.Arrays;
import java.util.Scanner;

public class PopulateArray {
    public static void main(String[] args) {
        int [] i= new int[new Scanner(System.in).nextInt()];
        i = populate(i) ;
        System.out.println(Arrays.toString(i));
    }

    public static int[] populate(int[] r) {

        int[] populated = new int[r.length];
        for (int j = 0; j < populated.length; j++) {
            populated[j] += j + 1;}

            return populated;}

}