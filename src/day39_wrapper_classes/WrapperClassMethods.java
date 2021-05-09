package day39_wrapper_classes;

import java.util.function.DoubleConsumer;

public class WrapperClassMethods {
    public static void main(String[] args) {
        System.out.println(Integer.max(10,5));
        System.out.println(Integer.sum(50,35));
        System.out.println(Integer.min(10,5));
        System.out.println("minimum int: "+Integer.MIN_VALUE);
        System.out.println("maximum int: "+Integer.MAX_VALUE);

        System.out.println(Double.max(234.4,23.5));
        System.out.println(Double.min(234.4,23.5));

        System.out.println(Double.MIN_VALUE);
        System.out.println(Double.MAX_VALUE);

        System.out.println(Double.compare(5,1));// positive first larger
        System.out.println(Double.compare(1,1));// 0 its equals
        System.out.println(Double.compare(1,5));// negative because first value is smaller

        System.out.println(Character.isDigit('8'));// if its number =true
        System.out.println(Character.isDigit('V'));// not a number (digit its number)= false
        System.out.println(Character.isLetter('I'));// check if its letter
        System.out.println(Character.isUpperCase('R'));// check if capital
        System.out.println(Character.isAlphabetic('T'));// also check if its letter
        char letter ='A';
        System.out.println(Character.isUpperCase(letter));
        if(Character.isUpperCase(letter)){
            System.out.println("it is Uppercase");
        }
        String word = "jaVa iS Fun";
        for (int i = 0; i < word.length(); i++) {
            if(Character.isUpperCase(word.charAt(i))){
                System.out.print(word.charAt(i)+" ");
            }
        }
        System.out.println();
        System.out.println(Character.isSpaceChar('*'));// not number or letter
        System.out.println(Character.isAlphabetic('א'));
        System.out.println(Character.isLetter('א'));

        //converting string to number.
        // we can use parse of valueOf methods in wrapper classes.
        String total ="345";
        int count = Integer.parseInt(total);
        int num = Integer.parseInt("55");
        System.out.println(count);
        String strPrice ="123.99";
        double price = Double.parseDouble(strPrice);
        System.out.println(price);
        System.out.println(num);


    }
}
