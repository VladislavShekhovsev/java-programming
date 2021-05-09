package day15_logicalops_switch_ternary;

public class GradeEvaluator {
    public static void main(String[] args) {
        char grade ='A';
        if ((grade == 'A'||grade=='a')|| (grade == 'B' ||grade=='b') ||(grade == 'C'||grade=='c')) {
            System.out.println("passed with grade " + grade);
        } else if (grade == 'D') {
            System.out.println("quality for retake");
        } else if (grade == 'E') {
            System.out.println("Fail");
        } else {
            System.out.println("Invalid grade");
        }
    }
}
