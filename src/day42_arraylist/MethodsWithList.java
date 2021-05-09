package day42_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MethodsWithList {
    public static void main(String[] args) {
        List<String>words=new ArrayList<>();
        words.add("java"); words.add("html");words.add("selenium");
        words.add("a");words.add("input");words.add("title");
        printStrList(words);
        System.out.println();
        printStrList(Arrays.asList("select","br","python","css","sql","api","option"));
        List<Integer>nums= Arrays.asList(23,24,57,78,435,77,899,545,8,9);
        int sum =sumIntegerList(nums);
        System.out.println(sum);
        /**
         * methodName: printStrList
         * param: List of Strings
         * return: void
         * print all values separated by space
         */

        /** method name: sumIntegerList
         * param: List of Integers
         * returns: int
         * Calculates sum of integers in the list then returns
         */

    }
    public static void printStrList(List<String>strings){
        for (String each:strings) {
            System.out.print(each+" ");
        }
    }
    static public  int sumIntegerList(List<Integer> integers) {
    int sum =0;
    for(int each:integers)
        sum+=each;
        return sum;
    }
}
