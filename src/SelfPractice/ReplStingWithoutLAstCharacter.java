package SelfPractice;
import java.util.*;
public class ReplStingWithoutLAstCharacter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String txt = input.next();
        String x= (txt.substring(0,txt.length()-1));
        System.out.println(x);
    }
}
