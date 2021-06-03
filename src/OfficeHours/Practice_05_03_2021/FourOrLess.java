package OfficeHours.Practice_05_03_2021;

import java.util.ArrayList;
import java.util.Arrays;

public class FourOrLess {
    public static void main(String[] args) {
        ArrayList<String>List = new ArrayList<>(Arrays.asList("apple","java","tree","cat","animal","shortcut"));
        ArrayList<String> List2=new ArrayList<>();
        for(String each:List){
            if(each.length()<=4){
                List2.add(each);
            }
        }
        System.out.println(List2);
    }
}
