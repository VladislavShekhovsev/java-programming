package day40_arrayList;
import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
   ArrayList<Integer> nums = new ArrayList<>();
   nums.add(5);
   nums.add(7);
   nums.add(10);
   nums.add(12);
  // nums.add("str") would not work because its declared as integer
        System.out.println("size ="+nums.size());
        //reading from ArrayList
        System.out.println("index 0 = "+nums.get(0));
        System.out.println("index 1 = "+nums.get(1));
        System.out.println("index 2 = "+nums.get(2));
        System.out.println("index 3 = "+nums.get(3));
     //   System.out.println("out of bounds "+nums.get(4));
        System.out.println(nums);// to print(no need Arrays.toString)
        nums.remove(1);// remove element at index 1
        System.out.println(nums);
    }
}
