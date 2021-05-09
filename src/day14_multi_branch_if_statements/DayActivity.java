package day14_multi_branch_if_statements;

public class DayActivity {
    public static void main(String[] args) {
        String weather = "snowy";
        if (weather.equals("sunny")) {
            System.out.println("go to park, and code java");
        } else if (weather.equals("rainy")) {
            System.out.println("stay home, drink tea, and code java");
        } else if (weather.equals("snowy")) {
            System.out.println("clean the car then build snowman, drink hot chocolate, and code java");
        } else if (weather.equals("windy")) {
            System.out.println("stay at home, code java");
        } else {
            System.out.println("Code java anyway, love java.");
        }
    }
}
