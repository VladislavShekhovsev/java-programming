package day28_loops;

public class BreakVsContinue {
    public static void main(String[] args) {
        // break statement
        for(int i =1;i<=5;i++){
            if(i==4){
               break; //continue;
            }
            System.out.print(i);
          //  break;

        }
        System.out.println();
        for(int i=1;i<=5;i++){

            if(i==3||i==4){
                continue;

            }
            System.out.print(i);// have to be after the continue in if block to work. continue porpece is to skip.
        }
    }
}
