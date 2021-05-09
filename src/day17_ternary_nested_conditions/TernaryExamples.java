package day17_ternary_nested_conditions;

public class TernaryExamples {
    public static void main(String[] args) {
        int score1 = 75;
        String result1;
        if (score1 > 60) {
            System.out.println("pass");
        } else {
            System.out.println("fail");
        }
        int score = 88;
        String quality = "good";
        String result = (score > 10) ? "pass" : "fail";
        System.out.println("result: " + result);
        int rating = (quality.equals("good")) ? 100 : 0;
        System.out.println(quality.equals("good") ? 100 : 0);
        System.out.println("quality rating : " + rating);
        char grade = (score > 90) ? 'A' : 'B';
        System.out.println("grade: "+grade);
        String evenOdd = (score % 2 == 0) ? "even" : "odd";
        System.out.println("number is "+evenOdd);


    }
}
