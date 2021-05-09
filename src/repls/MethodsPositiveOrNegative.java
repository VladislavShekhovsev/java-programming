package repls;
import java.util.*;
public class MethodsPositiveOrNegative {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        sign(n);

    }
    public static void sign(int num){

        if(num>0){
            System.out.println("positive");
        }else if(num<0){
            System.out.println("negative");
        }else{
            System.out.println("zero");
        }

    }
}
