package repls;

import java.util.Arrays;

public class ReversedArrayUsingLoop {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        for (int i = 0, j = nums.length - 1; i < nums.length / 2; i++, j--) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;


        }
        System.out.println(Arrays.toString(nums));
    }
}
