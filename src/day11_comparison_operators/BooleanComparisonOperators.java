package day11_comparison_operators;

import java.sql.SQLOutput;

public class BooleanComparisonOperators {
    public static void main(String[] args) {
        System.out.println(10==10);
        System.out.println(1000>100);
        System.out.println(985.44<98547.8);
        System.out.println(10<=11);
        System.out.println(5>=3);
        System.out.println(-100!=44);//!= not equal
        int a = 100;
        int b =200;
        System.out.println(a==b);
        System.out.println(a>b);
        System.out.println(a<b);
        System.out.println(a<=b);
        System.out.println(a>=b);
        System.out.println(a!=b);
        boolean result = 5==5;
        System.out.println("resut= "+result);
        result = 33>44;
        System.out.println("resut= "+result);
        result= 88<99;
        System.out.println("resut= "+result);
        result = 10==10;
        System.out.println("resut= "+result);
        result= 123<=124;
        System.out.println("resut= "+result);
        result=2!=2;
        System.out.println("resut= "+result);
        String city="Seattle";
        System.out.println(city=="Seattle");
        System.out.println(city=="Baku");
        System.out.println(city!="Fairfax");



    }
}
