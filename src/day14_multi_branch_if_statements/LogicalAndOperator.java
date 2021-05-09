package day14_multi_branch_if_statements;

public class LogicalAndOperator {
    public static void main(String[] args) {
        System.out.println(true && true);//true
        System.out.println(true&&false);//false
        System.out.println(false&&true);//false
        System.out.println(false&&false);//false
        System.out.println(10>5&&1==1);//true
        System.out.println(99<100&&22>25);//false because 22 is less then 25
        System.out.println(3<2&&5>2);//false because 3 is big then 2
        System.out.println(10>15&&15>10);
        int apples =10,oranges =5;
        boolean cheack = apples>5&&oranges>3;
        System.out.println("cheak; = "+cheack);
        if(apples>6&&oranges>2){
            System.out.println("i have enough ");
        }else{
            System.out.println("need to go to Walmart, and but some");
        }
    }
}
