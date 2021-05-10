package SelfPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SeparateParts {
    public static void main(String[] args) {
        String str = "ABCD123$%#@&456EFG!";
        String mix ="AH@#$L8979KHS";
    }
    public static List separatedCharacters(String str) {
        List<Character> list1 = new ArrayList<>();
        List<Character> list2 = new ArrayList<>();
        List<Character> list3 = new ArrayList<>();
        List<List> holder = new ArrayList<>();

        String empty = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 65 && str.charAt(i) < 91) {
                list1.add(str.charAt(i));
            } else if (str.charAt(i) >= 48 && str.charAt(i) < 58) {
                list2.add(str.charAt(i));
            } else {
                list3.add(str.charAt(i));
            }
        }
        /** System.out.println(list1);
         System.out.println(list2);
         System.out.println(list3);*/
        if(!list1.isEmpty()){
        holder.add(list1);}
        if(!list2.isEmpty()){
        holder.add(list2);}
        if(!list3.isEmpty()){
        holder.add(list3);}
   return holder; }


}
