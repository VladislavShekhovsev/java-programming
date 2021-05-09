package day33_ArraysWithTwoVariables;

import java.util.Arrays;

public class day33_GroupFriends {
    public static void main(String[] args) {
        String[] MyGroupFriends ={"Artem Nui","Dany","Emir","Maria","Mustafa","Nasiba","Orcun","Rita","Emrah","Igor","Ihsan","Yusuf"};
        for(String name : MyGroupFriends){
            System.out.println("Happy holidays "+name+"!, i wish u all the best");
           int[] nums ={5,10,4,100};
           int[]numsRev = new int [nums.length]; // by default it gonna be {0,0,0,0} but same length as itn[] nums
            for(int i =nums.length-1, j =0;i>=0;i--,j++){ // for loop which 2 variable one go forward and second reverse to assign
                // i =100(index 3)to first position of j (index 0), then second position from i with is 4 to second position of j (index 1) etc
                // reversed value assignment.
                numsRev[j]=nums[i];
            }
            System.out.println(Arrays.toString(nums));
            System.out.println(Arrays.toString(numsRev));

        }
    }
}
