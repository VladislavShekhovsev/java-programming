package day31_arrays;
import java.util.Arrays;
import java.util.Collections;

public class ArraysUtil {
    public static void main(String[] args) {
        int [] nums ={100, 40,37,1,4,7,-38,-1};
        // print all nums in same line.
        System.out.println(Arrays.toString(nums));
        Arrays.sort(nums);// sorting method for array from minimum value to max
        System.out.println(Arrays.toString(nums));
        System.out.println("minimum value after sorting"+nums[0]);
        System.out.println("maximum value "+nums[nums.length-1]);
        String[] words={"java","c#","C++","Kotlin","Python","Ruby","Assembly"};
        System.out.println(Arrays.toString(words));
        System.out.println("["+String.join(" * ", words)+"]");

        //sort words in alphabetic and ASCII order
        Arrays.sort(words);
        System.out.println(Arrays.toString(words));

        //sort words in reverse order
        Arrays.sort(words, Collections.reverseOrder());
        System.out.println(Arrays.toString(words));





    }
}
