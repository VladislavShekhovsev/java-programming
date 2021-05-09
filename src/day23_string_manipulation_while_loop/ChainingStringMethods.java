package day23_string_manipulation_while_loop;

import java.util.Locale;

public class ChainingStringMethods {
    public static void main(String[] args) {
        String word = "wooden spoon";
        System.out.println(word.toLowerCase().toLowerCase().length());
        System.out.println(word.replace(" ","").toUpperCase());
        String city ="chicago";
        System.out.println(city.substring(0,1).toUpperCase()+city.substring(1).toLowerCase());
        String city2 = "kAbUl";
       String city3= (city2.substring(0,1).toUpperCase()+city2.substring(1).toLowerCase());
        System.out.println("city = "+city3);
    }
}
