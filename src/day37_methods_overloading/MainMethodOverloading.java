package day37_methods_overloading;

import java.util.Arrays;

public class MainMethodOverloading {
    public static void main(String[] differentName) {
        System.out.println("hello  from real main method");
        main(5);
        /**overloading the main method
         * same name + different parameters
         * JDK does not look for this one to run*/
        System.out.println(Arrays.toString(differentName));

    }
    public static void main(int num){
        System.out.println("num = "+num);
    }
}
