package repls;

public class Factorials {
    public static void main(String[] args) {
        int input =5;
        long sum =1;
        for(int i=input;i>0;i--){
            sum*=i;

        }
        System.out.println(sum);


    }
}
