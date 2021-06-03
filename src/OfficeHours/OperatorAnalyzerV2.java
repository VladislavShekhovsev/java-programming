package OfficeHours;

public class OperatorAnalyzerV2 {
    public static void main(String[] args) {
        int a = 10;
        int b = a - 5* 2 +a/2;
        // 10-5*2+10/2
        //10-10+10/2
        //10-10+5
        //+5
        //from left to right
        System.out.println("b = "+b);
    }
}
