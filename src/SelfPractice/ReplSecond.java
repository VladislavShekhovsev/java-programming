package SelfPractice;

public class ReplSecond {
    public static void main(String[] args) {
        String mamba = "abdfca";
        // System.out.println(mamba.length() / 2);
        if (mamba.length() % 2 == 0 && mamba.length() > 2) {
            System.out.print(mamba.charAt(mamba.length() / 2-1)+""+mamba.charAt(mamba.length()/2));
            System.out.println(mamba.charAt(mamba.length()/2));

        }
        int a =1;
        int b = (a%2);
        System.out.println(b);
    }
}