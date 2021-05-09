package day19_class_vs_object_strings;

import java.util.Locale;

public class StringCaseConversion {
    public static void main(String[] args) {
        String word = "Cybertek";
        System.out.println(word);
        System.out.println(word.toLowerCase());
        System.out.println(word.toUpperCase());
        System.out.println("JAVA".toLowerCase());
        System.out.println(("java its cool").toUpperCase());
        String worldInUpCase = word.toUpperCase();
        System.out.println(worldInUpCase);
        word.toLowerCase();// do not do nothing
        System.out.println(word);
        // change the value for all time:
        word=word.toUpperCase();// for all time. permanent
        System.out.println(word);
        String company = "Amazon";
        System.out.println(company.toUpperCase());
        System.out.println("java".toUpperCase());
        company=company.toUpperCase();
        System.out.println("we arw working in "+company);
    }
}
