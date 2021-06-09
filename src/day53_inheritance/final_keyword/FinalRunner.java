package day53_inheritance.final_keyword;

public class FinalRunner {
    public static void main(String[] args) {
        System.out.println(TestData.ADMIN_USERNAME);
        //TestData.ADMIN_USERNAME="Change"; ERROR: cannot change the value of final variable.
        final int SSN = 432123433;
        //SSN=123456789; ERROR: cannot change final variable

    }
}
