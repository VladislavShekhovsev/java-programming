package day50_inheritance;

public class StaticBlockTest {
    public static void main(String[] args) {
        StaticBlockDemo st1 = new StaticBlockDemo();// static 10 and 5 from constractor
        StaticBlockDemo st2 = new StaticBlockDemo();// 5 from constructor
        StaticBlockDemo st3 = new StaticBlockDemo();// 5 from constructor
        System.out.println(StaticBlockDemo.num);//=25
    }
}
