package day48_constructors_static.static_examples;

public class Calculator {
    // static method
    public static void add(int num1,int num2){
        System.out.println(num1+num2);
    }
    // instance or object method
    // the only way to use this method
    // is to create an object
    // of this class
    public void multiply(int num1, int num2){
        System.out.println(num1*num2);
    }
}
