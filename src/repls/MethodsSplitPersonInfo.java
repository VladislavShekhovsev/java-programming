package repls;

import java.util.Scanner;

public class MethodsSplitPersonInfo {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String s = inp.nextLine();
        person(s);
    }
    public static void person(String person){
       String [] details = person.split(",");
        System.out.println("person name: "+details[0]);
        System.out.println("last name: "+details[1]);
        System.out.println("age: "+details[2]);
    }
}
