package day07_arithmetic_operators_casting;

public class DivisionProblem {
    public static void main(String[] args) {
        System.out.println(10/3);//3
        System.out.println(10.0/3.0);//3.333
        System.out.println(5/2);//2
        int num1=40, num2=15;
        System.out.println(num1/num2);//2
        System.out.println(5.0/2);//if decimal divided it will be decimal
        double d1=12.0, d2=3;
        System.out.println(d1/d2);
        double d3=12.0, d4= 5.0;
        System.out.println(d3/d4);
        int count=100;
        double dCount= 30.0;
        System.out.println(count/dCount);// also decimal
        /* PRIMITIVE CASTING
           PRIMITIVE  CONVERSION::
           int n1= 4;
           byte b1 = n1;
           The above line will show error,because int is larger data type
           int n1=4;
           byte b1=(byte)n1
           casted
         */

    }
}
