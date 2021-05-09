package day39_wrapper_classes;

import java.sql.SQLOutput;
import java.util.Arrays;

public class ParseString {
    public static void main(String[] args) {
        String total = "345";
        int count = Integer.parseInt(total);
        System.out.println(total);
        System.out.println("count = " + total);
        String strPrice = "123.5";
        double price = Double.parseDouble(strPrice);
        String price2 = "100";
        double price3 = Double.parseDouble(price2);
        if (price > price3) {
            System.out.println("true");
        }
        String sentence = "i wrote 857 lines of code";
        String[] word = sentence.split(" ");
              int number=0;
        for (int i = 0; i < word.length; i++) {
            if (word[i].equals("857"))
                System.out.println(i);
            number = Integer.parseInt(word[2]);

        }
        System.out.println("Our number = " +number);
    }
}