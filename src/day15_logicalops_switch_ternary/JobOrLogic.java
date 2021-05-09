package day15_logicalops_switch_ternary;

public class JobOrLogic {
    public static void main(String[] args) {
        String company = "Google";
        int salary = 100_000;
        if (company.equals("Google") || salary >= 100000) {
            System.out.println("i take this job");
        } else {
            System.out.println("keep searching");
        }
    }
}