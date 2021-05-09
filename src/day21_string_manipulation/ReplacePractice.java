package day21_string_manipulation;

import java.util.Locale;

public class ReplacePractice {
    public static void main(String[] args) {
        String word = "github";
        System.out.println(word.toUpperCase());
        System.out.println(word.replace("hub", "lab"));
        System.out.println("word " + word);
        word = word.replace("hub", "lab");
        System.out.println("word " + word);
        System.out.println(word.replace("i", "o").replace("a", "i"));
        String word2 = "java is fun";
        System.out.println(word2.replace(" ", ""));
        System.out.println(word2.replace("java", "selenium").replace("fun", "a lot of fun"));
        String result = "1-48 of over 4,000 result for java book;";
        System.out.println(result.replace("1-48 of over ", "").replace(" result for java book;", ""));
        result = result.replace("1-48 of over ", "")
                .replace(",", "")
                .replace(" result for java book;", "");
        System.out.println(result);
        int count = Integer.parseInt(result);
        count++;
        if (count > 0) {
            System.out.println("search success");
        }            // 0123
        String word3 = "java";
        System.out.println(word3.charAt(0));
        System.out.println(word3.charAt(1));
        System.out.println(word3.charAt(2));
        System.out.println(word3.charAt(3));
        // index its amount of characters in the string, but its starts from 0(first character its 0)
        // Like "Vladislav" V=0,l=1,a=2,d=3,i=4,s=5 etc
        // length its always index +1
        String company = "Cyberteck";
        System.out.println("first letter " + company.charAt(0));
        char first = company.charAt(0);
        char second = company.charAt(1);
        char third = company.charAt(2);
        char fourth = company.charAt(3);
        char five = company.charAt(4);
        char six = company.charAt(5);
        char seven = company.charAt(6);
        char eight = company.charAt(7);
        char nine = company.charAt(8);

        System.out.println(first);
        System.out.println(first+" * "+second+" * "+third+" * "+fourth+" * "+five+" * "+six+" * "+seven+" * "+eight+" * "+nine);
        String withSpaces = first+" * "+second+" * "+third+" * "+fourth+" * "+five+" * "+six+" * "+seven+" * "+eight+" * "+nine;
        String word4 ="mom"; // palindrom word back and forth if read same word like madam,aziza etc;
         char first1 = word4.charAt(0);
         char third2 = word4.charAt(2);
         if(first1==third2){
             System.out.println("first and last letter match");
         }else{
             System.out.println("first and last letter mismatch");
         }
         if(word4.charAt(0)==word4.charAt(2)){
             System.out.println("same letters");
         }
         String word5 ="aziza";
         char firstLetter = word5.charAt(0);
         char secondLetter =word5.charAt(1);
         char lastLetter = word5.charAt(word5.length()-1);// like math in parenthesis will process first
        // ,(word5 =length -1 to find the index (-1 because of index0), now we know the last character number in index
        // and we can assign it to charAt to convert to char letter.
        System.out.println(firstLetter);
        System.out.println(lastLetter);
        // or same in two steps
        int count1 = word5.length();
        char lastletter =word5.charAt(count1-1);
        System.out.println(word5.charAt(0));// will find the letter and return its position in index,
        // if multiple same characters/letters, will always return the first one

    }
}
