package repls;

import java.util.Arrays;

public class ZombieAttackV1 {
    public static void main(String[] args) {
        int [] arr = {3, 6, 0, 4, 3, 2, 7, 1};
        System.out.println(Arrays.toString(arr));

      while(!Arrays.equals(arr, new int[8])){
         for (int j = 0; j < arr.length; j++) {
             arr[j] = arr[j] / 2;

         }

         System.out.println(Arrays.toString(arr));
     }


    }
}
