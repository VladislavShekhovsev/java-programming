package allOfficeHours.Practice_03_09_2021.OfficeHours_Practice_03_10_2021;
import java.util.*;
public class NestedWithScanner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        if(num>0) {
            System.out.println("enter word");
            String word = input.next();
            if (word.length() % 2 == 0) {
                System.out.println("its even length");
            } else {
                System.out.println("its odd length");
            }
        }else{
            System.out.println("enter character");
            char letter = input.next().charAt(0);
            if(letter>='A'&&letter<='Z'){
                System.out.println("its upper case letter");
            }else if(letter>='a'&&letter<='z'){
                System.out.println("its a lower case letter");
            }
        }
    }
}
