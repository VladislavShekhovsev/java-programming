package day18_conditions_practice_strings_intro;

public class ScoreRangeTest {
    public static void main(String[] args) {
        /** 1-40=D
         * 40-60=C
         * 60-90=B
         * 90-100A
         * else = invalid score.
         */
        int num= 100;
        if(num>=1&&num<=40){
            System.out.println("score D");
        }else if(num>=41&&num<=60){
            System.out.println("score C");
        }else if(num>=61&&num<=90){
            System.out.println("score D");
        } else if(num>=91&&num<=100){
            System.out.println("score A");
        }else{
            System.out.println(num+" invalid score");
        }
    }

}
