package SelfPractice;

public class PrefixRepl {
    public static void main(String[] args) {
     String str = "zebraze";
     int n = 2;
        if(str.substring(n,str.length()).contains(str.substring(0,n))){
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        System.out.println(str.substring(0,str.length()));
    }
    }

