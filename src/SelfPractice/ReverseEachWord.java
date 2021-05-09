package SelfPractice;
import day38_methods.ReverseArray;

import java.util.Arrays;
public class ReverseEachWord {
    public static void main(String[] args) {
        System.out.println(reverseEachWord("i love Lera"));

    }
    public static String reverseEachWord(String str){
       String reverse = "";
       for(String each:str.split(" ")){
           reverse+= ReverseArray.reverse(each)+" ";
       }

       return reverse.trim();
    }
}
