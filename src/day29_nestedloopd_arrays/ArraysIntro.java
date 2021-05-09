package day29_nestedloopd_arrays;

public class ArraysIntro {
    public static void main(String[] args) {
        // int num =10; single variable
        int [] nums =new int[3]; //array variable/ 3 its size (how much variables to hold)
        nums[0]=5;nums[1]=10;nums[2]=7;// values in different cases of nums array
        //print values of array
        System.out.println("value at index = "+nums[0]);
        System.out.println("value at index = "+nums[1]);
        System.out.println("value at index = "+nums[2]);
        //how to find size of array
        System.out.println(nums.length);//size of 3
        int len = nums.length;
        nums[0]=300;
        nums[1]=400;
        nums[2]=100;
        nums[2]=nums[1];
        System.out.println("nums[0] = "+nums[0]+" nums[1] = "+nums[1]+" nums[2] = "+nums[2]);


    }
}
