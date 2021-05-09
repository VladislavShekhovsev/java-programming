package SelfPractice;

public class Examples {
    public static void main(String[] args) {
        String str ="Java";
        char letter ='a';
        int count =0;
        for(int i =0;i<str.length();i++){
            if(str.charAt(i)==letter){
                count++;
            }
        }
        System.out.println("was found "+count+" times in "+str);

    }
}
