package day09_scanner_practice;

public class SalaryCalculatorv2 {
    public static void main(String[] args) {
        System.out.println("Enter hourly rate: ");
        double hourlyRate = 50.0;
        double weeklyPay = hourlyRate * 40;
        double monthlyPay = weeklyPay*52/12;
        double annualPay =monthlyPay *12;
        System.out.println("weekly pay; "+weeklyPay);
        System.out.println("monthlyPay; "+monthlyPay);
        System.out.println("Annual pay: "+annualPay);




    }
}
