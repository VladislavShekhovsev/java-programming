package repls;
import java.util.*;
public class ReverseSentence2 {
    public static void main(String[] args) {
        String str = "i love lera";
    /**    for (int i = str.length()-1; i >=0 ; i--) {
            System.out.print(str.charAt(i));
        } "to reverse the string character by character"*/
     String [] arrStr =str.split(" "); // creating array that will hold str parameters
        String [] reversed= new String[arrStr.length];// creating empty array with length of arrStr array;
        for (int i = arrStr.length-1, c=0; i>=0 ; i--, c++) {
            System.out.println(arrStr[i]); //to test.
            reversed[c]=arrStr[i];// cory the reversed value of arrStr array to reversed array
        }
        System.out.println(Arrays.toString(reversed));


    }
}
