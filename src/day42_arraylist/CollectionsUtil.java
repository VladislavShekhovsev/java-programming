package day42_arraylist;
import day41_arraylist.ArraysAsList;

import java.util.*;
public class CollectionsUtil {
    public static void main(String[] args) {
        List<Character>letters=new ArrayList<>();// regular declaration as list
        letters.addAll(Arrays.asList('j','a','v','a','i','s','f','u','n'));// adding using asList method but in different line like assign to variable.
        System.out.println("size = "+letters.size());
        System.out.println("printing ="+letters);//print
        Collections.reverse(letters);// using collection to reverse
        System.out.println("reversed ="+letters);
        System.out.println(Collections.frequency(letters, 'a'));// to know how many time its repeating, in our case character a
        int vCount =Collections.frequency(letters,'v');
        System.out.println(vCount);
        System.out.println("Max char = "+Collections.max(letters));// will give the max value according to ascii table
        System.out.println("Min char ="+Collections.min(letters));
        Collections.reverse(letters);// reverse again
        Collections.replaceAll(letters,'a','u');// method that we use to replace some value, can be anything (work only with list)
        Collections.replaceAll(letters,'i','j');
        System.out.println("After replace all = "+letters);
        Collections.sort(letters);
        System.out.println("After sort ="+letters);
        List<Integer> nums = Arrays.asList(23,1,43,5,234,7,-9,0,1,5,5,5,5,8);
        System.out.println("nums = "+nums);
        Collections.reverse(nums);//sorting by value
        System.out.println("reversed = "+nums);
        int max = Collections.max(nums);
        int min =Collections.min(nums);
        System.out.println("max number = "+max);
        System.out.println("min number = "+min);
        int countOfFives = Collections.frequency(nums,5);
        System.out.println(countOfFives);
        int countOfOne=Collections.frequency(nums,1);
        System.out.println(countOfOne);
        Collections.replaceAll(nums,5,44);// replacing all 5 by 44
        System.out.println(nums);
        Collections.sort(nums,Collections.reverseOrder());// sort nums but in the reversed order
        System.out.println(nums);// after the reversed order
        Collections.shuffle(nums);// in rus(Smeshat) mix the order// randomize the order(each run gonna be different)
        System.out.println(nums);







    }
}
