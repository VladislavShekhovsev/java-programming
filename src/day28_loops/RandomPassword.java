package day28_loops;
import java.util.*;
public class RandomPassword {
    public static void main(String[] args) {
        String Source = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890_!@#$%^&*";
        Random random= new Random();
        String Password = "";
        for(int i =1;i<=8;i++){
            int index =random.nextInt(71);
         //   System.out.print(Source.charAt(index));
            Password+=(Source.charAt(index));
            //System.out.println(random.nextInt(Source.length()));

        }
        System.out.println("Password: "+Password);

    }

}
