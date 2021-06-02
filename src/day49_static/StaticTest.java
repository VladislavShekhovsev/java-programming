package day49_static;

public class StaticTest {
    String word ="java";
    static String word2 = "java";
    public static void main(String[] args) {

        //Static method
        StaticMethods.displayMessage("Wooden spoon");// will run just with class name.method
        //dont need object

        //instance method
       // StaticMethods.instanceMethod(); ERROR: Would not work without object because the method is not static


        StaticMethods stm = new StaticMethods();
        stm.instanceMethod();// would work because there is an object
        // static method have access only tto static variables
      //  System.out.println(word); would not work because word is not static
        System.out.println(word2);// will work because word2 is static

    }
}
