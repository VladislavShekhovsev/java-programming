package repls;

import java.util.Arrays;

public class ReplShiftLeft {
    public static void main(String[] args) {
        int [] nums={6, 2, 5, 3};
        int temp[]= new int [nums.length];
        temp[0]=nums[0];
        for (int i = 1; i <nums.length ; i++) {
            nums[i-1]=nums[i];
        }
        nums[nums.length-1] = temp[0];
        System.out.println(Arrays.toString(nums));
    }
}
