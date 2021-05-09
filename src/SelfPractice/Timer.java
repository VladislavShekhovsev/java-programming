package SelfPractice;
import java.util.*;
public class Timer {
    public static void main(String[] args) throws InterruptedException {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter time:");
        int r = input.nextInt();
        for(int m=0; m<r;m++){

            for(int s=0;s<=59;s++){

                Thread.sleep(1000);
                System.out.println("time "+m+":"+s);
            }
        }
        System.out.println("HOMACHKA PORA SPAT !!!! ");

    }
}
