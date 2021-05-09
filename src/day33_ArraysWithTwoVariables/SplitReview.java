package day33_ArraysWithTwoVariables;

import java.util.Arrays;

public class SplitReview {
    public static void main(String[] args) {
        String word ="java";
        String[] array =word.split("a");
        System.out.println(array.length);
        int countOfA = array.length-1;
        System.out.println("count of a"+countOfA);
        if(word.endsWith("a")){
            countOfA++;
        }
        System.out.println("countOfA "+countOfA);
        String worda ="ajava";
        String [] arrayA = worda.split("a");
        System.out.println(arrayA.length);
        System.out.println("-------split by empty space------");
        String[]strArr =word.split("");// assign every character as independent string
        System.out.print(strArr[0]);
        System.out.print(strArr[1]);
        System.out.print(strArr[2]);
        System.out.print(strArr[3]);
        //Split method in java, is more powerful then we used so far.
        //it accepts regular expression es well
        //REGULAR EXPRESSION ITS A PATTERN BASED ON MATCHING TECHNIQUE
        // EX: \d means any number;
        // EX2: [A-z] means any character from A-Z
        System.out.println();
        System.out.println("---------split using regular expression---------");
        String  wordNew = "java1html2ruby";
        String[] strArr2 = wordNew.split("\\d");
        System.out.println(Arrays.toString(strArr2));
        System.out.println(strArr2[0]);
        wordNew=wordNew.replaceAll("\\d","_");
        System.out.println(wordNew);
        String password = "bcTd123_5";
        if(password.matches("^.*(?=.{8,})(?=..*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^_&+=]).*$")) {
            System.out.println("Valid password");
        } else {
            System.out.println("Invalid password");
        }
        //Split is very powerful method it can take even RegEx(regular expressions)





    }
}
