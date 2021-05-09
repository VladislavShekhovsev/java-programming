package SelfPractice;

import java.util.Arrays;

public class ArraySelfPracticeOne {
    public static void main(String[] args) {
        int [] nums = new int[5];
        nums[0]= 50;
        nums[1]=70;
        nums [2]=40;
        nums[3]=10;
        nums[4]=15;
        System.out.println(nums[4]);
        int [] numbers = {1,2,3,4,5,6,7,85,80};
        System.out.println(Arrays.toString(numbers));
        System.out.println(numbers[8]);
        if(nums.equals(numbers)){
            System.out.println("much");
        }else{
            System.out.println("mis-much");
        }
        System.out.println(Arrays.binarySearch(numbers,7));
        String[] animals = new String[5];
        animals[0] = "elephant";
        animals[1] = "wolf";
        animals[2] = "awl";
        animals[3] = "dog";
        animals[4] = "rabbit";
        System.out.println(animals[1]);
        System.out.println(Arrays.toString(animals));
        String animal = (Arrays.toString(animals));
        System.out.println(animal);
        Arrays.sort(animals);
        System.out.println(Arrays.toString(animals));

    }
}
