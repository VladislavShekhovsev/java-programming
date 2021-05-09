package day19_class_vs_object_strings;

public class StringLength {
    public static void main(String[] args) {
        String word = "java";
        System.out.println("java = "+word.length()+" letters");
        System.out.println("wooden spoon".length());
        System.out.println(word+"-"+word.length());
        int count = word.length();
        System.out.println("count "+count);//also double will work because length its int in its base.
        String password = "abc123";
        // if statement:when password is at least 6 characters, print out
        // valid amazon password, else password to short.
        if(password.length()>=6){
            System.out.println("valid pass");
            String countryCode = "il";

        }
    }
}
