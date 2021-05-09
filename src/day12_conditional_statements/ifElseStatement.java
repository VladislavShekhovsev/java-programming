package day12_conditional_statements;

public class ifElseStatement {
    public static void main(String[] args) {
        if(10>5) {
            System.out.println("CONDITION IS TRUE");
        }else{
            System.out.println("CONDITION IS FALSE"); }
            int count =25;
            //check if count is more then 30. if yes, print "count is more then 30"
            //otherwise print "count is less then 30"
            if(count>30) {
                System.out.println("COUNT IS MORE THEN 30");
            }else{
                System.out.println("COUNT IS LESS THEN 30");
            }
            byte age = 14;
            if (age>=18){
                System.out.println("ELIGIBLE TO VOTE ");
                System.out.println("AGE IS GREATER OR EQUAL TO 18");
            }else{
                System.out.println("NOT ELIGIBLE TO VOTE");
                System.out.println("AGE LESS 18");

            }

        }
    }

