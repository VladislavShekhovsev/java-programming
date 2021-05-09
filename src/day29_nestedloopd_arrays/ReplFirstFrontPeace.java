package day29_nestedloopd_arrays;

import javax.sound.midi.Soundbank;
import java.util.Arrays;

public class ReplFirstFrontPeace {
    public static void main(String[] args) {
     /*   Given an int array num of any length, print a new array of its first 2 elements.
     If the array is smaller than length 2, use whatever elements are present.
      */
        int [] nums ={4, 5,7};
        int []temp = new int [nums.length];
        for (int i = 0; i <nums.length; i++) {
            if(nums.length>2){
              temp= new int []{nums[0],nums[1]};
            }else{
                temp= new int []{nums[0]};
            }
            }
        System.out.println(Arrays.toString(temp));
        }
    }
