package OfficeHours.practice_05_11_21;

import java.util.ArrayList;
import java.util.Arrays;

public class Nanuk {
    public static void main(String[] args) {
        ArrayList<String>hunting=new ArrayList<>(Arrays.asList("1","10","nanuk","nanuk"));
        System.out.println(nanuk(hunting,2,5));
    }
    public static boolean nanuk(ArrayList<String> r, int way_stones, int boast) {

        int foodFound = 0;

        for(String each : r){

            if(each.equals("nanuk")){
                way_stones--;
            } else {
                foodFound += Integer.parseInt(each);
            }

        }

        return way_stones >= 0 && foodFound >= boast;

    }
}
