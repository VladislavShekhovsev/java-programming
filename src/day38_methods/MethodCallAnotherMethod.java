package day38_methods;

public class MethodCallAnotherMethod {
    public static void main(String[] args) {
        start();
        continues();
        end();

    }
    public static void start(){
       continues();
        System.out.println("start");
    }
    public static void continues(){
       end();
        System.out.println("continue");
    }
    public static void end(){
        System.out.println("end");
    }
}
