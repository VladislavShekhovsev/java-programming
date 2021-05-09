package day37_methods_overloading;

public class VarArgs {
    public static void main(String[] args) {
    addNumber(2,3,4,35,7,67,8,9,9,7,988,9);
    addNumber(100,3,200,300,500);
    addNumber();// sum is zero
        //int...myNumber =10,2,7; error we use Var-Args only in methods.
    }
    public static void addNumber(int...nums)/** inside this method(...) its used like a regular array*/{
        int sum=0;
        for (int n : nums) {
            sum+=n;
        }
        System.out.println("sum = "+sum);

    }
}
