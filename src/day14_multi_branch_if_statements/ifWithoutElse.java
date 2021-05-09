package day14_multi_branch_if_statements;

public class ifWithoutElse {
    public static void main(String[] args) {
        int year = 2020;
        String result;
        if (year == 2020) {
            System.out.println("coronavirus");
           result = "wear mask";
        }else{
            System.out.println("v"); result = " no need mask";
        }
        System.out.println("be careful, keep distance "+result);
    }
}
