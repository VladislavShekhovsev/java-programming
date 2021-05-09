package repls;

public class SpitSentence {
    public static void main(String[] args) {
        String sentence = " i love Lera";
        String [] ArrSentence = sentence.split(" ");
        for (String each: ArrSentence) {
            System.out.println(each);
        }
    }
}
