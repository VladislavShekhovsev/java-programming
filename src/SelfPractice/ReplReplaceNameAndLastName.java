package SelfPractice;
import java.util.*;
public class ReplReplaceNameAndLastName {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String email = "Vlad_Shekhovsev@gmail.com";
       int first =email.indexOf("_");
        String name=(email.substring(0,first));
        int second = email.indexOf("@");
        String lastName =(email.substring(first+1,second));
        System.out.println(lastName+" "+name);

    }
}
