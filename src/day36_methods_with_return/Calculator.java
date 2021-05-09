package day36_methods_with_return;

public class Calculator {
    public static void main(String[] args) {
        System.out.println(addDouble(5.5,70));
        double sum= addDouble(1,3.5);
        System.out.println("sum = "+sum);
        System.out.println("100.0+200.0 = "+addDouble(100,200));
        double sum2 =minusDouble(100,55.5);
        System.out.println(sum2);
        System.out.println("100 - 40.5 = "+minusDouble(100,40.5));

        System.out.println("437 * 2.5 = "+minusDouble(437,2.5));
        System.out.println("200 / 5 = "+divideDouble(200,5));
    }
    public static double addDouble(double num1,double num2){
        double sum =num1+=num2;
        return sum;
    }
    public static double minusDouble(double num1,double num2){
        double sum = num1-num2;
        return sum;
    }
    public static double multiplyDouble(double num1, double num2){
        double sum= num1*num2;
        return sum;
    }
    public static double divideDouble(double num1,double num2){
        double sum =num1/num2;
        return sum;
    }
}
