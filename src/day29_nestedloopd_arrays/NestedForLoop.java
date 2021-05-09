package day29_nestedloopd_arrays;

public class NestedForLoop {
    public static void main(String[] args) throws InterruptedException {
        for(int minutes = 1;minutes<=5;minutes++){ //  then inner reach 60 this one move by one
            System.out.println("\nminutes = "+minutes);
            for(int seconds =1;seconds<=60;seconds++){ //first inner loop complete its cycle and only then the outer loop make one iteration
               // System.out.print(seconds+"");
            }
        }
        for (int minutes =0;minutes<=4;minutes++){
            for(int seconds =1;seconds<=59;seconds++){
                Thread.sleep(1000);
                System.out.println(minutes+":"+seconds);
            }
        }
    }

}
