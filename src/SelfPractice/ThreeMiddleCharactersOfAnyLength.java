package SelfPractice;
import java.util.*;
public class ThreeMiddleCharactersOfAnyLength {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        //YOUR CODE HERE
        if(word.length()%2!=0&&word.length()>5){
            int middle =word.length()/2;
            System.out.print(""+word.charAt(middle-1)+word.charAt(middle)+word.charAt(middle+1));

        }else{
            System.out.println("invalid");
        }

    }
}
