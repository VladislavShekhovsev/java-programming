package day35_method_with_param;

public class MethodWithParams {
    public static void main(String[] args) {
        displayValue(50);
        displayMsg("lora");
        displayMsg("everyone");
        displayValue(137);
        displayValue(77);
        int count =55; // assign other variable to parameter in custom  method
        displayValue(count);
        greedByName("Teodora");

    }
    public static void displayValue(int num){// assign variable inside and then u can just add value
        System.out.println("the value is:"+num);
    }
    public static void displayMsg(String word){
        System.out.println("hello "+word);
    }
    public static void greedByName(String name){
        System.out.println("Hello "+name+", how are you today ?");
    }
}
