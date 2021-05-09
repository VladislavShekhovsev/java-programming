package saim_HomeWork;

public class PreFixAgain {
    public static void main(String[] args) {
        String  str = "abXabc";
        int n=3;
        String preFix =str.substring(0,n);// -> 0,2 =ab
        String remaining =str.substring(n); // from 3,like from X
        System.out.println(remaining.contains(preFix));

    }
}
