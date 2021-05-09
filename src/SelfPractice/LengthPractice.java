package SelfPractice;

import java.util.Arrays;

public class LengthPractice {
    public static void main(String[] args) {
        String[] arr = {"apple", "banana", "cucumber", "papaya"};
        String str ="Rainbow";
        System.out.println(arr.length);
        System.out.println(Arrays.toString(arr));
        System.out.println(arr[3].length());
        System.out.println(arr[3].substring(0,1)+arr[3].substring(arr[3].length()-1));
        System.out.println(str.length());
        System.out.println(str.indexOf("w"));
    }
}
