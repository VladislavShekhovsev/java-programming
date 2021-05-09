package day24_loops;

public class WhileLoopReverse {
    public static void main(String[] args) throws InterruptedException {
        int count = 5;
        while (count>=0){
            System.out.println("count = "+count);
            count--;}
         int unreadSmS = 10;
        System.out.println("i have total "+unreadSmS+"  unread sms");
        while(unreadSmS>0){
           Thread.sleep(10000);
            System.out.println("unread sms left "+unreadSmS);
            --unreadSmS;
        }


    }
}
