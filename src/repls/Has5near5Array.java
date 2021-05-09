package repls;

import java.util.Arrays;

public class Has5near5Array {
    public static void main(String[] args) {
        boolean hasFive = false;
        int count = 0;
   /*     int nums[] = {1, 3, 5, 9, 9, 8, 0, 9,5};
            for (int j = 0; j <nums.length ; j++) {
                if(nums[j]==5){
                    count++;
                }
            }
          if (count>1){
              hasFive =true;
          }
        System.out.println(hasFive); */

        int nums[] = {1, 3, 5, 5, 9, 8, 0, 9, 5};
        for (int j = 0; j < nums.length-1; j++) {
            if (nums[j] ==5&&nums[j+1]==5) {

                hasFive = true;
            }

        }
        System.out.println(hasFive);
    }
}