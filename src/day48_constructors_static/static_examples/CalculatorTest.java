package day48_constructors_static.static_examples;

public class CalculatorTest {
    public static void main(String[] args) {
       Calculator.add(4,7);// add is static method
        //can be called using class name.staticMethodName

        // non static
        // need to create object to use this method
        Calculator calculate = new Calculator();
        calculate.multiply(4,7);
        // static method can also be called using objects
        // but intelij dont like it
        calculate.add(5,8);

    }
}
