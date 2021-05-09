package day43_list_custom_classes;
import java.util.*;
import java.util.List;

public class MethodsWithListReturn {
    public static void main(String[] args) {
        System.nanoTime();
        // 1 second =1,000,000,000 nanoseconds
        long st =System.nanoTime();
       List<Integer>MillionNumbers=getIntegerList();// assign the value to new List
        long en =System.nanoTime();
        double seconds=(en-st)/1_000_000_000.0;
        System.out.println(seconds);
        System.out.println("List time = "+(en-st));
    System.out.println(MillionNumbers);// print
        long start =System.nanoTime();
        int[] arr = getIntegerArray();
        System.out.println(Arrays.toString(arr));
        long end =System.nanoTime();
        double second=(end-start)/1_000_000_000.0;
        System.out.println(second);
        System.out.println("Array time = "+(end-start));


    }
    public static List<Integer>getIntegerList() {
        List <Integer> nums = new ArrayList<>();
        for (int i = 0; i <=10000000; i++) {
           nums.add(i);
        }
    return nums;}

    public static int[]getIntegerArray(){
       int[] nums =new int[1_000_001];
        for (int i = 0; i <=1_000_000; i++) {
          nums[i]=i;
        }
       return nums;}

}