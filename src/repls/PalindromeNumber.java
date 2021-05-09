package repls;
import java.util.*;
public class PalindromeNumber {
    public static void main(String[] args) {
        int num = 132231;
        String nums=""+num;
        String[]numbers =nums.split("");



        boolean isPalindrome = true;
        for (int i = 0,j=numbers.length-1; i <numbers.length/2 ; i++, j--) {
            if(!numbers[i].equals(numbers[j])){
                isPalindrome= false;
            }
        }
        System.out.println(isPalindrome);

    }
}
