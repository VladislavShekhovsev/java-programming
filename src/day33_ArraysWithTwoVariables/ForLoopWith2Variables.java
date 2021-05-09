package day33_ArraysWithTwoVariables;

public class ForLoopWith2Variables {
    public static void main(String[] args) {
        for(int i =1,j=1;i<=4;i++,j++) {
            System.out.println("i = " + i + ",  j = " + j);//the condition in the middle control the loop. u can have as many variables u want
            // one condition comes to end, the loop ends exp: condition it middle i<=4
        }System.out.println();
            for(int i=1,j=5;j>=0;i++,j--){
                System.out.println("i = "+i+",  j = "+j);
            }

    }
}
