package day42_arraylist;
import java.util.*;
public class UniqueFromList {
    public static void main(String[] args) {
        List<Integer> nums= new ArrayList<>(Arrays.asList(2,4,4,1,5,6,0,6));
        List<Integer> uniqueList = getUniqueIntFromArrayList(nums);
        System.out.println("\n"+uniqueList);



    }

    public static List<Integer> getUniqueIntFromArrayList(List<Integer> nums) {
        List<Integer>uniqueList=new ArrayList<>();// new array list to store only unique number
        for (int each: nums) {
            if(Collections.frequency(nums,each)==1){// using frequency to find unique character in if statement
                System.out.print(each+" ");
                uniqueList.add(each);
            }
        }
        return uniqueList;
    }
}
