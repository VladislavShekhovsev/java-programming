package SelfPractice;
import java.util.*;
public class ReplLast {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
         String word = input.next();
        System.out.println(word.charAt(word.length() - 1));// last character
        System.out.println(""+word.charAt(0)+ word.charAt(word.length()- 1));//first and last character

        String word2 = input.next();
        if (word2.length() % 2 != 0) {
            System.out.println(word2.charAt(word2.length() / 2 ));//middle character
        }//else if(word.indexOf(word)==0){}
        String word3 = input.next();
        if (word3.length()==1){
            System.out.println(word3+word3+word3);
            System.out.println(word3.length());
            String word4 = "vi";
            System.out.println(word4.length());
            System.out.println(word4.indexOf("i"));
            String ex = "vlad";
            System.out.println(ex.length());
            if (word.length()%2==0&&word.length()>2){
            System.out.println(""+word.charAt(word.length()/2)+word.charAt(word.length()/2-1));


            }
        }
    }
}