package SelfPractice;
import com.sun.org.apache.xpath.internal.objects.XString;

import java.util.*;
public class ToUpperCasesOnlyThirstCars {

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            String email = scan.next();
            int underScore = email.indexOf("_");
            int at = email.indexOf("@");
            int dot = email.indexOf(".");
            String name = email.substring(0, 1).toUpperCase() + email.substring(1, underScore);
            String lastName = email.substring(underScore + 1, underScore + 2).toUpperCase() + email.substring(underScore + 2, at);
            String domain = email.substring(at + 1, dot);
            System.out.println("First name: " + name);
            System.out.println("Last name: " + lastName);
            System.out.println("Domain: " + domain);


        }
    }

