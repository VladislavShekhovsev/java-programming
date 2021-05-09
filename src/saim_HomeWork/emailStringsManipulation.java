package saim_HomeWork;
import java.util.*;
public class emailStringsManipulation {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter two words");
        String wordOne = scan.nextLine();
        String wordTwo = scan.nextLine();
        String email ="secret";
        if(wordOne.length()>=6&&wordTwo.length()>=6){

            email  = wordOne.substring(0,4);
            email += wordTwo.substring(wordTwo.length()-3);
            email += "@Cybertek.com";
            System.out.println(email);
        }else{
            System.out.println("invalid data");
        }

    }
}

