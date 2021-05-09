package day25_loops;

import org.omg.CosNaming.IstringHelper;

public class ForLoopFirst {
    public static void main(String[] args) throws InterruptedException {
        /** below is infinite loop with for loop like while(true);
      for(;;){
          System.out.println("Java is fun");
      }*/
        for(int i =0;i<=5;i++) {
            //(initialization (declare variable+assign value/condition (boolean)as long is condition true,
            // it will repeat./updates)
            System.out.println("Hello world");
        }
            for(int s=1;s<=10;s++){
                System.out.print(s+" ");
                Thread.sleep(1000);}
                //initialization run first and only once
                //then program will check the condition
                //then the program wil do the command in the curly braces
                //then it will do the update
                //then condition again
                // then do the command in curly braces again
                // and then update again till the up update till feet the condition.
                   System.out.println();
                for(int a=1;a<=15;a++) {
                    System.out.print("\uD83C\uDF1F");
                }
                   System.out.println();
                    String myStars="";
                    for(int stars =1;stars<=5;stars++){
                        myStars+="\uD83C\uDF1F ";

                    }
                     System.out.println(myStars.trim());

            }
        }


