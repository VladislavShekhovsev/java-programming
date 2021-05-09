package day35_method_with_param;
import java.util.*;
public class MultipleParams {
    public static void main(String[] args) {
        showSum(10,5.5);
        showSum(1.7,10.5);
      Scanner input = new Scanner(System.in);
        System.out.println("Enter two numbers");
      double d1 = input.nextDouble();
      double d2 = input.nextDouble();
      showSum(d1,d2);
      buildEmail("vlad","gmail");
      buildEmail("vlad","gmail");
    }
    public static void showSum(double num1, double num2){
        System.out.println("Sum of two is: "+(num1+num2));
        System.out.println();
    }
    public static void buildEmail(String name, String domain){
        name=name.toLowerCase().replace(" ","");
        domain=domain.toLowerCase();
        System.out.println(name+"@"+domain+".com");
        System.out.println();
    }
}
