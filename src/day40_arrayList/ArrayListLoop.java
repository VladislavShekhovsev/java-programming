package day40_arrayList;
import java.util.*;
public class ArrayListLoop {
    public static void main(String[] args) {
     List<Integer> nums = new ArrayList<>();//polymorphic way of declaring
        System.out.println(nums);
        System.out.println("size = "+nums.size());
        nums.add(34); nums.add(44); nums.add(3); nums.add(88);
        nums.add(500); nums.add(5); nums.add(845); nums.add(0); nums.add(5);
        System.out.println("nums = "+nums);
        nums.remove(0);// remove index 0 (value 34)
        System.out.println(nums);
        //nums.remove(88) its will try to find index 88 and delete it,we will get OutOfBounds
        nums.remove(new Integer(88));// removes number 88. not 88 index
        System.out.println("nums without 88 "+nums);
        nums.remove(new Integer(5));// will remove only the first 5
        System.out.println(nums);
        for(int i =0;i<nums.size();i++){
            System.out.print(nums.get(i)+" ");

        }
        System.out.println();
        for(Integer each : nums){
            System.out.print(each+" ");
        }

    }
}
