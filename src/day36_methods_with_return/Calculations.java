package day36_methods_with_return;

public class Calculations {
    public static void main(String[] args) {
        System.out.println("10 + 45 = "+Calculator.addDouble(10,45));
        System.out.println("78.4 - 60.5 = "+Calculator.minusDouble(78.4,60.5));
        System.out.println("35 /5 = "+Calculator.divideDouble(35,5));
        System.out.println("37 * 43 = "+Calculator.multiplyDouble(37,43));

        double d1 = 234.3;
        double d2 = 321.5;
        double result = Calculator.minusDouble(d1, d2);
        System.out.println("result = " + result);
    }
}
