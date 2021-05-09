package saim_HomeWork.Practice_05_03_2021;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class SumOfNumbersInList {
    public static void main(String[] args) {
        ArrayList<String>List=new ArrayList<>(Arrays.asList("123","54","24"));
        for (int i = 0;i<List.size();i++) {
            int totalSum =0;
            for(char digit:List.get(i).toCharArray()){//[1,2,3]
                totalSum+=Integer.parseInt(""+digit);
        }
            List.set(i,""+totalSum);

    }
        System.out.println(List);
}
}