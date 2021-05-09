package day31_arrays;
import java.util.*;
public class BinarySearch {
    public static void main(String[] args) {
        int [] nums ={23,123,654,2344,12345,14421};
        System.out.println(Arrays.binarySearch(nums,23));
        System.out.println(Arrays.binarySearch(nums,123));
        System.out.println(Arrays.binarySearch(nums,654));
        System.out.println(Arrays.binarySearch(nums,2344));
        System.out.println(Arrays.binarySearch(nums,150));// 23 =0,123 =1,150 is between 123 and 654=2 so if we dont have it its
        // go to - plus -1 so -3 (0=1/-1,1=2/-2,+-1)
        System.out.println(Arrays.binarySearch(nums,15000)); //-7
        if(Arrays.binarySearch(nums,12345)>=0){
            // the value is there(else it will became -
            System.out.println("12345 is present in array");
            System.out.println("index = "+Arrays.binarySearch(nums,12345));
        }else{
            System.out.println("12345 not present");
        }


    }
}
