package day11_comparison_operators;

import java.sql.SQLOutput;

public class PrePostIncrementDecrementOperators {
    public static void main(String[] args) {
        /** ++ plus one ,-- minus one its increment (plus) and decrement (minus)\**/
        int num1 = 1;
        num1++;//increment
        ++num1;
        System.out.println(num1);
        int num2 =5;
        num2--;//decrement
        --num2;
        System.out.println(num2);
        //PRE_INCREMENT EX:
        int num3 =10;
        int num4=++num3; //++ pre (before) increase by one,
        // so it made num3=11 first and then made it equal to num 4.
        // so they both became to be 11
        System.out.println("num3 = "+num3);
        System.out.println("num4 = "+num4);
        //POST_INCREMENT EX:
        int num5 = 10;
        int num6 = num5++;//++post (after) increase by one num5,
        // but the equal was before the adding one (java read and do everything from left to right)
        // so it will make num6 equal to num 5 first (=10) and only then will add 1 to num 5,
        // and will make num 5=11.
        // ex: int num 6=num5++ its like int num6 = num5 and next like will add 1 to num5.
        System.out.println("num5= "+num5);
        System.out.println("num6= "+num6);
        int cars = 5;
        System.out.println(++cars);// increase first and then print
        int sedans = 10;
        System.out.println(sedans++);// first print and then add (old number stay's)
        int a =50;
        int b = 22;
        int c =a++ + ++b;
        System.out.println("a = "+a);
        System.out.println("b = "+b);
        System.out.println("c = "+c);
       }
}
