package day24_loops;

public class YoutubeCatVideo {
    public static void main(String[] args) throws InterruptedException {
        int seconds =0;
        System.out.println("starting watching video about smallest cat \uD83D\uDC08 - bbc");
        while (seconds<=117){
        System.out.println("watching youtube video: "+seconds);
        seconds++;
        Thread.sleep(1000);//1000 miliseconds in second
        }
        int minutes =seconds/60;
        int remainingSec =seconds%60-1;
        System.out.println("we saw video about cat for "+minutes+":"+remainingSec);


    }
}
