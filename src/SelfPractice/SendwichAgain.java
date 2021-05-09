package SelfPractice;
import java.util.*;
public class SendwichAgain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = "breadjembread";
        if(str.contains("bread")){
            System.out.println("one bread");
            int firstBread =str.indexOf("bread");
            if(str.substring(firstBread+5).contains("bread")){
                int secondBread = str.lastIndexOf("bread");
                System.out.println("second bread");
                System.out.println(str.substring(firstBread+5,secondBread));

            }else{
                System.out.println("nothing");
            }
        }else{
            System.out.println("nothing");
        }
    }
}
