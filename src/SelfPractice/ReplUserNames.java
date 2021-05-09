package SelfPractice;
import java.util.*;
public class ReplUserNames {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name;
        System.out.println("enter you name");
        name = input.nextLine();
        if(name.equalsIgnoreCase("max payne")||name.equalsIgnoreCase("vlad")){
            System.out.println("welcome");
        }else{
        System.out.println("invalid username");}
    }
}
