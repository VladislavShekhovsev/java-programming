package day20_string_manipulation;

public class StringIsEmpty {
    public static void main(String[] args) {
        String jobTitle = "";
        System.out.println(jobTitle.isEmpty());//boolean
        System.out.println(jobTitle.length());//int
        System.out.println(jobTitle.length() == 0);// boolean
        if (jobTitle.isEmpty()) {
            System.out.println("job title missing, can u please resend ");
        } else {
            System.out.println("looks good");
        }
        if (jobTitle.length() == 0) {
            System.out.println("empty");
        }
        if (jobTitle.equals("")) {
            System.out.println("same true");
        }
        String word = " ";
        if (word.isEmpty()){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
        String veggie = "carrots";
        if(veggie.isEmpty()){
            System.out.println("empty");
        }else{
            System.out.println("we have "+veggie);
        }
        //if veggie is not empty,print we have carrot.
        String word2;
        //System.out.println(word2.isEmpty()); error because no value assigned. we was have to add = "value".
    }
}
