package repls;

public class FindJava {
    public static void main(String[] args) {
        String word ="javaxjavaapplepearjavaegg";
        int count =0;
        for(int i =0;i<word.length()-3;i++){
            if (word.substring(i,i+4).contains("java")){
                count++;

            }

        }
        System.out.println(count);


    }
}
