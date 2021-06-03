package OfficeHours.practice_05_19_21;

import java.util.ArrayList;
import java.util.Arrays;

public class removeLongStrings {
    public static void main(String[] args) {
   ArrayList<String>list=new ArrayList<>(Arrays.asList("one","two","three","four","five","six"));
        System.out.println(removeLongString(list,4));
        System.out.println(removeLongStringLambda(list,4));

    }
    public static ArrayList<String>removeLongString(ArrayList<String> list,int minLength){
        ArrayList<String> validStrings =new ArrayList<>();
        for (String word: list) {
            if(word.length()>=minLength){
                validStrings.add(word);
            }
        }
        return validStrings;

    }
    public static ArrayList<String>removeLongStringLambda(ArrayList<String>list,int minLength){
        list.removeIf(each->each.length()<minLength);
        return list;
    }
}
