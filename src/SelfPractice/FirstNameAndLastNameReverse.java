package SelfPractice;
import java.util.*;
public class FirstNameAndLastNameReverse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String email = scan.next();

        if(email.contains("_")){
            int space =email.indexOf("_");
            String name = email.substring(0,space);
            int at = email.indexOf("@");
            String lastName = email.substring(space+1,at);
            System.out.println(lastName+"_"+name+"@gmail.com");
        } else {
            System.out.println(email);
        }
    }





}
