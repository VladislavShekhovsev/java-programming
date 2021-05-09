package saim_HomeWork.Practice_05_05_21;
import java.util.*;
public class reverseOnlyLetters {
    public static void main(String[] args) {

       //replace only letters(special characters stay at their position)
        Scanner in = new Scanner(System.in);
        //   System.out.println(reverseNoSpec(in.next()));
        System.out.println(reverseNoSpec("Ab,c,de!$"));
        // edcbA


    }
    public static String reverseNoSpec(String str) {

        // your code here
        char[]letters = str.toCharArray();
       // System.out.println(Arrays.toString(letters));
        for(int i =0,j=letters.length-1;i<=letters.length/2;i++){
            if(Character.isLetter(letters[i])){
                for(;j>=0;j--){
                    if(Character.isLetter(letters[j])){
                        char temp =letters[i]; //A stored
                        letters[i]=letters[j];// 'e'
                        letters[j]=temp;
                        j--;
                        break;
                    }
                }
            }
        }
            return String.valueOf(letters);
    }
}
