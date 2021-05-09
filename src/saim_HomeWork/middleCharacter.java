package saim_HomeWork;

public class middleCharacter {
    public static void main(String[] args) {
        String word = "apple";
        if(word.length()%2==1){
            System.out.println(word.charAt(word.length()/2));
            System.out.println(word.substring(word.length()/2,word.length()/2+1));
        }else{
           //even
            int index = word.length()/2;
            System.out.println(word.charAt(index-1)+""+word.charAt(index));
            System.out.println(word.substring(index-1,index));

        }
    }
}
