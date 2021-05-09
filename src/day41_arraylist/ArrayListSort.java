package day41_arraylist;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ArrayListSort {
    public static void main(String[] args) {
        // to sort array we use sort method
        // and for arrayList we use collection.sort
        List<Integer> nums = new ArrayList<>();
        nums.add(120);nums.add(3);nums.add(1);
        System.out.println("before sort : "+nums);
        Collections.sort(nums);
        System.out.println("after sorting :"+nums   );
    }
}
